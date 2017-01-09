package chapter02;

public class GoodsApp02 {

	public static void main(String[] args) {
		Goods02 camera= new Goods02();
		camera.setName("Nikon");
		System.out.println(camera.getName());
		
		Goods02 goods = new Goods02();
//		goods.price= -1; //객체 변수에 바로 접근하면 잘못된 데이터를 세팅할 수 있을 가능성이 있다.
		goods.setPrice(-1); //잘못된 데이터가 들어가더라도 코딩으로 보호함 (가격은 0이됨)
		System.out.println(goods.getPrice());
		
		//
		Goods02 tv= new Goods02();
		tv.setName("SamgSung");
		tv.setPrice(500000);
		tv.setCountStock(50);
		tv.setCountSold(20);

		System.out.println(Goods02.countOfGoods);

		///메소드 호출
		tv.showInfo();
		double discountPrice=tv.calcDiscountPrice((double)0.8);
		System.out.println("할인된 가격은 "+discountPrice);
	
	}

}
