package mathinfinitytest;
import com.mathinfinity.*;
public class DivisionOperationsTest1 {
	public static void main(String[] args) {
		byte num1 = 108;
		byte num2 = 23;
		byte num3 = 13;
		System.out.println("Quotient: "+DivisionOperations.divisionOperation(num1, num2, num3, "Quotient")); // Quotient: 6
		System.out.println("Dividend: "+DivisionOperations.divisionOperation(num1, num2, num3, "dividend")); // Dividend: -63
		System.out.println("Divisor: "+DivisionOperations.divisionOperation(num1, num2, num3, "DIVISOR")); // Divisor: 4
		System.out.println("Remainder: "+DivisionOperations.divisionOperation(num1, num2, num3, "ReMaInDeR")); // Remainder: 65

	}

}