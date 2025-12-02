package mathinfinitytest;
import java.util.Scanner;
import com.mathinfinity.*;
public class PrintZeroRangeTest5 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Float Input: ");
		float fip = in.nextFloat(); // 12.1234
		PrintZeroRange.printRange(fip, 2); // 0.12 1.12 2.12 3.12 4.12 5.12 6.12 7.12 8.12 9.12 10.12 11.12 12.12 
		
		in.close();
	}
}
