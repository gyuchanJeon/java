package sub6;

/*날짜 : 2024/07/09
이름 : 전규찬
내용 : 다형성 실습하기

다형성(Polymorphism)
뜻 - 상속관계에서 부모클래스의 기능을 자식클래스에서 다양한 기능으로 정의하는 특성
문법 - 객체(참조변수)의 타입 선언을 부모클래스 타입으로 선언(업캐스팅)
장점 - 다형성을 활용해서 효율적인 프로그래밍을 수행*/

public class PolyTest {

	public static void main(String[] args) {

		// 다형성 적용된 객체 생성(업캐스팅)
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();

		a1.move();
		a1.hunt();
		System.out.println();

		a2.move();
		a2.hunt();
		System.out.println();

		a3.move();
		a3.hunt();
		System.out.println();

		// 다운캐스팅
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;

		tiger.move();
		tiger.hunt();
		System.out.println();

		eagle.move();
		eagle.hunt();
		System.out.println();

		shark.move();
		shark.hunt();
		System.out.println();

		// 객체 타입 비교 연산
		if (a1 instanceof Tiger) {
			System.out.println("a1은 Tiger입니다.");
		}

		if (a2 instanceof Eagle) {
			System.out.println("a2은 Eagle입니다.");
		}

		if (a3 instanceof Shark) {
			System.out.println("a3은 Shark입니다.");
		}

		System.out.println();

		// 다형성을 활용한 객체배열
		Animal arr[] = { tiger, eagle, shark };

		for (Animal animal : arr) {
			animal.move();
			animal.hunt();
		}

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			arr[i].move();
			arr[i].hunt();
		}

		System.out.println();

		Dog dog = new Dog();
		Cat cat = new Cat();

		printSound(dog);
		printSound(cat);
	}

	public static void printSound(Pet pet) {
		pet.makeSound();
	}
}