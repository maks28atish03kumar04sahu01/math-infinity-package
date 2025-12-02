package mathinfinitytest;
import java.util.Scanner;
import com.mathinfinity.*;
public class PosNegZeroTest2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		short num4 = -155;
		short num5 = 3175;
		short num6 = 0;
		PosNegZeroNumber.posnegzeroNumber(num4); // -155 Is Negative Value.
		PosNegZeroNumber.posnegzeroNumber(num5); // 3175 Is Positive Value.
		PosNegZeroNumber.posnegzeroNumber(num6); // 0 Is Zero(0).
		
		in.close();
	}
}