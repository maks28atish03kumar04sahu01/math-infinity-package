package mathinfinitytest;
import com.mathinfinity.*;
public class DivisionOperationsTest5 {
	public static void main(String[] args) {
		float num1 = 1234.236f;
		float num2 = 24.8f;
		float num3 = 98.7f;
		System.out.println("Quotient: "+DivisionOperations.divisionOperation(num1, num2, num3, "Quotient")); // Quotient: 12.253657
		System.out.println("Dividend: "+DivisionOperations.divisionOperation(num1, num2, num3, "dividend")); // Dividend: 30707.75
		System.out.println("Divisor: "+DivisionOperations.divisionOperation(num1, num2, num3, "DIVISOR")); // Divisor: 45.787743
		System.out.println("Remainder: "+DivisionOperations.divisionOperation(num1, num2, num3, "ReMaInDeR")); // Remainder: -1213.5238
	}

}