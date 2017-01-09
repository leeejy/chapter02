package myPackage;

import chapter02.Goods;

public class SpecialGoods extends Goods{

	void test(){
		//private은 자식에서도 접근할 수 없다.
//		name = "canon";
		
		//protected는 자식에서도 접근 가능
		price = 20000;
		
		//public은 자식에서도 접근 가능
		countStock = 20;
		
		//default 다른 패키지 접근 X
//		countSold = 2;
	
	}

}
