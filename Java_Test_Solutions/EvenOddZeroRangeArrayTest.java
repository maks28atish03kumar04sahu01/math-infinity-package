package mathinfinitytest;
import com.mathinfinity.*;
import java.util.*;
public class EvenOddZeroRangeArrayTest {

	public static void main(String[] args) {
		byte[] res1 = EvenOddZeroRangeArray.evenoddzerorangeArray((byte)10, "EVEN");
		System.out.println(Arrays.toString(res1)); // [0, 2, 4, 6, 8, 10]
		
		byte[] res2 = EvenOddZeroRangeArray.evenoddzerorangeArray((byte)10, "ODD");
		System.out.println(Arrays.toString(res2)); // [1, 3, 5, 7, 9]
		
		short[] res3 = EvenOddZeroRangeArray.evenoddzerorangeArray((short)10, "even");
		System.out.println(Arrays.toString(res3)); // [0, 2, 4, 6, 8, 10]
		
		short[] res4 = EvenOddZeroRangeArray.evenoddzerorangeArray((short)10, "odd");
		System.out.println(Arrays.toString(res4)); // [1, 3, 5, 7, 9]
		
		int[] res5 = EvenOddZeroRangeArray.evenoddzerorangeArray((int)10, "Even");
		System.out.println(Arrays.toString(res5)); // [0, 2, 4, 6, 8, 10]
		
		int[] res6 = EvenOddZeroRangeArray.evenoddzerorangeArray((int)10, "Odd");
		System.out.println(Arrays.toString(res6)); // [1, 3, 5, 7, 9]
		
		long[] res7 = EvenOddZeroRangeArray.evenoddzerorangeArray((long)10, "EvEn");
		System.out.println(Arrays.toString(res7)); // [0, 2, 4, 6, 8, 10]
		
		long[] res8 = EvenOddZeroRangeArray.evenoddzerorangeArray((long)10, "oDd");
		System.out.println(Arrays.toString(res8)); // [1, 3, 5, 7, 9]
	}

}
