package mathinfinitytest;
import com.mathinfinity.*;
import java.util.*;
public class DivisibilityRangeArrayTest {

	public static void main(String[] args) {
		
		byte[] res1 = DivisibilityRangeArray.divisibilityrangeArray((byte) 20, (byte) 70, (byte) 11);
		System.out.println(Arrays.toString(res1)); // [22, 33, 44, 55, 66]
		
		short [] res2 = DivisibilityRangeArray.divisibilityrangeArray((short) 200, (short) 700, (short) 78);
		System.out.println(Arrays.toString(res2)); // [234, 312, 390, 468, 546, 624]
		
		int [] res3 = DivisibilityRangeArray.divisibilityrangeArray((int) 2000, (int) 3000, (int) 250);
		System.out.println(Arrays.toString(res3)); // [2000, 2250, 2500, 2750, 3000]
		
		long [] res4 = DivisibilityRangeArray.divisibilityrangeArray((long) 1000, (long) 3000, (long) 600);
		System.out.println(Arrays.toString(res4)); // [1200, 1800, 2400, 3000]
	}
}