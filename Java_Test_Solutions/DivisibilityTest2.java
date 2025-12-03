package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class DivisibilityTest2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Input Value: ");
		short num = in.nextShort(); // 1024
		System.out.println("Enter Target Value: ");
		short k = in.nextShort(); // 2
		Divisibility.divisibilityNumber(num, k); // 1024 Divisible By 2
		in.close();
	}
}