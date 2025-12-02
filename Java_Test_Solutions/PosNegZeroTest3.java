package mathinfinitytest;
import java.util.Scanner;
import com.mathinfinity.*;
public class PosNegZeroTest3 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int num7 = -871;
		int num8 = 51929;
		int num9 = 0;
		PosNegZeroNumber.posnegzeroNumber(num7); // -871 Is Negative Value.
		PosNegZeroNumber.posnegzeroNumber(num8); // 51929 Is Positive Value.
		PosNegZeroNumber.posnegzeroNumber(num9); // 0 Is Zero(0).
		
		in.close();
	}
}