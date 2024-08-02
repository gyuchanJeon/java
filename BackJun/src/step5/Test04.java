package step5;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
            char character = input.charAt(0);
            int ascii = (int) character;
		
		System.out.println(ascii);
		
		sc.close();
	}
}
