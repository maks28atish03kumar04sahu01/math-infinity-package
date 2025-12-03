package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class DivisibilityTest4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Input Value: ");
		long num = in.nextLong(); // 123456789
		System.out.println("Enter Target Value: ");
		long k = in.nextLong(); // 333
		Divisibility.divisibilityNumber(num, k); // 123456789 Not Divisible By 333
		in.close();
	}
}