package step4;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] N = new int[9];

		for (int i = 0; i < 9; i++) {
			N[i] = sc.nextInt();
		}
		int k = 0;
		int max = N[0];
		for (int j = 1; j < N.length; j++) {
			if (max < N[j]) {
				max = N[j];
				k = j;
			}
		}
		System.out.println(max);
		System.out.println(k + 1);
		sc.close();
	}
}
