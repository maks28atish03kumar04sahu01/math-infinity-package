package mathinfinitytest;
import java.util.Scanner;
import com.mathinfinity.*;
public class PrintZeroRangeTest1 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Byte Input: ");
		byte bip = in.nextByte(); // 10
		PrintZeroRange.printRange(bip); // 0 1 2 3 4 5 6 7 8 9 10 
		
		in.close();
	}
}
