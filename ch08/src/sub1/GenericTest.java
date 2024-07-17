package sub1;
/*
 * 날짜 : 2024/07/16
 * 이름 : 전규찬
 * 내용 : 제네릭 실습하기
 * 
 * 제네릭(Generic)
 *  - 클래스 내부 속성 타입을 동적으로 일반화 시키는 문법
 *  - 제네릭 문법으로 클래스를 범용성 있게 사용
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Apple a = new Apple("한국", 3000);
		Banana b = new Banana("일본", 3000);
		
		// 제네릭 클래스 생성할 때 치환변수 타입 선언
		FruitBox<Apple> box1 = new FruitBox<>();
		box1.setFruit(a);
		System.out.println(box1.getFruit());
		
		FruitBox<Banana> box2 = new FruitBox<>();
		box2.setFruit(b);
		System.out.println(box2.getFruit());
	}
}
