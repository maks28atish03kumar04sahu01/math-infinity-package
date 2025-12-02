package mathinfinitytest;
import java.util.Scanner;
import com.mathinfinity.*;
public class PrintZeroRangeTest6 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Double Input: ");
		double dip = in.nextDouble(); // 12.123456
		PrintZeroRange.printRange(dip, 3); // 0.123 1.123 2.123 3.123 4.123 5.123 6.123 7.123 8.123 9.123 10.123 11.123 12.123 
		
		in.close();
	}
}
