package step5;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int i = sc.nextInt();
		System.out.println(S.charAt(i-1));
		sc.close();
	}
}
