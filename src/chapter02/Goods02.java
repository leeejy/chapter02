package chapter02;

public class Goods02 {
	public static int countOfGoods;
	private String name;
	private int price;
	private int countStock;
	private int countSold;

	//기본생성자
	public Goods02(){
//		System.out.println("기본 생성자 호출");
		countOfGoods++; //내부일때는 Goods02.countOfGoods대신에 이렇게 써두 된당ㅎ
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0)
			price = 0;
		this.price = price;
	}

	public int getcountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}
	//return 값이 없고, 파라미터는 있는 메소드
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	// return 값이 없고 파라미터도 없는 메소드
	public void showInfo(){
		System.out.println(
				"name : "+ this.name+", "+
				"price : "+ this.price+", "+
				"countStock : "+ this.countStock+", "+
				"countSold : "+ this.countSold);
	}
	
	// return 값이 있고 파라미터도 있는 메소드
	public double calcDiscountPrice(double rate){
		double discountPrice = price * rate;
		return discountPrice;
		
	}

}
