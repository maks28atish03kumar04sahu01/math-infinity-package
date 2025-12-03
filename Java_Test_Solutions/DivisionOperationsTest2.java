package mathinfinitytest;
import com.mathinfinity.*;
public class DivisionOperationsTest2 {
	public static void main(String[] args) {
		int num1 = 1008;
		int num2 = 33;
		int num3 = 43;
		System.out.println("Quotient: "+DivisionOperations.divisionOperation(num1, num2, num3, "Quotient")); // Quotient: 22
		System.out.println("Dividend: "+DivisionOperations.divisionOperation(num1, num2, num3, "dividend")); // Dividend: 33307
		System.out.println("Divisor: "+DivisionOperations.divisionOperation(num1, num2, num3, "DIVISOR")); // Divisor: 29
		System.out.println("Remainder: "+DivisionOperations.divisionOperation(num1, num2, num3, "ReMaInDeR")); // Remainder: -411
	}

}