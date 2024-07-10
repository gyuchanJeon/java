package step4;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[30];
		
		for (int index = 0; index < num.length; index++) {
			num[index] = index + 1;
		}
		
		for (int i = 0; i < 28; i++) {
			int n = sc.nextInt();
			num[n-1] = 0;
		}
		for (int j = 0; j < num.length; j++) {
			if (num[j] != 0) {
				System.out.println(j+1);
			}
		}
		sc.close();
	}
}
