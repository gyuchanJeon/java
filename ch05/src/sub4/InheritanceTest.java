package sub4;

/*날짜 : 2024/07/09
이름 : 전규찬
내용 : 클래스 상속 실습하기*/

public class InheritanceTest {
	
	public static void main(String[] args) {
		
		// 상속 객체 생성
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		sonata.speedUp(100);
		sonata.speedDown(40);
		sonata.show();
		
		Truck bongo = new Truck("봉고", "남색", 0, 1000);
		bongo.speedUp(100);
		bongo.speedDown(20);
		bongo.show();
		
		// StockAccount 실습(bank, acc, name, balance, stock, amount, price)
		StockAccount kb = new StockAccount("KB증권", "101-11-1001", "홍길동", 10000, "삼성전자", 0, 50000);
		kb.deposit(1000000);
		kb.buy(20, 50000); // amount, price
		kb.sell(10, 50000); // amount, price
		kb.show();
		
		Doctor slump = new Doctor("슬럼프", 20, "외과");
		slump.work();
		
		Engineer Jeon = new Engineer("전규찬", 31, "백엔드");
		Jeon.work();
	}
}



