package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class JavaRangeArrayTest3 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Int Range1: ");
		int ir1 = in.nextInt(); // 85070
		System.out.println("Enter Int Range2: ");
		int ir2 = in.nextInt(); // 85080
		int[] res = PrintRangeArray.printrangeArray(ir1, ir2);
		System.out.println("Res: "+Arrays.toString(res)); // Res: [85070, 85071, 85072, 85073, 85074, 85075, 85076, 85077, 85078, 85079, 85080]
	}
}
