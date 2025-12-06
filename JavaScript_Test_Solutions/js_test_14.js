// PRINT THOSE NUMBERS WHICH ARE DIVISIBLE BY GIVEN NUMBER FROM 0 TO RANGE

import {divisibilityZeroToRange, nondivisibilityZeroToRange} from "mathinfinity";

divisibilityZeroToRange(50, 6); // 0 6 12 18 24 30 36 42 48
divisibilityZeroToRange(50, '8'); // 0 8 16 24 32 40 48

nondivisibilityZeroToRange(20, 7); // 1 2 3 4 5 6 8 9 10 11 12 13 15 16 17 18 19 20
nondivisibilityZeroToRange(20, '7'); // 1 2 3 4 5 6 8 9 10 11 12 13 15 16 17 18 19 20