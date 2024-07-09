package step3;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			if (sc.hasNextInt()) {
				int A = sc.nextInt();
				int B = sc.nextInt();
				System.out.println(A + B);
			} else {
				sc.close();
				break;
			}
		}
	}
}
