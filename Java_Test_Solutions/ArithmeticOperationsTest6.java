package mathinfinitytest;
import java.util.Scanner;
import com.mathinfinity.*;
public class ArithmeticOperationsTest6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Double1 Value: "); // 12345.678
		double num12 = in.nextDouble();
		System.out.println("Enter Double2 Value: "); // 678.91
		double num13 = in.nextDouble();

		System.out.println("Addition: "+ArithmeticOperations.arithmeticOperations(num12, num13, "+")); // Addition: 13024.588
		System.out.println("Subtraction: "+ArithmeticOperations.arithmeticOperations(num12, num13, "-")); // Subtraction: 11666.768
		System.out.println("Multiplication: "+ArithmeticOperations.arithmeticOperations(num12, num13, "*")); // Multiplication: 8381604.250979999
		System.out.println("Division: "+ArithmeticOperations.arithmeticOperations(num12, num13, "/")); // Division: 18.184557599681845
		System.out.println("Modulo: "+ArithmeticOperations.arithmeticOperations(num12, num13, "%")); // Modulo: 125.29800000000046
		
		in.close();

	}
}