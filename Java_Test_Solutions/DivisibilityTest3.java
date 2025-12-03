package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class DivisibilityTest3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Input Value: ");
		int num = in.nextInt(); // 12345
		System.out.println("Enter Target Value: ");
		int k = in.nextInt(); // 23
		Divisibility.divisibilityNumber(num, k); // 12345 Not Divisible By 23
		in.close();
	}
}