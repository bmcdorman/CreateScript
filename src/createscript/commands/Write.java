package createscript.commands;

import createscript.Script;

public class Write extends CreateScriptCommand {
	public Write() {
		super("write", 1, false);
	}

	@Override
	public Script call(int[] params) {
		Script ret = new Script();
		
		int b = params[0];
		
		ret.add(b);
		
		return ret;
	}
	
}
