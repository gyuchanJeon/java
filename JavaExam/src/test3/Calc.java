package test3;

class Calc {
	private static Calc instance = new Calc();
	
	private Calc() {}
	
	public static Calc getInstance() {
		return instance;
	}
	
	}
