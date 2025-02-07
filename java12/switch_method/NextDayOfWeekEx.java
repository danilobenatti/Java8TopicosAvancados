package switch_method;

import static java.time.DayOfWeek.*;
import static java.time.format.TextStyle.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Locale;

import javax.swing.JOptionPane;

public class NextDayOfWeekEx {
	
	public static void main(String[] args) {
		
		Locale locale = Locale.of("en", "US");
		
		String[] daysOfWeek = { MONDAY.getDisplayName(SHORT, locale),
				TUESDAY.getDisplayName(SHORT, locale),
				WEDNESDAY.getDisplayName(SHORT, locale),
				THURSDAY.getDisplayName(SHORT, locale),
				FRIDAY.getDisplayName(SHORT, locale),
				SATURDAY.getDisplayName(SHORT, locale),
				SUNDAY.getDisplayName(SHORT, locale) };
		
		int weekday = JOptionPane.showOptionDialog(null, "Choose a day of week",
				"What's next day?", 0, 3, null, daysOfWeek, null) + 1;
		
		LocalDate today = LocalDate.now(ZoneId.systemDefault());
		LocalDate nextDay;
		int i = 0;
		int j = 1;
		do {
			nextDay = today.plusDays(j++);
			i = nextDay.getDayOfWeek().getValue();
		} while (i != weekday);
		
		String dayOfWeek = nextDay.getDayOfWeek().getDisplayName(FULL, locale);
		JOptionPane.showMessageDialog(null,
				String.format("Next %s is %s", dayOfWeek, nextDay), "Result",
				JOptionPane.INFORMATION_MESSAGE, null);
		
	}
	
}
