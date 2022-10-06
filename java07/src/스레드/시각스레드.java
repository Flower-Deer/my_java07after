package 스레드;

import java.util.Date;

public class 시각스레드 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			Date date = new Date();
			System.out.println(date);
			
			// 자바에서 cpu연결 -> 자바에서 외부자원연결시 위험!!! -> 에러발생
			// 위 대응책 ==> try/catch
			// cpu 1초 stop!!!
			try {
				Thread.sleep(1000); //1초
			} catch (InterruptedException e) {
				e.printStackTrace(); //에러상황을 프린트, 안써줘도 됨!
			}
		}
	}
}
