package sub2;

/*
 * 날짜 : 2024/07/01
 * 이름 : 전규찬
 * 내용 : Java 메서드 실습하기
 */

public class MethodTest {

	// main 메서드 - 프로그램 시작점/진입점
	public static void main(String[] args) {

		// 메서드 호출(call)
		int y1 = f(1); // 인자값 1 을 전달해서 f메서드 호출
		int y2 = f(2); 
		int y3 = f(3);
		
		int k1 = sum(0, 5);
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		
		System.out.println("k1 : " + k1);
	}

	// 메서드(함수) 정의(define)
	public static int f(int x) { // 전달되는 인자값을 매개변수 x로 받아서 메서드 실행
		int y = 2 * x + 3;
		return y; // 메서드를 호출한 쪽으로 반환값 리턴
	}

	// 메서드 정의
	public static int sum(int start, int end) {
		
		// 지역변수 : 메서드 안에서 선언된 변수
		int total = 0;
		
		for (int k = start ; k <= end ; k++) {
			
			total += k;
		}
		
		return total;
	}
	
}

