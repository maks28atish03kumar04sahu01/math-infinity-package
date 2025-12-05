package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class EvenOddRangeArrayTest {

	public static void main(String[] args) {
		byte[] ar1 = EvenOddRangeArray.evenoddRangeArray((byte)10, (byte)20, "even");
		System.out.println(Arrays.toString(ar1)); // [10, 12, 14, 16, 18, 20]
		
		byte[] ar2 = EvenOddRangeArray.evenoddRangeArray((byte)20, (byte)30, "odd");
		System.out.println(Arrays.toString(ar2)); // [21, 23, 25, 27, 29]
		
		short[] ar3 = EvenOddRangeArray.evenoddRangeArray((short)30, (short)40, "EVEN");
		System.out.println(Arrays.toString(ar3)); // [30, 32, 34, 36, 38, 40]
		
		short[] ar4 = EvenOddRangeArray.evenoddRangeArray((short)50, (short)60, "ODD");
		System.out.println(Arrays.toString(ar4)); // [51, 53, 55, 57, 59]
		
		int[] ar5 = EvenOddRangeArray.evenoddRangeArray((int)60, (int)70, "eVeN");
		System.out.println(Arrays.toString(ar5)); // [60, 62, 64, 66, 68, 70]
		
		int[] ar6 = EvenOddRangeArray.evenoddRangeArray((int)70, (int)80, "OdD");
		System.out.println(Arrays.toString(ar6)); // [71, 73, 75, 77, 79]
		
		long[] ar7 = EvenOddRangeArray.evenoddRangeArray((long)80, (long)90, "Even");
		System.out.println(Arrays.toString(ar7)); // [80, 82, 84, 86, 88, 90]
		
		long[] ar8 = EvenOddRangeArray.evenoddRangeArray((long)90, (long)100, "Odd");
		System.out.println(Arrays.toString(ar8)); // [91, 93, 95, 97, 99]
	}

}
