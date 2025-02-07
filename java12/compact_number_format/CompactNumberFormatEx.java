package compact_number_format;
import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Locale;

public class CompactNumberFormatEx {
	
	public static void main(String[] args) {
		
		NumberFormat numberFormat = NumberFormat
				.getCompactNumberInstance(Locale.of("pt", "BR"), Style.LONG);
		
		System.out.println(numberFormat.format(100));
		System.out.println(numberFormat.format(1000));
		System.out.println(numberFormat.format(10000));
		System.out.println(numberFormat.format(100000));
		System.out.println(numberFormat.format(1000000));
		
	}
	
}
