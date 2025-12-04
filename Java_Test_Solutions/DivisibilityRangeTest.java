package mathinfinitytest;
import com.mathinfinity.*;
public class DivisibilityRangeTest {

	public static void main(String[] args) {
		DivisibilityRange.divisibilityRange((byte) 40, (byte) 80, (byte) 11); // 44 55 66 77 
		DivisibilityRange.divisibilityRange((short) 400, (short) 800, (short) 34); // 408 442 476 510 544 578 612 646 680 714 748 782 
		DivisibilityRange.divisibilityRange((int) 4000, (int) 8000, (int) 650); // 4550 5200 5850 6500 7150 7800 
		DivisibilityRange.divisibilityRange((long) 5000, (long) 9000, (long) 550); // 5500 6050 6600 7150 7700 8250 8800 
	}

}
