package 스레드;

public class 카운터스레드 extends Thread {
	
	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("카운터 >> " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace(); //에러상황을 프린트, 안써줘도 됨!
			}
		}
	}
}
