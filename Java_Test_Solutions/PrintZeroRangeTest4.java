package mathinfinitytest;
import java.util.Scanner;
import com.mathinfinity.*;
public class PrintZeroRangeTest4 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Long Input: ");
		long lip = in.nextLong(); // 10
		PrintZeroRange.printRange(lip); // 0 1 2 3 4 5 6 7 8 9 10 
		
		in.close();
	}
}
