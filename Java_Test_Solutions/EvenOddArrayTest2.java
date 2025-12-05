package mathinfinitytest;
import com.mathinfinity.*;
import java.util.*;
public class EvenOddArrayTest2 {
	public static void main(String[] args) {
		short[] ar2 = {10, 21, 30, 41, 50, 61, 70, 81, 90, 101};
		short[] res2 = EvenOddArray.evenoddArray(ar2, "ODD");
		System.out.println(Arrays.toString(res2)); // [21, 41, 61, 81, 101]
	}

}
