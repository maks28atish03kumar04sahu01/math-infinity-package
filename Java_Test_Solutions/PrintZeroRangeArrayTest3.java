package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class PrintZeroRangeArrayTest3 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Int Input: ");
		int iip = in.nextInt(); // 10
		int[] res = PrintZeroRangeArray.printzeroRangeArray(iip); // Res: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println("Res: "+Arrays.toString(res));
		
		in.close();
	}
}
