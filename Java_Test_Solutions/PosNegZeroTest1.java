package mathinfinitytest;
import java.util.Scanner;
import com.mathinfinity.*;
public class PosNegZeroTest1 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		byte num1 = -15;
		byte num2 = 117;
		byte num3 = 0;
		PosNegZeroNumber.posnegzeroNumber(num1); // -15 Is Negative Value.
		PosNegZeroNumber.posnegzeroNumber(num2); // 117 Is Positive Value.
		PosNegZeroNumber.posnegzeroNumber(num3); // 0 Is Zero(0).
		
		in.close();
	}
}
