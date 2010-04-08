package createscript.commands;

import cbccore.create.commands.Events;
import createscript.CreateScriptParser;
import createscript.Logger;
import createscript.Script;
import createscript.Unit;

public class Wait extends CreateScriptCommand {
	
	static {
		CreateScriptParser.preDefs.put("advance", new Unit(Events.EVENT_ADVANCE_BUTTON, 0));
		CreateScriptParser.preDefs.put("play", new Unit(Events.EVENT_PLAY_BUTTON, 0));
		CreateScriptParser.preDefs.put("bump", new Unit(Events.EVENT_BUMP, 0));
		CreateScriptParser.preDefs.put("leftBump", new Unit(Events.EVENT_LEFT_BUMP, 0));
		CreateScriptParser.preDefs.put("rightBump", new Unit(Events.EVENT_RIGHT_BUMP, 0));
		CreateScriptParser.preDefs.put("cliff", new Unit(Events.EVENT_CLIFF, 0));
		CreateScriptParser.preDefs.put("leftCliff", new Unit(Events.EVENT_LEFT_CLIFF, 0));
		CreateScriptParser.preDefs.put("rightCliff", new Unit(Events.EVENT_RIGHT_CLIFF, 0));
		CreateScriptParser.preDefs.put("drop", new Unit(Events.EVENT_WHEEL_DROP, 0));
		CreateScriptParser.preDefs.put("leftDrop", new Unit(Events.EVENT_LEFT_WHEEL_DROP, 0));
		CreateScriptParser.preDefs.put("rightDrop", new Unit(Events.EVENT_RIGHT_WHEEL_DROP, 0));
		CreateScriptParser.preDefs.put("wall", new Unit(Events.EVENT_WALL, 0));
		CreateScriptParser.preDefs.put("virtualWall", new Unit(Events.EVENT_VIRTUAL_WALL, 0));
		CreateScriptParser.preDefs.put("oiPassive", new Unit(Events.EVENT_OI_MODE_PASSIVE, 0));
		CreateScriptParser.preDefs.put("home", new Unit(Events.EVENT_HOME_BASE, 0));
	}
	
	public Wait() {
		super("wait", 2, false);
	}

	@Override
	public Script call(int[] params) {
		Script ret = new Script();
		
		if(params[0] == Constants.EVENT) {
			int event = params[1];
			
			if(event < 0) event += 256;
			
			ret.add(128);
			ret.add(event);
			return ret;
		}
		
		if(params[0] == Constants.DISTANCE) {
			int mm = params[1];
			ret.add(156);
			ret.add((mm & 0x0000FF00) >> 8);
			ret.add((mm & 0x000000FF) >> 0);
		}
		
		if(params[0] == Constants.ANGLE || params[0] == Constants.CCW_ANGLE) {
			int deg = params[1];
			ret.add(157);
			ret.add((deg & 0x0000FF00) >> 8);
			ret.add((deg & 0x000000FF) >> 0);
		}
		
		if(params[0] == Constants.CW_ANGLE) {
			int deg = -params[1];
			ret.add(157);
			ret.add((deg & 0x0000FF00) >> 8);
			ret.add((deg & 0x000000FF) >> 0);
		}
		
		if(params[0] == Constants.TIME) {
			int ms = params[1];
			ret.add(155);
			ret.add(ms / 100);
		}
		
		return ret;
	}
	
}
