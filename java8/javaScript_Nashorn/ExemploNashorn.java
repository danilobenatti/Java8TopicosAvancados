package javaScript_Nashorn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ExemploNashorn {
	
	public static void main(String[] args) {
		
		ScriptEngine engine = new ScriptEngineManager()
				.getEngineByName("Nashorn");
		
		Bindings bindings = engine.getBindings(ScriptContext.ENGINE_SCOPE);
		
		bindings.put("goodbye", "Até logo!!!");
		
		try {
			engine.eval(new FileReader(
					new File("src/javaScript_Nashorn/OlaMundo.js")
							.getAbsoluteFile()));
		} catch (FileNotFoundException | ScriptException e) {
			e.printStackTrace();
		}
	}
	
}
