package mathinfinitytest;
import java.util.Scanner;
import com.mathinfinity.*;
public class PrintZeroRangeTest2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Short Input: ");
		short sip = in.nextShort(); // 20
		PrintZeroRange.printRange(sip); // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 
		in.close();
	}
}
