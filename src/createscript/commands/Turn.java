package createscript.commands;

import createscript.CreateScriptParser;
import createscript.Script;

public class Turn extends CreateScriptCommand {
	public Turn() {
		super("turn", 4, false);
	}

	@Override
	public Script call(int[] params) {
		Script ret = new Script();
		int speed = params[3];
		
		if(params[0] == Constants.ANGLE || params[0] == Constants.CCW_ANGLE) {
			
			ret.add(137);
			ret.add((speed & 0x0000FF00) >> 8);
			ret.add((speed & 0x000000FF) >> 0);
			ret.add((1 & 0x0000FF00) >> 8);
			ret.add((1 & 0x000000FF) >> 0);
		}
		
		if(params[0] == Constants.CW_ANGLE) {
			ret.add(157);
			ret.add((speed & 0x0000FF00) >> 8);
			ret.add((speed & 0x000000FF) >> 0);
			ret.add(((short)-1 & 0xFF00) >> 8);
			ret.add(((short)-1 & 0x00FF) >> 0);
		}
		
		
		CreateScriptCommand wait = CreateScriptParser.commands.get("wait");
		int[] wP = {params[0], params[1]};
		ret.addAll(wait.call(wP));
		
		return ret;
	}
	
}
