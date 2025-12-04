package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class DivisibilityArrayTest2 {
	public static void main(String[] args) {
		int[] num = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int k = 5;
		int[] res = DivisibilityArray.divisibilityArray(num, k);
		System.out.println("Num: "+Arrays.toString(num)); // Num: [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
		System.out.println("Res: "+Arrays.toString(res)); // Res: [10, 15, 20]
	}
}