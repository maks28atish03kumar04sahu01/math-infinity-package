// CHECK THE NUMBER IS POSITIVE, NEGATIVE OR ZERO

import {posnegZero} from "mathinfinity";

console.log(`0 is: ${posnegZero(0)}`); // 0 is: The number is +0
console.log(`-0 is: ${posnegZero(-0)}`); // -0 is: The number is -0
console.log(`12 is: ${posnegZero(12)}`); // 12 is: The number 12 is positive
console.log(`-18 is: ${posnegZero(-18)}`); // -18 is: The number -18 is negative

console.log(`0 is: ${posnegZero('0')}`); // 0 is: The number is +0
console.log(`-0 is: ${posnegZero("-0")}`); // -0 is: The number is -0
console.log(`34 is: ${posnegZero(`34`)}`); // 34 is: The number 34 is positive
console.log(`-85 is: ${posnegZero('-85')}`); // -85 is: The number -85 is negative