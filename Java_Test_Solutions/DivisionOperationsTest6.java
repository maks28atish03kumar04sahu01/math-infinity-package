package mathinfinitytest;
import com.mathinfinity.*;
public class DivisionOperationsTest6 {
	public static void main(String[] args) {
		double num1 = 123456789.1234;
		double num2 = 1234.69;
		double num3 = 346.218;
		System.out.println("Quotient: "+DivisionOperations.divisionOperation(num1, num2, num3, "Quotient")); // Quotient: 356583.2927040189
		System.out.println("Dividend: "+DivisionOperations.divisionOperation(num1, num2, num3, "dividend")); // Dividend: 1.5243086330898874E11
		System.out.println("Divisor: "+DivisionOperations.divisionOperation(num1, num2, num3, "DIVISOR")); // Divisor: 99989.82975921081
		System.out.println("Remainder: "+DivisionOperations.divisionOperation(num1, num2, num3, "ReMaInDeR")); // Remainder: 1.2302931722098E8
	}

}