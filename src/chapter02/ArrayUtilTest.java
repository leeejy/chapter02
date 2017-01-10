package chapter02;

public class ArrayUtilTest {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };

		double[] b = ArrayUtil.intToDouble(a);
		for (double v : b)
			System.out.println(v);
		
		double[] d = {1.0, 2., 3., 4.};
		int[] c = ArrayUtil.DoubleToInt(d);
		for (int v : c)
			System.out.println(v);
		
		
		int[] c1 = {10, 2,3, 4};
		int[] c2 = {5,6,7};
		int[] e = ArrayUtil.concat(c1, c2);
		for( int v :e)
			System.out.println(v);
	}

}