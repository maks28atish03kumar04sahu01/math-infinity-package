package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class JavaRangeArrayTest1 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Byte Range1: ");
		byte br1 = in.nextByte(); // 20
		System.out.println("Enter Byte Range2: ");
		byte br2 = in.nextByte(); // 40
		byte[] res = PrintRangeArray.printrangeArray(br1, br2);
		System.out.println("Res: "+Arrays.toString(res)); // Res: [20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40]
	}
}
