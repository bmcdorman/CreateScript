package createscript.commands;

import createscript.CreateScriptParser;
import createscript.Unit;

public class Constants {
	static {
		CreateScriptParser.preDefs.put("event", new Unit(Constants.EVENT, 0));
		CreateScriptParser.preDefs.put("distance", new Unit(Constants.DISTANCE, 0));
		CreateScriptParser.preDefs.put("angle", new Unit(Constants.ANGLE, 0));
		CreateScriptParser.preDefs.put("cw", new Unit(Constants.CW_ANGLE, 0));
		CreateScriptParser.preDefs.put("ccw", new Unit(Constants.CCW_ANGLE, 0));
		CreateScriptParser.preDefs.put("at", new Unit(Constants.AT, 0));
		CreateScriptParser.preDefs.put("time", new Unit(Constants.TIME, 0));
	}
	
	public static final int EVENT = 1000;
	public static final int DISTANCE = 1001;
	public static final int ANGLE = 1002;
	public static final int CW_ANGLE = 1003;
	public static final int CCW_ANGLE = 1004;
	public static final int TIME = 1005;
	public static final int AT = 1006;
}
