package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class JavaRangeTest5 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Float Range1: ");
		float fr1 = in.nextFloat(); // 123.46875
		System.out.println("Enter Float Range2: ");
		float fr2 = in.nextFloat(); // 130.46875
		
		PrintRange.printRange(fr1, fr2, 3); // 123.469 124.469 125.469 126.469 127.469 128.469 129.469 130.469 
	}
}