package mathinfinitytest;
import java.util.Scanner;
import com.mathinfinity.*;
public class ArithmeticOperationsTest4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Long1 Value: "); // 123456789
		long num7 = in.nextLong();
		System.out.println("Enter Long2 Value: "); // 12345
		long num8 = in.nextLong();

		System.out.println("Addition: "+ArithmeticOperations.arithmeticOperations(num7, num8, "+")); // Addition: 123469134
		System.out.println("Subtraction: "+ArithmeticOperations.arithmeticOperations(num7, num8, "-")); // Subtraction: 123444444
		System.out.println("Multiplication: "+ArithmeticOperations.arithmeticOperations(num7, num8, "*")); // Multiplication: 1524074060205
		System.out.println("Division: "+ArithmeticOperations.arithmeticOperations(num7, num8, "/")); // Division: 10000
		System.out.println("Modulo: "+ArithmeticOperations.arithmeticOperations(num7, num8, "%")); // Modulo: 6789
		
		in.close();

	}
}