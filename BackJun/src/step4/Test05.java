package step4;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] basket = new int[N];
		int M = sc.nextInt();

		for (int a = 0; a < M; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			for (int b = i - 1; b < j; b++) {
				basket[b] = k;
			}
		}
		for (int bk : basket) {
			System.out.print(bk + " ");
		}
		sc.close();
	}
}
