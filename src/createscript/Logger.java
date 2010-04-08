package createscript;

public class Logger {
	public static void error(int line, String message) {
		System.err.println("Error: Line " + line + ": " + message);
		System.exit(1);
	}
	
	public static void error(String message) {
		System.err.println("Error: " + message);
		System.exit(1);
	}
	
	public static void warning(int line, String message) {
		System.out.println("Warning: Line " + line + ": " + message);
	}
	
	public static void warning(String message) {
		System.out.println("Warning: " + message);
	}
}
