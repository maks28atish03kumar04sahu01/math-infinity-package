package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class JavaRangeTest4 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Long Range1: ");
		long lr1 = in.nextLong(); // 10000100
		System.out.println("Enter Long Range2: ");
		long lr2 = in.nextLong(); // 10000120
		
		PrintRange.printRange(lr1, lr2); // 10000100 10000101 10000102 10000103 10000104 10000105 10000106 10000107 10000108 10000109 10000110 10000111 10000112 10000113 10000114 10000115 10000116 10000117 10000118 10000119 10000120 
	}
}
