package Task1_3;

public class PascalTriangle {
	public static void printPascalTriangle(int row) {
		 for (int i = 0; i < row; i++) {
		        int num = 1;
		        for (int j = 0; j <= i; j++) {
		            System.out.print(num + " ");
		            num = num * (i - j) / (j + 1);
		        }
		        System.out.println();
		    }
	}

	public static int[] getPascalTriangle(int n) {

		return null;

	}

	public static int[] generateNextRow(int[] prevRow) {

		return null;
	}

	public static void main(String[] args) {
		int n = 5;
		printPascalTriangle(n);
	}
}