package mathinfinitytest;
import java.util.Scanner;
import com.mathinfinity.*;
public class PosNegZeroTest6 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		double num16 = -12453.66254d;
		double num17 = 1176668.6632d;
		double num18 = 0.0000d;
		PosNegZeroNumber.posnegzeroNumber(num16); // -12453.66254 Is Negative Value.
		PosNegZeroNumber.posnegzeroNumber(num17); // 1176668.6632 Is Positive Value.
		PosNegZeroNumber.posnegzeroNumber(num18); // 0.0 Is Zero(0).

		in.close();
	}
}