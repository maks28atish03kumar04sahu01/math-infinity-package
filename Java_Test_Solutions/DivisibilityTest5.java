package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class DivisibilityTest5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Input Value: ");
		float num = in.nextFloat(); // 28.00
		System.out.println("Enter Target Value: ");
		float k = in.nextFloat(); // 2.00
		Divisibility.divisibilityNumber(num, k); // 28.0 Divisible By 2.0
		in.close();
	}
}