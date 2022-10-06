package 상속;

public class 우먼 extends 사람{
	String color;
	
	public void 색상() {
		System.out.println("좋아하는 핑크");
	}

	@Override
	public String toString() {
		return "우먼 [color=" + color + ", gender=" + gender + ", name=" + name + "]";
	}
	
	
}
