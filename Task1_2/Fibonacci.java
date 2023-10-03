package Task1_2;

public class Fibonacci {
	public static int getFibonacci(int n) {
		if (n < 0) {
			return -1;
		} else if (n == 0 || n == 1) {
			return n;
		} else {
			return getFibonacci(n - 1) + getFibonacci(n - 2);
		}
	}

	public static void printFibonacci(int n) {
		for (int i = 0; i <= n; i++) {
			System.out.print(getFibonacci(i) + " ");
		}
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println(getFibonacci(n));
		System.out.println("--------");
		printFibonacci(n);
	}
}
