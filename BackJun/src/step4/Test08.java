package step4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test08 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> remainders = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			int remainder = num % 42;
			remainders.add(remainder);
		}

		System.out.println(remainders.size());
		sc.close();
	}
}
