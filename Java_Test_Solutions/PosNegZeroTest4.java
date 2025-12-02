package mathinfinitytest;
import java.util.Scanner;
import com.mathinfinity.*;
public class PosNegZeroTest4 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		long num10 = -15518829L;
		long num11 = 2984182965L;
		long num12 = 0;
		PosNegZeroNumber.posnegzeroNumber(num10); // -15518829 Is Negative Value.
		PosNegZeroNumber.posnegzeroNumber(num11); // 2984182965 Is Positive Value.
		PosNegZeroNumber.posnegzeroNumber(num12); // 0 Is Zero(0).
		
		in.close();
	}
}