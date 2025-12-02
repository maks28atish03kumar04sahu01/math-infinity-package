package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class PrintZeroRangeArrayTest6 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Double Input: ");
		double fip = in.nextDouble(); // 10.123456789
		double[] res = PrintZeroRangeArray.printzeroRangeArray(fip, 6); // Res: [0.123457, 1.123457, 2.123457, 3.123457, 4.123457, 5.123457, 6.123457, 7.123457, 8.123457, 9.123457, 10.123457]
		System.out.println("Res: "+Arrays.toString(res));
		
		in.close();
	}
}
