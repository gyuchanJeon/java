package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class tet {
    public static void main(String[] args) {
        // try-with-resources 구문을 사용하여 자원을 자동으로 해제
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            // 첫 번째 숫자 입력 받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            String input = br.readLine();
            int a = Integer.parseInt(input); // 문자열을 정수로 변환

            // 두 번째 숫자 입력 받기
            System.out.print("두 번째 숫자를 입력하세요: ");
            input = br.readLine();
            int b = Integer.parseInt(input); // 문자열을 정수로 변환

            // 두 숫자의 합 계산
            int sum = a + b;

            // 결과 출력
            bw.write("두 숫자의 합은: " + sum);
            bw.newLine(); // 줄바꿈
            bw.flush(); // 버퍼의 내용을 출력
        } catch (IOException e) {
            // 예외 처리
            e.printStackTrace();
        }
    }
}



