package step4;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] arrs = new double[N];
		double max = 0;
		double sum = 0;
		for (int i = 0; i < N; i++) {
			double score = sc.nextInt();
			arrs[i] = score;
			if (score > max) {
				max = score;
			}
		}

		for (int j = 0; j < N; j++) {
			double newscore = arrs[j] / max * 100;
			sum = sum + newscore;
		}
		System.out.println(sum / N);
		sc.close();
	}
}
