package 스레드;

public class Thread사용 {

	public static void main(String[] args) {
		//2. Thread객체 생성
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		//3. 2번객체로 start() 호출!
		t1.start();
		t2.start();
	}

}
