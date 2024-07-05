package sub3;

/*
 * 날짜 : 2024/07/01
 * 이름 : 전규찬
 * 내용 : Java 메서드 타입 실습하기
 */
public class MethodTypeTest {

	public static void main(String[] args) {
		
		double t1 = type1(1.0);    // 타입1 - 매개변수 O, 리턴값 O
		type2(true); type2(false); // 타입2 - 매개변수 O, 리턴값 X 1,2
		boolean t3 = type3();      // 타입3 - 매개변수 X, 리턴값 O
		type4();                   // 타입4 - 매개변수 X, 리턴값 X 3
		
		System.out.println("t1 : " + t1); //4
		System.out.println("t3 : " + t3); //5

	}

	// 타입1 - 매개변수 O, 리턴값 O
	public static double type1(double x) {
		double y = (x * x) * Math.PI;
		return y;
	}

	// 타입2 - 매개변수 O, 리턴값 X
	public static void type2(boolean status) {
		
		if(status) {
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}
	}

	// 타입3 - 매개변수 X, 리턴값 O
	public static boolean type3() {
		int num1 = 1;
		int num2 = 2;
		
		if (num1 > num2) {
			return true;
		}else {
			return false;
		}
	}

	// 타입4 - 매개변수 X, 리턴값 X
	public static void type4() {
		
		double result = type1(5.0);
		System.out.println("반지름 길이가 5인 원의 넓이 : " + result); 
		
	}

}
