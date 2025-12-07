// PRINT THE EVEN OR ODD NUMBERS FROM THE GIVEN ARRAY

import { evenoddArray } from "mathinfinity";

let ar1= [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20];
let res1 = evenoddArray(ar1, "even");
console.log(res1); // [ 10, 12, 14, 16, 18, 20 ]
let res2 = evenoddArray(ar1, "odd");
console.log(res2); // [ 11, 13, 15, 17, 19 ]