package sub1;

import java.util.Scanner;

public class t1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a==b && b==c) {
			System.out.println(10000 + 1000*a);
		} else if (a!=b && b!=c && c!=a) {
			System.out.println();
		}
		
		
		sc.close();
	}
}