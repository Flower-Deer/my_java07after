package 상속;

public class 직장직원들 {

	public static void main(String[] args) {
		매니저 m = new 매니저();
		m.name = "김매니저";
		m.address = "김매니저주소";
		m.salary = 5000;
		m.rrn = 901213;
		m.bonus = m.salary + 3000;
		System.out.println(m);
		m.test();
		System.out.println("매니저 연봉 : " + m.bonus );
	}

}
