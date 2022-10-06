package 상속;

public class 상속사용 {

	public static void main(String[] args) {
		사람 p = new 사람();
		p.gender = "남자";
		p.name = "클라크";
		System.out.println(p);
		
		맨 m = new 맨();
		m.gender = "남자";
		m.name = "데이비드";
		m.size = 300;
		System.out.println(m);
		
		수퍼맨 sMan = new 수퍼맨();
		sMan.gender = "남자";
		sMan.name = "윌리엄";
		sMan.size = 200;
		System.out.println(sMan);
		sMan.날아다니다(); //수퍼맨에서 추가
		sMan.달리다(); //맨
		sMan.먹다(); //사람
		sMan.잠자다(); //사람
		
		우먼 g = new 우먼();
		g.color = "pink";
		g.gender = "여성";
		g.name = "우먼!";
		System.out.println(g);
		
		원더우먼 wg = new 원더우먼();
		wg.color = "red";
		wg.gender = "여자";
		wg.name = "원더우먼!!!";
		wg.Strong = 1000;
		System.out.println(wg);
		wg.날다();
		wg.먹다();
		wg.색상();
		wg.잠자다();
	}

}
