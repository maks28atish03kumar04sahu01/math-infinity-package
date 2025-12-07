// PRINT THE EVEN OR ODD NUMBERS FROM RANGE1 TO RANGE2

import {evenoddRangeArray} from "mathinfinity";

let res1 = evenoddRangeArray(20, 30, "even");
console.log(res1); // [ 20, 22, 24, 26, 28, 30 ]
let res2 = evenoddRangeArray("40", '50', "odd");
console.log(res2); // [ 41, 43, 45, 47, 49 ]