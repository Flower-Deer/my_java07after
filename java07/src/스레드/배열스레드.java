package 스레드;

public class 배열스레드 extends Thread {
	
	@Override
	public void run() {
		String[] s = {"커피","물","과자","국수","고구마"};
		for (int i = 0; i < s.length; i++) {
			System.out.println("음식이름>> " + s[i]);
			try {
				Thread.sleep(3000); //3초
			} catch (InterruptedException e) {
				e.printStackTrace(); //에러상황을 프린트, 안써줘도 됨!
			}
		}
	}
}
