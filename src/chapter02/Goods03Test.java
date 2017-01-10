package chapter02;

public class Goods03Test {

	public static void main(String[] args) {
		Goods03 g = new Goods03();
		g.setName("N");
		g.setPrice(50000);
		g.setCountStock(555);
		g.setCountSold(3);
		
		//위의 코드 대신에 다음 생성자로 객체를 생성하면서 초기화
		Goods03 g2 = new Goods03("N",50000,555,3);
		
		System.out.println(g);
		System.out.println(g2);
	}

}
