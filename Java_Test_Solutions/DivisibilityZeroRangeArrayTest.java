package mathinfinitytest;
import com.mathinfinity.*;
import java.util.*;
public class DivisibilityZeroRangeArrayTest {
	public static void main(String[] args) {
		byte[] res1 = DivisibilityZeroRangeArray.divisibilityzerorangeArray((byte) 110, (byte) 22);
		System.out.println(Arrays.toString(res1)); // [0, 22, 44, 66, 88, 110]
		
		short[] res2 = DivisibilityZeroRangeArray.divisibilityzerorangeArray((short) 200, (byte) 25);
		System.out.println(Arrays.toString(res2)); // [0, 25, 50, 75, 100, 125, 150, 175, 200]
		
		int[] res3 = DivisibilityZeroRangeArray.divisibilityzerorangeArray((int) 400, (int) 34);
		System.out.println(Arrays.toString(res3)); // [0, 34, 68, 102, 136, 170, 204, 238, 272, 306, 340, 374]
		
		long[] res4 = DivisibilityZeroRangeArray.divisibilityzerorangeArray((long) 900, (long) 65);
		System.out.println(Arrays.toString(res4)); // [0, 65, 130, 195, 260, 325, 390, 455, 520, 585, 650, 715, 780, 845]
	}
}