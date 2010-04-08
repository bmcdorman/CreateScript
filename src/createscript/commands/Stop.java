package createscript.commands;

import createscript.Script;

public class Stop extends CreateScriptCommand {
	public Stop() {
		super("stop", 0, false);
	}

	@Override
	public Script call(int[] params) {
		Script ret = new Script();
		
		ret.add(137);
		ret.add(0);
		ret.add(0);
		ret.add(0);
		ret.add(0);
		
		return ret;
	}
	
}
