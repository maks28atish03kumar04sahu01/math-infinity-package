package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class JavaRangeTest2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Short Range1: ");
		short sr1 = in.nextShort(); // 30
		System.out.println("Enter Short Range2: ");
		short sr2 = in.nextShort(); // 50
		
		PrintRange.printRange(sr1, sr2); // 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50
	}
}
