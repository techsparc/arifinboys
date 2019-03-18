package Class1;

public class FibonacciNum {
	public static void main(String[] args) {

		int a[] = { 10, 13, 21, 32, 61, 74 };

		for (int i = 0; i <= a.length - 1; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] + a[j] == a[i + 2]) {

					System.out.println("This is a fibonacci number:" + a[i + 2]);

				}
			}
		}
	}
}
