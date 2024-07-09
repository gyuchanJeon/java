package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test06 {
	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			String s = br.readLine();

			int T = Integer.parseInt(s);
			for (int i = 0; i < T; i++) {
				String[] numbers = br.readLine().split(" ");
				int A = Integer.parseInt(numbers[0]);
				int B = Integer.parseInt(numbers[1]);
				bw.write((A + B) + "\n");
			}
			bw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
