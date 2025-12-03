package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class JavaRangeTest6 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Double Range1: ");
		double dr1 = in.nextDouble(); // 123456.1728396
		System.out.println("Enter Double Range2: ");
		double dr2 = in.nextDouble(); // 123466.1728399
		
		PrintRange.printRange(dr1, dr2, 5); // 123456.17284 123457.17284 123458.17284 123459.17284 123460.17284 123461.17284 123462.17284 123463.17284 123464.17284 123465.17284 123466.17284
	}
}