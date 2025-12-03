package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class JavaRangeArrayTest6 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Double Range1: ");
		double dr1 = in.nextDouble(); // 248.123456789
		System.out.println("Enter Double Range2: ");
		double dr2 = in.nextDouble(); // 258.987654321
		double[] res = PrintRangeArray.printrangeArray(dr1, dr2, 6);
		System.out.println("Res: "+Arrays.toString(res)); // Res: [248.123457, 249.123457, 250.123457, 251.123457, 252.123457, 253.123457, 254.123457, 255.123457, 256.123457, 257.123457, 258.123457]
	}
}
