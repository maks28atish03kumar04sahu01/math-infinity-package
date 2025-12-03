package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class JavaRangeTest3 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Int Range1: ");
		int ir1 = in.nextInt(); // 10010
		System.out.println("Enter Int Range2: ");
		int ir2 = in.nextInt(); // 10020
		
		PrintRange.printRange(ir1, ir2); // 10010 10011 10012 10013 10014 10015 10016 10017 10018 10019 10020 
	}
}
