// CHECK THE NUMBER IS POSITIVE, NEGATIVE OR ZERO

import {posnegZero} from "mathinfinity";

console.log(`0.1 is: ${posnegZero(0.1)}`); // 0.1 is: The number 0.1 is positive
console.log(`0.0000 is: ${posnegZero(0.0000)}`); // 0.0000 is: The number is +0
console.log(`-0.12 is: ${posnegZero(-0.12)}`); // -0.12 is: The number -0.12 is negative
console.log(`12.17 is: ${posnegZero(12.17)}`); // 12.17 is: The number 12.17 is positive
console.log(`-18.16 is: ${posnegZero(-18.16)}`); // -18.16 is: The number -18.16 is negative

console.log(`0.8 is: ${posnegZero('0.8')}`); // 0.8 is: The number 0.8 is positive
console.log(`0.00 is: ${posnegZero('0.00')}`); // 0.00 is: The number is +0
console.log(`-0.10 is: ${posnegZero("-0.10")}`); // -0.10 is: The number -0.1 is negative
console.log(`34.123 is: ${posnegZero(`34.123`)}`); // 34.123 is: The number 34.123 is positive
console.log(`-85.14 is: ${posnegZero('-85.14')}`); // -85.14 is: The number -85.14 is negative