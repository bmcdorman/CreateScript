package createscript;

public class Unit {
	private int value = 0;
	private int type = 0;
	
	public Unit(int value, int type) {
		this.value = value;
		this.type = type;
	}
	
	public int getValue() {
		return value;
	}
	
	public int getType() {
		return type;
	}
	
	public String toString() {
		return "Unit [value = " + value + ", type = " + type + "]";
	}
}
