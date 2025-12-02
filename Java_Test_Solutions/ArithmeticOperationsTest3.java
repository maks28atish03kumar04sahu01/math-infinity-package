package mathinfinitytest;
import java.util.Scanner;
import com.mathinfinity.*;
public class ArithmeticOperationsTest3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Int1 Value: "); // 818
		int num5 = in.nextInt();
		System.out.println("Enter Int2 Value: "); // 113
		int num6 = in.nextInt();

		System.out.println("Addition: "+ArithmeticOperations.arithmeticOperations(num5, num6, "+")); // Addition: 931
		System.out.println("Subtraction: "+ArithmeticOperations.arithmeticOperations(num5, num6, "-")); // Subtraction: 705
		System.out.println("Multiplication: "+ArithmeticOperations.arithmeticOperations(num5, num6, "*")); // Multiplication: 92434
		System.out.println("Division: "+ArithmeticOperations.arithmeticOperations(num5, num6, "/")); // Division: 7
		System.out.println("Modulo: "+ArithmeticOperations.arithmeticOperations(num5, num6, "%")); // Modulo: 27
		
		in.close();

	}
}