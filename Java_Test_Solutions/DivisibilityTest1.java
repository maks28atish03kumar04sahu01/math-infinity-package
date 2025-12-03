package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class DivisibilityTest1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Input Value: ");
		byte num = in.nextByte(); // 12
		System.out.println("Enter Target Value: ");
		byte k = in.nextByte(); // 7
		Divisibility.divisibilityNumber(num, k); // 12 Not Divisible By 7
		in.close();
	}
}