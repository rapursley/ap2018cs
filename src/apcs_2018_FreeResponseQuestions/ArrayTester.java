package apcs_2018_FreeResponseQuestions;

public class ArrayTester {

	public static int[] getColumn(int[][] arr2D, int c) {
		int[] column = new int[arr2D.length];
		for(int row=0; row < arr2D.length; row++){
			column[row] = arr2D[row][c];
		}
		return column;
	}
	
	public static boolean hasAllValues(int[] arr1, int[] arr2){
		// returns true if and only if every value in arr1 appears in arr2.
		for (int i : arr1) {
			if(!inArr2(i, arr2)) return false;
		}
		return true;
	}

	private static boolean inArr2(int i, int[] arr2) {
		for (int j : arr2) {
			if (i == j) 
				return true;
		}
		return false;
	}
	
	public static boolean containsDuplicates(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) return true;				
			}
		}
		return false;
	}
	
	public static boolean isLatin(int[][] square) {
		int[] firstRow = square[0]; 
		if(containsDuplicates(firstRow)) return false;
		
		for(int row=1; row < square.length; row++){
			int[] otherRow = square[row];
			if(!hasAllValues(firstRow, otherRow)) return false;
		}
		
		for(int col=0; col < square.length; col++){
			int[] column = getColumn(square, col);
			if(!hasAllValues(firstRow, column)) return false;
		}
		return true;
	}

}
