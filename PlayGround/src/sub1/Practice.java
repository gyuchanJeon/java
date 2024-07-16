package sub1;

public class Practice {
	
	public static void main(String[] args) {
		
		String phrase1 = "No pain, no gain";
		String phrase2 = new String("No pain, no gain");
		
		if (phrase1 == phrase2) {
			System.out.println("주소값이 같다");
		} else {
			System.out.println("주소값이 다르다");
		}
		
		if (phrase1.equals(phrase2)) {
			System.out.println("문자열이 같다");
		} else {
			System.out.println("문자열이 다르다");
		}
		
		System.out.println("phrase1의 길이는? " + phrase1.length());
		
		char c1 = phrase1.charAt(0);
		char c2 = phrase1.charAt(7);
		System.out.println("첫 번째 스펠링은? " + c1);
		System.out.println("여덟 번째 스펠링은? " + c2);
		
		String substr1 = phrase1.substring(0, 8);
		String substr2 = phrase1.substring(9);
		System.out.println("1~8번 스펠링은? " + substr1);
		System.out.println("10~마지막 스펠링은? " + substr2);
		
		int idx1 = phrase1.indexOf("a");
		int idx2 = phrase1.lastIndexOf("a");
		System.out.println("첫 a는? " + idx1);
		System.out.println("마지막 a는? " + idx2);
		
		String[] divide = phrase1.split(",");
		for(String div : divide) {
			System.out.println(div);
		}
		
		String replc1 = phrase1.replace("pain", "pay");
		String replc2 = phrase1.replace("No", "Yes");
		System.out.println(replc1);
		System.out.println(replc2);
		
		
		int v1 = 1;
		double v2 = 3.14;
		boolean v3 = false;
		
		String s1 = String.valueOf(v1);
		String s2 = String.valueOf(v2);
		String s3 = String.valueOf(v3);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		
		
	}
	
	
}
