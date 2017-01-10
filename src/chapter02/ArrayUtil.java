package chapter02;

public class ArrayUtil {
	public static double[] intToDouble(int[] source) {
		double[] result = new double[source.length];
		for (int i = 0; i < source.length; i++)
			result[i] = source[i]; // 캐스팅이 일어난다..암시적 캐스팅(오른쪽이 더 범위가 작은데..)

		return result;
	}

	public static int[] DoubleToInt(double[] source) {
		int[] result = new int[source.length];
		for (int i = 0; i < source.length; i++)
			result[i] = (int) source[i];

		return result;
	}

	public static int[] concat(int[] a, int[] b) {
		if (a == null || b == null) {
			return null;
		}
		int index = 0;
		int[] result = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			// result[i]= a[i];
			result[index++] = a[i];
		}

//		for (int i = 0; i < b.length; i++, index++)
//			result[i] = b[i];
		for (int i = 0; i < b.length; i++)
			result[a.length + i] = b[i];
		return result;
	}
}
