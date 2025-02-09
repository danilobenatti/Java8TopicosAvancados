package switch_method;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class SwitchWithYieldEx {
	
	public static void main(String[] args) {
		
		ZoneId zoneid = ZoneId.of("America/Sao_Paulo");
		LocalDate now = LocalDate.now(zoneid);
		
		DayOfWeek dayOfWeek = now.getDayOfWeek();
		
		Locale locale = Locale.of("en", "US");
		String str = dayOfWeek.getDisplayName(TextStyle.FULL, locale);
		
		String result = switch (dayOfWeek) {
			case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
				yield String.format("it's work day \\o/ (%s)", str);
			case SATURDAY, SUNDAY:
				yield String.format("it´s weekend! (%s)", str);
			default:
				yield "Invalid day!";
		};
		System.out.println("What day of week it's today?: " + result);
		
	}
	
}
