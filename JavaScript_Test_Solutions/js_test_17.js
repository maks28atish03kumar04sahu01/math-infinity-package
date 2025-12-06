// PRINT THOSE NUMBERS WHICH ARE DIVISIBLE BY GIVEN NUMBER FROM RANGE1 TO RANGE2

import {divisibilityRangeArray, nondivisibilityRangeArray} from "mathinfinity";

let res1 = divisibilityRangeArray(7, 100, 120);
console.log(res1); // [ 105, 112, 119 ]

let res2 = nondivisibilityRangeArray(7, 100, 110);
console.log(res2); // [ 100, 101, 102, 103, 104, 106, 107, 108, 109, 110 ]