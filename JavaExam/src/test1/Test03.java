package test1;

/*날짜 : 2024/07/03
이름 : 전규찬
내용 : 자바 연산자 연습문제*/
public class Test03 {
	public static void main(String[] args) {

		int num = 1;
		int result = 0;

		result = num++; // 대입 연산 후 증가
		System.out.println("result : " + result);

		result = ++num; // 증가 연산 후 대입
		System.out.println("result : " + result);

		result = num--; // 대입 연산 후 감소
		System.out.println("result : " + result);

		result = --num; // 감소 연산 후 대입
		System.out.println("result : " + result);

	}
}
