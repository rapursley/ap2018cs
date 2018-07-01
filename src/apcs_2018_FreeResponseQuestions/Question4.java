package apcs_2018_FreeResponseQuestions;
// https://apcentral.collegeboard.org/pdf/ap18-frq-computer-science-a.pdf

import java.util.Arrays;

public class Question4 {

	public static void main(String[] args) {
		int[][] arr2D = { 	{ 0, 1, 2},
							{ 3, 4, 5},
							{ 6, 7, 8},
							{ 9, 5, 3} };
		for (int[] row : arr2D) {
			System.out.println(Arrays.toString(row));
		}
		int[] result = ArrayTester.getColumn(arr2D, 1);
		System.out.println("Column 1: " + Arrays.toString(result));
		System.out.println();
		
		int[][] example1 = {{1,2,3}, {2,3,1}, {3,1,2}};
		for (int[] row : example1) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println("isLatin? " + ArrayTester.isLatin(example1));
		System.out.println();
		
		int[][] example2 = {{10,30,20, 0}, {0,20,30,10}, {30,0,10,20}, {20,10,0,30}};
		for (int[] row : example2) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println("isLatin? " + ArrayTester.isLatin(example2));
		System.out.println();

		int[][] example3 = {{1,2,1}, {2,1,1}, {1,1,2}};
		for (int[] row : example3) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println("isLatin? " + ArrayTester.isLatin(example3));
		System.out.println();

		int[][] example4 = {{1,2,3}, {3,1,2}, {7,8,9}};
		for (int[] row : example4) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println("isLatin? " + ArrayTester.isLatin(example4));
		System.out.println();
		

		int[][] example5 = {{1,2}, {1,2}};
		for (int[] row : example5) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println("isLatin? " + ArrayTester.isLatin(example5));
		System.out.println();
		
	}

}
