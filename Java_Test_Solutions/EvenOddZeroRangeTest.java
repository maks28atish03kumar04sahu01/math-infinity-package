package mathinfinitytest;
import com.mathinfinity.*;
public class EvenOddZeroRangeTest {
	public static void main(String args[]) {
		EvenOddZeroRange.evenoddZeroRange((byte) 10, "even"); // 0 2 4 6 8 10 
		EvenOddZeroRange.evenoddZeroRange((byte) 10, "odd"); // 1 3 5 7 9 
		
		EvenOddZeroRange.evenoddZeroRange((short) 10, "EVEN"); // 0 2 4 6 8 10 
		EvenOddZeroRange.evenoddZeroRange((short) 10, "ODD"); // 1 3 5 7 9 
		
		EvenOddZeroRange.evenoddZeroRange((int) 10, "Even"); // 0 2 4 6 8 10 
		EvenOddZeroRange.evenoddZeroRange((int) 10, "Odd"); // 1 3 5 7 9 
		
		EvenOddZeroRange.evenoddZeroRange((long) 10, "EvEn"); // 0 2 4 6 8 10 
		EvenOddZeroRange.evenoddZeroRange((long) 10, "OdD"); // 1 3 5 7 9
	}
}