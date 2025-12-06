// PRINT THOSE NUMBERS WHICH ARE DIVISIBLE BY GIVEN NUMBER FROM 0 TO RANGE

import {divisibilityZeroToRangeArray, nondivisibilityZeroToRangeArray} from "mathinfinity";

let res1 = divisibilityZeroToRangeArray(8, 30);
console.log(res1); // [ 0, 8, 16, 24 ]

let res2 = nondivisibilityZeroToRangeArray(2, 20);
console.log(res2); // [ 1,  3,  5,  7,  9, 11, 13, 15, 17, 19 ]