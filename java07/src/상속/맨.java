package 상속;

//왼쪽 자녀 오른쪽 부모
public class 맨 extends 사람 {
	//멤버변수 2개 //멤버메서드 10(2+(기존)8)개 가지고 시작
	
	//멤버변수 1개추가
	int size;
	//멤버메소드 1개추가
	public void 달리다() {
		System.out.println("빨리 달리다.");
	}
	
	//'상속받은'것까지 포함하여 작성
	@Override
	public String toString() {
		return "맨 [size=" + size + ", gender=" + gender + ", name=" + name + "]";
	}
}
