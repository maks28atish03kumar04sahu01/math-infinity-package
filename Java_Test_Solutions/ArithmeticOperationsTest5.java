package mathinfinitytest;
import java.util.Scanner;
import com.mathinfinity.*;
public class ArithmeticOperationsTest5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Float1 Value: "); // 1234.567
		float num9 = in.nextFloat();
		System.out.println("Enter Float2 Value: "); // 34.56
		float num10 = in.nextFloat();

		System.out.println("Addition: "+ArithmeticOperations.arithmeticOperations(num9, num10, "+")); // Addition: 1269.1271
		System.out.println("Subtraction: "+ArithmeticOperations.arithmeticOperations(num9, num10, "-")); // Subtraction: 1200.007
		System.out.println("Multiplication: "+ArithmeticOperations.arithmeticOperations(num9, num10, "*")); // Multiplication: 42666.637
		System.out.println("Division: "+ArithmeticOperations.arithmeticOperations(num9, num10, "/")); // Division: 35.722424
		System.out.println("Modulo: "+ArithmeticOperations.arithmeticOperations(num9, num10, "%")); // Modulo: 24.966969
		
		in.close();

	}
}