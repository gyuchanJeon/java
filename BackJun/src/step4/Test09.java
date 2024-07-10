package step4;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arrs = new int[N];

		// index 값 입력
		for (int n = 0; n < N; n++) {
			arrs[n] = n + 1;
		}

		for (int a = 0; a < M; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			for (int start = i - 1, end = j - 1; start < end; start++, end--) {
				int swap = arrs[start];
				arrs[start] = arrs[end];
				arrs[end] = swap;
			}
		}

		for (int arr : arrs) {
			System.out.print(arr + " ");
		}
		sc.close();
	}
}
