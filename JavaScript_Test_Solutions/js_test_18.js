// PRINT THE THE THOSE ELEMENTS FROM AN ARRAY WHICH ARE DIVISIBLE BY GIVEN NUMBER

import {divisibilityArray, nondivisibilityArray} from "mathinfinity";

let ar = [10, 21, 30, 41, 50, 61, 70, 81, 90, 101];
let res = divisibilityArray(ar, 5); // [ 10, 30, 50, 70, 90 ]
console.log(res);
let res1 = nondivisibilityArray(ar, 5); // [ 21, 41, 61, 81, 101 ]
console.log(res1);