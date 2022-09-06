package compactNumberFormat;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Locale;

public class CompactNumberFormatExample {
	
	public static void main(String[] args) {
		
		int number = 500000000;
		
		Locale localeUS = Locale.US;
		String language = "pt";
		String country = "BR";
		Locale localeBR = new Locale(language, country);
		
		Style formatStyle1 = Style.LONG;
		Style formatStyle2 = Style.SHORT;
		
		NumberFormat numberFormat1 = CompactNumberFormat
				.getCompactNumberInstance(localeUS, formatStyle1);
		System.out.println(numberFormat1.format(number));
		
		NumberFormat numberFormat2 = CompactNumberFormat
				.getCompactNumberInstance(localeBR, formatStyle2);
		System.out.println(numberFormat2.format(number));
		
	}
	
}
