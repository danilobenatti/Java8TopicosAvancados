package switch_method;

import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class SwitchExample {
	
	public static void main(String[] args) {
		
		PrintWriter console = new PrintWriter(System.out, false);
		
		console.println("--- #1# ---");
		console.println(formatter(1));
		console.println(formatter(18L));
		console.println(formatter(1.8f));
		console.println(formatter(1.8));
		console.println(formatter("1.8"));
		console.println(formatter('A'));
		console.println(formatter(true));
		
		console.println("--- #2# ---");
		console.println(formatterPatternSwitch(1));
		console.println(formatterPatternSwitch(18L));
		console.println(formatterPatternSwitch(1.8F));
		console.println(formatterPatternSwitch(1.8));
		console.println(formatterPatternSwitch("1.8"));
		console.println(formatterPatternSwitch('A'));
		console.println(formatterPatternSwitch(true));
		
		console.println("--- #3# ---");
		console.println(switchMonth(Month.JULY));
		console.println(switchMonth(Month.FEBRUARY));
		console.println(switchMonth(Month.AUGUST));
		console.println(switchDayOfWeek());
		console.println(switchDayOfWeek(LocalDate.of(2025, 2, 8)));
		
		console.println("--- #4# ---");
		console.println(newSwitch(1));
		console.println(newSwitch(18L));
		console.println(newSwitch(1.8f));
		console.println(newSwitch(1.8));
		console.println(newSwitch("1.8"));
		console.println(newSwitch('A'));
		console.println(newSwitch(true));
		console.println(newSwitch(null));
		console.println(newSwitch(new Person("User", LocalDate.now())));
		
		console.close();
		
	}
	
	static String formatter(Object object) {
		String formatted = "unknow";
		if (object instanceof Integer i) {
			formatted = String.format("int %d", i);
		} else if (object instanceof Long l) {
			formatted = String.format("long %d", l);
		} else if (object instanceof Float f) {
			formatted = String.format("float %f", f);
		} else if (object instanceof Double d) {
			formatted = String.format("double %f", d);
		} else if (object instanceof String s) {
			formatted = String.format("string %s", s);
		} else if (object instanceof Character s) {
			formatted = String.format("char %s", s);
		} else if (object instanceof Boolean s) {
			formatted = String.format("boolean %s", s);
		}
		return formatted;
	}
	
	static String formatterPatternSwitch(Object object) {
		String simpleName = object.getClass().getSimpleName();
		return switch (simpleName) {
			case "Integer" -> String.format("%s", simpleName);
			case "Long" -> String.format("%s", simpleName);
			case "Float" -> String.format("%s", simpleName);
			case "Double" -> String.format("%s", simpleName);
			case "String" -> String.format("%s", simpleName);
			case "Character" -> String.format("%s", simpleName);
			case "Boolean" -> String.format("%s", simpleName);
			default -> null;
		};
	}
	
	static int switchMonth(Month month) {
		return switch (month) {
			case JANUARY, JUNE, JULY -> 3;
			case FEBRUARY, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER -> 1;
			case MARCH, MAY, APRIL, AUGUST -> {
				int monthLength = month.toString().length();
				yield monthLength * 4;
			}
			default -> 0;
		};
	}
	
	static String switchDayOfWeek() {
		LocalDate now = LocalDate.now();
		DayOfWeek dayOfWeek = DayOfWeek.from(now);
		return switch (dayOfWeek) {
			case SUNDAY, SATURDAY -> "Weekend";
			case FRIDAY, THURSDAY, WEDNESDAY, TUESDAY, MONDAY -> "Workday";
		};
	}
	
	static String switchDayOfWeek(LocalDate date) {
		DayOfWeek dayOfWeek = DayOfWeek.from(date);
		return switch (dayOfWeek) {
			case SUNDAY, SATURDAY -> "Weekend";
			case FRIDAY, THURSDAY, WEDNESDAY, TUESDAY, MONDAY -> "Workday";
		};
	}
	
	static String newSwitch(Object object) {
		return switch (object) {
			case Integer i -> String.format("It is an integer %d", i);
			case Long l -> String.format("It is an long %d", l);
			case Float f -> String.format("It is an float %f", f);
			case Double d -> String.format("It is an double %f", d);
			case String s -> String.format("It is a string %s", s);
			case Character c -> String.format("It is a char %s", c);
			case Boolean b -> String.format("It is a boolean %s", b);
			case Person p -> String.format("It is a person %s", p);
			case null -> "It is a null object";
			default -> {
				object.toString();
				yield "Object not defined.";
			}
		};
	}
	
	static class Person {
		
		private String name;
		private LocalDate birthday;
		
		public Person(String name, LocalDate birthday) {
			this.name = name;
			this.birthday = birthday;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public LocalDate getBirthday() {
			return birthday;
		}
		
		public void setBirthday(LocalDate birthday) {
			this.birthday = birthday;
		}
		
		@Override
		public String toString() {
			return new StringBuilder().append(getName()).append(", ")
					.append(getBirthday()).toString();
		}
		
	}
}
