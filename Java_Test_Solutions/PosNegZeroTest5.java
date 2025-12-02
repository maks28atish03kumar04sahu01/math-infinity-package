package mathinfinitytest;
import java.util.Scanner;
import com.mathinfinity.*;
public class PosNegZeroTest5 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		float num13 = -123.475f;
		float num14 = 278.214f;
		float num15 = 0.0f;
		PosNegZeroNumber.posnegzeroNumber(num13); // -123.475 Is Negative Value.
		PosNegZeroNumber.posnegzeroNumber(num14); // 278.214 Is Positive Value.
		PosNegZeroNumber.posnegzeroNumber(num15); // 0.0 Is Zero(0).
		
		in.close();
	}
}