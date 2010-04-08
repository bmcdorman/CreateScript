package createscript;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.antlr.runtime.RecognitionException;

public class Test {
	public static void main(String[] args) throws RecognitionException, IOException, URISyntaxException {
		URI resource = Test.class.getResource("test/test.script").toURI();
		CreateScriptLanguage language = new CreateScriptLanguage(new File(resource));
		System.out.println(language.parse());
	}
}
