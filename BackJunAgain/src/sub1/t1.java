package sub1;

import java.util.Scanner;

public class t1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if (m<45 && m>0) {
			if (h==0) {
				System.out.println(23+" "+(15+m));
			} else {
				System.out.println((h-1)+" "+(15+m));
			}
		} else if (m>=45 && m<=59) {
			System.out.println(h+" "+(m-45));
		}
		
		
		
		sc.close();
	}
}