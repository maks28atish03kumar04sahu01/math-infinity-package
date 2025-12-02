package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class PrintZeroRangeArrayTest5 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Float Input: ");
		float fip = in.nextFloat(); // 12.123456
		float[] res = PrintZeroRangeArray.printzeroRangeArray(fip, 3); // Res: [0.123, 1.123, 2.123, 3.123, 4.123, 5.123, 6.123, 7.123, 8.123, 9.123, 10.123, 11.123, 12.123]
		System.out.println("Res: "+Arrays.toString(res));
		
		in.close();
	}
}
