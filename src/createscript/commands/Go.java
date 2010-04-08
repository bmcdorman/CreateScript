package createscript.commands;

import createscript.CreateScriptParser;
import createscript.Script;

public class Go extends CreateScriptCommand {
	public Go() {
		super("go", 3, false);
	}

	@Override
	public Script call(int[] params) {
		Script ret = new Script();
		
		int speed = params[2];
		
		ret.add(137);
		ret.add((speed & 0x0000FF00) >> 8);
		ret.add((speed & 0x000000FF) >> 0);
		ret.add((32767 & 0x0000FF00) >> 8);
		ret.add((32767 & 0x000000FF) >> 0);
		
		CreateScriptCommand wait = CreateScriptParser.commands.get("wait");
		int[] wP = {Constants.DISTANCE, params[0]};
		ret.addAll(wait.call(wP));
		
		return ret;
	}
	
}
