package mathinfinitytest;
import com.mathinfinity.*;
public class DivisibilityZeroRangeTest {

	public static void main(String[] args) {
		DivisibilityZeroRange.divisibilityzeroRange((byte) 50, (byte) 11); // 0 11 22 33 44 
		DivisibilityZeroRange.divisibilityzeroRange((short) 150, (short) 25); // 0 25 50 75 100 125 150 
		DivisibilityZeroRange.divisibilityzeroRange((int) 200, (int) 34); // 0 34 68 102 136 170 
		DivisibilityZeroRange.divisibilityzeroRange((long) 500, (long) 110); // 0 110 220 330 440 
	}

}
