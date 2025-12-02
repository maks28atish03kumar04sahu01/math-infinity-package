package mathinfinitytest;
import java.util.Scanner;
import com.mathinfinity.*;
public class ArithmeticOperationsTest1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Byte Input1: ");
		byte num1 = in.nextByte(); // 25
		System.out.println("Enter Byte Input2: ");
		byte num2 = in.nextByte(); // 3
		
		System.out.println("Addition: "+ArithmeticOperations.arithmeticOperations(num1, num2, "+")); // Addition: 28
		System.out.println("Subtraction: "+ArithmeticOperations.arithmeticOperations(num1, num2, "-")); // Subtraction: 22
		System.out.println("Multiplication: "+ArithmeticOperations.arithmeticOperations(num1, num2, "*")); // Multiplication: 75
		System.out.println("Division: "+ArithmeticOperations.arithmeticOperations(num1, num2, "/")); // Division: 8
		System.out.println("Modulo: "+ArithmeticOperations.arithmeticOperations(num1, num2, "%")); // Modulo: 1
		
		in.close();

	}
}