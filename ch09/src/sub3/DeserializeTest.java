package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 날짜 : 2024/07/16
 * 이름 : 전규찬
 * 내용 : 역직렬화 실습하기
 */
public class DeserializeTest {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\lotte4\\Desktop\\apple.txt";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// 객체 역직렬화
			Apple apple = (Apple) ois.readObject();
			apple.show();
			
			// 스트림 해제
			fis.close();
			ois.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("프로그램 종료...");
	}
}
