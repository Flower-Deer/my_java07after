package 스레드;

public class 스레드사용 {

	public static void main(String[] args) {
		스레드1 use1 = new 스레드1();
		스레드2 use2 = new 스레드2();
		스레드3 use3 = new 스레드3();
		
		use1.start();
		use2.start();
		use3.start();
	}

}
