// PRINT RANGE1 TO RANGE2 IN ARRAY FORMAT

import {rangetorangeArray} from "mathinfinity";

let res1 = rangetorangeArray(10, 20);
console.log("Res1: ",res1); // Res1:  [ 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 ]

let res2 = rangetorangeArray('10', 20);
console.log("Res2: ",res2); // Res2:  [ 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 ]

let res3 = rangetorangeArray(10, "20");
console.log("Res3: ",res3); // Res3:  [ 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 ]

let res4 = rangetorangeArray(`10`, 20);
console.log("Res4: ",res4); // Res4:  [ 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 ]

let res5 = rangetorangeArray(50, 60);
console.log("Res5: ",res5); // Res5:  [ 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60 ]

let res6 = rangetorangeArray('50', '60');
console.log("Res6: ",res6); // Res6:  [ 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60 ]

let res7 = rangetorangeArray("50", "60");
console.log("Res7: ",res7); // Res7:  [ 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60 ]

let res8 = rangetorangeArray(`50`, `60`);
console.log("Res8: ",res8); // Res8:  [ 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60 ]