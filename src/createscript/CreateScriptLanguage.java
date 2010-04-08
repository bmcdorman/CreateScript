package createscript;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.Tree;

import createscript.commands.*;

public class CreateScriptLanguage {
	static {
		new Wait();
		new Turn();
		new Constants();
		new Stop();
		new Reboot();
		new Go();
		new Write();
	}
	
	private String input = "";
	private boolean rebooted = false;
	
	public CreateScriptLanguage(String input) {
		this.input = input;
	}
	
	public CreateScriptLanguage(File input) throws IOException {
		FileReader in = new FileReader(input);
		char[] buffer = new char[(int)input.length()];
		in.read(buffer);
		this.input = new String(buffer);
	}
	
	public Script parse() throws RecognitionException {
		Script ret = new Script();
		CharStream stream = new ANTLRStringStream(input);
		CreateScriptLexer lexer = new CreateScriptLexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		CreateScriptParser parser = new CreateScriptParser(tokenStream);
		parser.variables.putAll(parser.preDefs);
		CreateScriptParser.script_return script = parser.script();
		
		
		for(int i = 0; i < script.tree.getChildCount(); ++i) {
			Tree child = script.tree.getChild(i);
			if(rebooted) {
				Logger.warning(child.getLine(), "Unreachable code (Called after a reboot)");
			} else {
				ret.addAll(parseLine(parser, child));
			}
		}

		if(!rebooted) {
			Logger.warning("You should add a reboot to the end of your script");
		}
		
		return ret;
	}
	
	private Script parseLine(CreateScriptParser parser, Tree line) {
		Script ret = new Script();
		
		int workingInt = 0;
		boolean working = false;
		
		CreateScriptCommand command = CreateScriptParser.commands.get(line.getText());
		
		if(command == null) {
			Logger.error(line.getLine(), "No such command " + line.getText());
		}
		
		if(command.getName().equals("reboot")) {
			rebooted = true;
		}
		
		int[] params = new int[command.getParamNumber()];
		int p = 0;
		
		for(int i = 0; i < line.getChildCount(); ++i) {
			
			Tree child = line.getChild(i);
			
			if(p >= params.length) {
				Logger.error(child.getLine(), "Too many arguments given to " + command.getName());
			}
			
			if(working) {
				params[p++] = resolveUnit(new Unit(workingInt, child.getType()));
				working = false;
			} else if(child.getType() == CreateScriptParser.INTEGER) {
				workingInt = Integer.parseInt(child.getText());
				working = true;
			} else {
				params[p++] = resolveVariable(parser, child);
			}
			
		}
		
		if(p != params.length && !command.canAcceptFewer()) {
			Logger.error(line.getLine(), "Too few arguments given to " + command.getName());
		}
		
		ret.addAll(command.call(params));
		return ret;
	}
	
	private int resolveVariable(CreateScriptParser parser, Tree ident) {
		Unit unit = parser.variables.get(ident.getText());
		
		if(unit == null) {
			Logger.error(ident.getLine(), "No such variable " + ident.getText());
		}
		
		return resolveUnit(unit);
	}
	
	private int resolveUnit(Unit unit) {
		if(unit == null) return 0;
		if(unit.getType() == CreateScriptParser.MM) {
			return unit.getValue();
		}
		
		if(unit.getType() == CreateScriptParser.CM) {
			return unit.getValue() * 10;
		}
		
		if(unit.getType() == CreateScriptParser.M) {
			return unit.getValue() * 1000;
		}
		
		if(unit.getType() == CreateScriptParser.MMS) {
			return unit.getValue();
		}
		
		if(unit.getType() == CreateScriptParser.CMS) {
			return unit.getValue() * 10;
		}
		
		if(unit.getType() == CreateScriptParser.DS) {
			return unit.getValue() * 100;
		}
		
		if(unit.getType() == CreateScriptParser.MS) {
			return unit.getValue() * 1000;
		}
		
		if(unit.getType() == CreateScriptParser.S) {
			return unit.getValue() * 1000;
		}
		
		return unit.getValue();
	}
	
}
