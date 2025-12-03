package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class DivisibilityTest6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Input Value: ");
		double num = in.nextDouble(); // 123456.1234
		System.out.println("Enter Target Value: ");
		double k = in.nextDouble(); // 36.1234
		Divisibility.divisibilityNumber(num, k); // 123456.1234 Not Divisible By 36.1234
		in.close();
	}
}