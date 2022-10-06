package 상속;

public class 원더우먼 extends 우먼{
	int Strong;
	
	public void 날다() {
		System.out.println("원더우먼 날다");
	}

	@Override
	public String toString() {
		return "원더우먼 [Strong=" + Strong + ", color=" + color + ", gender=" + gender + ", name=" + name + "]";
	}
	
	
}
