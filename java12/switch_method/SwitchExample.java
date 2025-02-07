package switch_method;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class SwitchExample {
	
	public static void main(String[] args) {
		
		System.out.println("--- #1# ---");
		System.out.println(formatter(1));
		System.out.println(formatter(18L));
		System.out.println(formatter(1.8f));
		System.out.println(formatter(1.8));
		System.out.println(formatter("1.8"));
		System.out.println(formatter('A'));
		System.out.println(formatter(true));
		
		System.out.println("--- #2# ---");
		System.out.println(formatterPatternSwitch(1));
		System.out.println(formatterPatternSwitch(18L));
		System.out.println(formatterPatternSwitch(1.8F));
		System.out.println(formatterPatternSwitch(1.8));
		System.out.println(formatterPatternSwitch("1.8"));
		System.out.println(formatterPatternSwitch('A'));
		System.out.println(formatterPatternSwitch(true));
		
		System.out.println("--- #3# ---");
		System.out.println(switchMonth(Month.JULY));
		System.out.println(switchMonth(Month.FEBRUARY));
		System.out.println(switchMonth(Month.AUGUST));
		System.out.println(switchDayOfWeek());
		System.out.println(switchDayOfWeek(LocalDate.of(2025, 2, 8)));
		
		System.out.println("--- #4# ---");
		System.out.println(newSwitch(1));
		System.out.println(newSwitch(18L));
		System.out.println(newSwitch(1.8f));
		System.out.println(newSwitch(1.8));
		System.out.println(newSwitch("1.8"));
		System.out.println(newSwitch('A'));
		System.out.println(newSwitch(true));
		System.out.println(newSwitch(null));
		System.out.println(newSwitch(new Person("User", LocalDate.now())));
		
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
			default -> object.toString();
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
