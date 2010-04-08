package createscript.commands;

import createscript.CreateScriptParser;
import createscript.Script;

public abstract class CreateScriptCommand {
	private int numParams = 0;
	private String name = "";
	private boolean canAcceptFewer = false;
	
	protected CreateScriptCommand(String name, int numParams, boolean canAcceptFewer) {
		this.name = name;
		this.numParams = numParams;
		this.canAcceptFewer = canAcceptFewer;
		CreateScriptParser.commands.put(name, this);
	}
	
	public abstract Script call(int[] params);
	
	public int getParamNumber() {
		return numParams;
	}
	
	public boolean canAcceptFewer() {
		return canAcceptFewer;
	}
	
	public String getName() {
		return name;
	}
}
