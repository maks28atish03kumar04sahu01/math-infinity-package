package mathinfinitytest;
import com.mathinfinity.*;
import java.util.*;
public class EvenOddArrayTest3 {
	public static void main(String[] args) {
		int[] ar3 = {10, 21, 30, 41, 50, 61, 70, 81, 90, 101};
		int[] res3 = EvenOddArray.evenoddArray(ar3, "eVeN");
		System.out.println(Arrays.toString(res3)); // [10, 30, 50, 70, 90]
	}

}
