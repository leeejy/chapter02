package chapter02;
public class Swap02 {
	public static void main(String[] ars) {
		
		Value i = new Value();
		i.val = 10;

		Value j = new Value();
		j.val = 20;

		System.out.println(i.val + ":" + j.val);
		swap(i, j);
		System.out.println(i.val + ":" + j.val);

	}
	static void swap(Value a, Value b){
		int temp = a.val;
		a.val=b.val;
		b.val=temp;
		
	}

}
