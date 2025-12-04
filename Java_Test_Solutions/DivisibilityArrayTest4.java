package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class DivisibilityArrayTest4 {
	public static void main(String[] args) {
		long[] num = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		long k = 2;
		long[] res = DivisibilityArray.divisibilityArray(num, k);
		System.out.println("Num: "+Arrays.toString(num)); // Num: [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
		System.out.println("Res: "+Arrays.toString(res)); // Res: [10, 12, 14, 16, 18, 20]
	}
}