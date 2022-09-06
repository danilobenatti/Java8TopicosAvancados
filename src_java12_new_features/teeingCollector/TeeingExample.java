package teeingCollector;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingExample {
	
	public static void main(String[] args) {
		
//		Collectors.teeing(sum, amount, average);
		
		Double collect = Stream.of(50, 10, 3, 19, 11, 22, 19).collect(
				Collectors.teeing(Collectors.summingDouble(i -> i),
						Collectors.counting(), (sum, amount) -> sum / amount));
		System.out.println(collect);
		
	}
	
}
