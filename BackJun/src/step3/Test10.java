package step3;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			for (int j = 1; j < N - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				String star = "*";
				System.out.print(star);
				star += star;
			}
			System.out.println();
		}
		sc.close();
	}
}
