package interview;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class abc {

	public static void main(String args[]) {

		ScriptEngineManager sc = new ScriptEngineManager();

		ScriptEngine p = sc.getEngineByExtension("nashorn");

		String name = "John";

		Integer ss = null;

		try {

			p.eval("print(" + name + ")");

			ss = (Integer)eval("14+12");

		} catch (ScriptException e) {
			System.out.print("Exception Caugh");
		}

		System.out.print(ss.toString());
	}





}
