package mathinfinitytest;
import java.util.Scanner;
import com.mathinfinity.*;
public class PrintZeroRangeTest3 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Int Input: ");
		int iip = in.nextInt(); // 30
		PrintZeroRange.printRange(iip); // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 		
		in.close();
	}
}
