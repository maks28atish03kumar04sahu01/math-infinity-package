package mathinfinitytest;
import com.mathinfinity.*;
public class DivisionOperationsTest4 {
	public static void main(String[] args) {
		long num1 = 25123L;
		long num2 = 117L;
		long num3 = 86L;
		System.out.println("Quotient: "+DivisionOperations.divisionOperation(num1, num2, num3, "Quotient")); // Quotient: 290
		System.out.println("Dividend: "+DivisionOperations.divisionOperation(num1, num2, num3, "dividend")); // Dividend: 2939477
		System.out.println("Divisor: "+DivisionOperations.divisionOperation(num1, num2, num3, "DIVISOR")); // Divisor: 213
		System.out.println("Remainder: "+DivisionOperations.divisionOperation(num1, num2, num3, "ReMaInDeR")); // Remainder: 15061
	}

}