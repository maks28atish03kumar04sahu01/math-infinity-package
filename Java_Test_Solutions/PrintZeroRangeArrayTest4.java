package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class PrintZeroRangeArrayTest4 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Long Input: ");
		long lip = in.nextLong(); // 20
		long[] res = PrintZeroRangeArray.printzeroRangeArray(lip); // Res: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
		System.out.println("Res: "+Arrays.toString(res));
		
		in.close();
	}
}