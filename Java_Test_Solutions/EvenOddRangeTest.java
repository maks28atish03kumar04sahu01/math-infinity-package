package mathinfinitytest;
import com.mathinfinity.*;
public class EvenOddRangeTest {

	public static void main(String[] args) {
		EvenOddRange.evenoddRange((byte) 20, (byte) 30, "EVEN"); // 20 22 24 26 28 30 
		EvenOddRange.evenoddRange((byte) 40, (byte) 50, "ODD"); // 41 43 45 47 49 
		
		EvenOddRange.evenoddRange((short) 60, (short) 70, "even"); // 60 62 64 66 68 70 
		EvenOddRange.evenoddRange((short) 80, (short) 90, "odd"); // 81 83 85 87 89 
		
		EvenOddRange.evenoddRange((int) 20, (int) 30, "EVEN"); // 20 22 24 26 28 30 
		EvenOddRange.evenoddRange((int) 40, (int) 50, "ODD"); // 41 43 45 47 49 
		
		EvenOddRange.evenoddRange((long) 60, (long) 70, "eVeN"); // 60 62 64 66 68 70 
		EvenOddRange.evenoddRange((long) 80, (long) 90, "OdD"); // 81 83 85 87 89 
	}

}
