package mathinfinitytest;
import com.mathinfinity.*;
import java.util.*;
public class EvenOddArrayTest3 {
	public static void main(String[] args) {
		long[] ar4 = {10, 21, 30, 41, 50, 61, 70, 81, 90, 101};
		long[] res4 = EvenOddArray.evenoddArray(ar4, "oDd");
		System.out.println(Arrays.toString(res4)); // [21, 41, 61, 81, 101]
	}

}
