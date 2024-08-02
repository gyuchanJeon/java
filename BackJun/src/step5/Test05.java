package step5;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int num = sc.nextInt();
		sc.nextLine();
		String data = sc.next();
		String[] arrs = data.split("");
		for (String arr : arrs) {
			sum += Integer.parseInt(arr);
		}

		System.out.println(sum);
		sc.close();
	}
}
