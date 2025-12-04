package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class DivisibilityArrayTest1 {
	public static void main(String[] args) {
		byte[] num = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		byte k = 3;
		byte[] res = DivisibilityArray.divisibilityArray(num, k);
		System.out.println("Num: "+Arrays.toString(num)); // Num: [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
		System.out.println("Res: "+Arrays.toString(res)); // Res: [12, 15, 18]
	}
}