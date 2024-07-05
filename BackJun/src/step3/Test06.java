package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test06 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int a = Integer.parseInt(s);
			int b = Integer.parseInt(s);
			bw.write(a+b);
		}
		bw.flush();
		bw.close();
	}
}
