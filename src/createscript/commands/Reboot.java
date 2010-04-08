package createscript.commands;

import createscript.Script;

public class Reboot extends CreateScriptCommand {
	public Reboot() {
		super("reboot", 0, false);
	}

	@Override
	public Script call(int[] params) {
		Script ret = new Script();
		
		ret.add(7);
		
		return ret;
	}
	
}
