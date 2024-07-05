package step2;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a == b && b == c && c == a) {
			System.out.println(10000 + 1000 * a);
		} else if (a != b && b != c && c != a) {
			if (a > b && a > c) {
				System.out.println(100 * a);
			}
			if (b > a && b > c) {
				System.out.println(100 * b);
			}
			if (c > a && c > b) {
				System.out.println(100 * c);
			}
		} else if (a == b) {
			System.out.println(1000 + 100 * a);
		} else if (b == c) {
			System.out.println(1000 + 100 * b);
		} else if (c == a) {
			System.out.println(1000 + 100 * c);
		}
		sc.close();
	}
}
