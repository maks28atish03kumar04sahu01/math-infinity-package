package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class JavaRangeArrayTest2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Short Range1: ");
		short sr1 = in.nextShort(); // 1200
		System.out.println("Enter Short Range2: ");
		short sr2 = in.nextShort(); // 1210
		short[] res = PrintRangeArray.printrangeArray(sr1, sr2);
		System.out.println("Res: "+Arrays.toString(res)); // Res: [1200, 1201, 1202, 1203, 1204, 1205, 1206, 1207, 1208, 1209, 1210]
	}
}
