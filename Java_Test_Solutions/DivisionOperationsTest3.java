package mathinfinitytest;
import com.mathinfinity.*;
public class DivisionOperationsTest3 {
	public static void main(String[] args) {
		short num1 = 208;
		short num2 = 7;
		short num3 = 17;
		System.out.println("Quotient: "+DivisionOperations.divisionOperation(num1, num2, num3, "Quotient")); // Quotient: 11
		System.out.println("Dividend: "+DivisionOperations.divisionOperation(num1, num2, num3, "dividend")); // Dividend: 1473
		System.out.println("Divisor: "+DivisionOperations.divisionOperation(num1, num2, num3, "DIVISOR")); // Divisor: 27
		System.out.println("Remainder: "+DivisionOperations.divisionOperation(num1, num2, num3, "ReMaInDeR")); // Remainder: 89
	}

}