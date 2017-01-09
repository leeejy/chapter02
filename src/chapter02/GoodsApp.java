package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera=new Goods(); //기본 생성자 기본으로 만들어짐..?
//		camera.name = "nikon"; private은 외부에서 접근 X

		//protected는 같은 패키지에서 접근 가능, 또한 자식 클래스에서도 접근 가능
		camera.price = 4000000;
		camera.countSold = 100;
		
		//같ㅇ느 패키지 접근 가능
		camera.countStock = 50;
		
		

	}

}
