package sub1;

public class Shark extends Animal {

	@Override
	public void move() {
		System.out.println("Shark Swim...");
	}
	
	@Override
	public void hunt() {
		System.out.println("Shark hunt...");
	}
	
}
