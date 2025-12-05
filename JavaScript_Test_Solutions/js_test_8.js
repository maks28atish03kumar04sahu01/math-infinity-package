// PRINT ZERO TO RANGE IN ARRAY FORMAT

import {zeroToRangeArray} from "mathinfinity";

let res1 = zeroToRangeArray(10);
console.log("Res1:", res1); // Res1: [ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ]

let res2 = zeroToRangeArray('10');
console.log("Res2:", res2); // Res2: [ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ]

let res3 = zeroToRangeArray("10");
console.log("Res3:", res3); // Res3: [ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ]

let res4 = zeroToRangeArray(`10`);
console.log("Res4:", res4); // Res4: [ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ]