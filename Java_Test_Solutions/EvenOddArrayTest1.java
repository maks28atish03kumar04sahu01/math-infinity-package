package mathinfinitytest;
import com.mathinfinity.*;
import java.util.*;
public class EvenOddArrayTest1 {
	public static void main(String[] args) {
		byte[] ar1 = {10, 21, 30, 41, 50, 61, 70, 81, 90, 101};
		byte[] res1 = EvenOddArray.evenoddArray(ar1, "EVEN");
		System.out.println(Arrays.toString(res1)); // [10, 30, 50, 70, 90]
	}

}
