package createscript.constants;
import createscript.CreateScriptParser;
import createscript.Unit;


public class CreateScriptConstant {
	protected CreateScriptConstant(String name, Unit unit) {
		CreateScriptParser.preDefs.put(name, unit);
	}
}
