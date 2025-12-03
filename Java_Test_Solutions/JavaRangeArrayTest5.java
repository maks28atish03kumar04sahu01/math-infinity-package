package mathinfinitytest;
import java.util.*;
import com.mathinfinity.*;
public class JavaRangeArrayTest5 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Float Range1: ");
		float fr1 = in.nextFloat(); // 732.124
		System.out.println("Enter Float Range2: ");
		float fr2 = in.nextFloat(); // 740.224
		float[] res = PrintRangeArray.printrangeArray(fr1, fr2, 3);
		System.out.println("Res: "+Arrays.toString(res)); // Res: [732.124, 733.124, 734.124, 735.124, 736.124, 737.124, 738.124, 739.124, 740.124]
	}
}
