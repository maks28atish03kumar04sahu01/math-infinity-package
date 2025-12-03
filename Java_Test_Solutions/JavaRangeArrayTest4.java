package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class JavaRangeArrayTest4 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Long Range1: ");
		long lr1 = in.nextLong(); // 1789632
		System.out.println("Enter Long Range2: ");
		long lr2 = in.nextLong(); // 1789640
		long[] res = PrintRangeArray.printrangeArray(lr1, lr2);
		System.out.println("Res: "+Arrays.toString(res)); // Res: [1789632, 1789633, 1789634, 1789635, 1789636, 1789637, 1789638, 1789639, 1789640]
	}
}
