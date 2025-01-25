package arrays;

import java.util.Arrays;

public class ParallelArraySorting {
	
	public static void main(String[] args) {
		
		int[] exemploArray = { 5, 8, 1, 7, 0, 6, 2, 9, 50, 4, -3 };
		
		for (int i : exemploArray) {
			System.out.print(i + " ");
		}
		
		System.out.printf("%n--- # ---%n");
		
		Arrays.parallelSort(exemploArray, 0, 5);
		for (int k : exemploArray) {
			System.out.print(k + " ");
		}
		
		System.out.printf("%n--- # ---%n");
		
		Arrays.parallelSort(exemploArray);
		for (int j : exemploArray) {
			System.out.print(j + " ");
		}
		
	}
	
}
