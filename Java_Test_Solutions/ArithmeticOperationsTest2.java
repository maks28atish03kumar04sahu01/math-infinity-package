package mathinfinitytest;
import java.util.Scanner;
import com.mathinfinity.*;
public class ArithmeticOperationsTest2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Short1 Value: "); // 80
		short num3 = in.nextShort();
		System.out.println("Enter Short2 Value: "); // 50
		short num4 = in.nextShort();

		System.out.println("Addition: "+ArithmeticOperations.arithmeticOperations(num3, num4, "+")); // Addition: 130
		System.out.println("Subtraction: "+ArithmeticOperations.arithmeticOperations(num3, num4, "-")); // Subtraction: 30
		System.out.println("Multiplication: "+ArithmeticOperations.arithmeticOperations(num3, num4, "*")); // Multiplication: 4000
		System.out.println("Division: "+ArithmeticOperations.arithmeticOperations(num3, num4, "/")); // Division: 1
		System.out.println("Modulo: "+ArithmeticOperations.arithmeticOperations(num3, num4, "%")); // Modulo: 30
		
		in.close();

	}
}