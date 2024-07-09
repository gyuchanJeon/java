package step4;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] a = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		int max = a[0];
		int min = a[0];

		for (int j = 1; j < a.length; j++) {
			if (a[j] > max) {
				max = a[j];
			}
			if (a[j] < min) {
				min = a[j];
			}
		}
		System.out.println(min + " " + max);
		sc.close();
	}
}
