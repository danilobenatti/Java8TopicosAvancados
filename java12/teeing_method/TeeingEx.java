package teeing_method;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingEx {
	
	public static void main(String[] args) {
		
		/**
		 * Collectors.teeing(sum, quantity, average);
		 **/
		
		Double average = Stream.of(50, 10, 3, 19, 11, 22, 19, 30, 40)
				.collect(Collectors.teeing(Collectors.summingDouble(i -> i),
						Collectors.counting(),
						(sum, quantity) -> sum / quantity));
		System.out.println(average);
		
		Double avg1 = Stream.of(50, 10, 3, 19, 11, 22, 19, 30, 40)
				.collect(Collectors.averagingDouble(i -> i));
		System.out.println(avg1);
		
		Double avg2 = Stream
				.of("50", "10", "3", "19", "11", "22", "19", "30", "40")
				.collect(Collectors.averagingDouble(Double::parseDouble));
		System.out.println(avg2);
		
		Integer[] nums = { 50, 10, 3, 19, 11, 22, 19, 30, 40 };
		Double avg3 = Arrays.stream(nums).mapToInt(Number::intValue).average()
				.orElse(Double.NaN);
		System.out.println(avg3);
		
	}
	
}
