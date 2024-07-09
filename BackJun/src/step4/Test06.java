package step4;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] basket = new int[N];
		for (int bk = 0; bk < N; bk++) {
			basket[bk]= bk+1;
		}
		int M = sc.nextInt();
		int change;

		for (int a = 0; a < M; a++) {
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			change = basket[i];
			basket[i] = basket[j];
			basket[j] = change;
		}

		for (int b = 0; b < N; b++) {
			System.out.print(basket[b] + " ");
		}
		sc.close();
	}
}
