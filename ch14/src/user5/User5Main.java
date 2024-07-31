package user5;

import java.util.List;
import java.util.Scanner;

public class User5Main {
	public static void main(String[] args) {

		System.out.println("-------------------------");
		System.out.println("User5 회원 관리 매니저 v1.0");
		System.out.println("-------------------------");

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.print("선택> ");

			int answer = sc.nextInt();

			if (answer == 0) {
				break;
			} else if (answer == 1) {

				System.out.print("아이디 입력 : ");
				int seq = sc.nextInt();

				System.out.print("이름 입력 : ");
				String name = sc.next();

				System.out.print("성별 입력 : ");
				String gender = sc.next();
				
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();

				System.out.print("주소 입력 : ");
				String addr = sc.next();

				User5VO vo = new User5VO(seq, name, gender, age, addr);

				User5DAO dao = User5DAO.getInstance();

				dao.insertUser(vo);

				System.out.println("입력 완료...");

			} else if (answer == 2) {

				User5DAO dao = User5DAO.getInstance();
				List<User5VO> users = dao.selectUsers();

				for (User5VO user : users) {
					System.out.println(user);
				}

			} else if (answer == 3) {

				System.out.print("검색 아이디 : ");
				int searchSeq = sc.nextInt();

				User5DAO dao = User5DAO.getInstance();
				User5VO user = dao.selectUser(searchSeq);

				System.out.println(user);

			} else if (answer == 4) {

				User5VO user = new User5VO();

				System.out.print("수정 회원 아이디 입력 : ");
				user.setSeq(sc.nextInt());

				System.out.print("수정 회원 이름 입력 : ");
				user.setName(sc.next());

				System.out.print("수정 회원 성별 입력 : ");
				user.setGender(sc.next());
				
				System.out.print("수정 회원 나이 입력 : ");
				user.setAge(sc.nextInt());
				
				System.out.print("수정 회원 주소 입력 : ");
				user.setAddr(sc.next());

				int result = User5DAO.getInstance().updateUser(user);

				if (result > 0) {
					System.out.println("수정 완료...");
				} else {
					System.out.println("수정할 회원 아이디가 없습니다.");
				}

			} else if (answer == 5) {

				System.out.println("삭제 회원 아이디 입력 : ");
				int seq = sc.nextInt();

				int result = User5DAO.getInstance().deleteUser(seq);

				if (result > 0) {
					System.out.println("삭제 완료...");
				} else {
					System.out.println("삭제할 회원 아이디가 없습니다.");
				}
			}
		}
		sc.close();
		System.out.println("프로그램 종료...");
	}
}
