package chapter02;

public class Goods {

		private String name;
		protected int price;
		public int countStock;
		
	// default: 접근 제어자를 명시하지 않은 경우
		int countSold;
		
		String getName(){
			return name;
		}
		
		void discount(int percentage){
			price = price - price * percentage;
		}
		void setName(String name){
			this.name=name;
		}


}
