package step5;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < T; i++) {
			String str = new String(sc.nextLine());
			char first = str.charAt(0);
			char last = str.charAt(str.length() - 1);
			if (str.length() > 0) {
				System.out.println("" + first + last);
			}
		}
		sc.close();
	}
}
