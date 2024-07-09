package step4;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] num = new int[N];

		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}

		int v = sc.nextInt();

		int sum = 0;

		for (int j = 0; j < N; j++) {
			if (num[j] == v) {
				sum++;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
