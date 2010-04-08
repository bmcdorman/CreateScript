package createscript;

import cbccore.create.Create;
import cbccore.create.commands.Command;

public class CBCJVMAdapter implements Command {
	private Script script = null;
	
	public CBCJVMAdapter(Script script) {
		this.script = script;
	}

	@Override
	public void add(Create create) {
		for(Integer i : script) {
			create.writeByte(i);
		}
	}
} 
