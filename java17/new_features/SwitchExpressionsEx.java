package new_features;

import java.io.PrintWriter;

public class SwitchExpressionsEx {
	
	public static void main(String[] args) {
		
		PrintWriter console = new PrintWriter(System.out, true);
		
		console.println(switchMethod("1"));
		console.println(switchMethod('1'));
		console.println(switchMethod(true));
		console.println(switchMethod(1));
		console.println(switchMethod(-1));
		console.println(switchMethod(1L));
		console.println(switchMethod(-1L));
		console.println(switchMethod(1f));
		console.println(switchMethod(-1f));
		console.println(switchMethod(1d));
		console.println(switchMethod(-1d));
		console.println(switchMethod(null));
		console.println(switchMethod(new Object()));
		console.close();
		
	}
	
	public static String switchMethod(Object object) {
		return switch (object) {
			case String s -> String.format("It's a string: %s", s);
			case Character c -> String.format("It's a char: %c", c);
			case Boolean b -> String.format("It's a boolean: %s", b);
			case Integer i when i >= 0 -> String.format("(+)Integer: %d", i);
			case Integer i when i < 0 -> String.format("(-)Integer: %d", i);
			case Long l when l >= 0 -> String.format("(+)Long: %d", l);
			case Long l when l < 0 -> String.format("(-)Long: %d", l);
			case Float f when f >= 0 -> String.format("(+)Float: %f", f);
			case Float f when f < 0 -> String.format("(-)Float: %f", f);
			case Double d when d >= 0 -> String.format("(+)Double: %f", d);
			case Double d when d < 0 -> String.format("(-)Double: %f", d);
			case null, default -> "Object not defined. ";
		};
	}
	
}
