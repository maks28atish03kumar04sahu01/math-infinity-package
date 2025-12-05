// ARITHMETIC OPERATIONS

import {arithmeticOperation} from "mathinfinity";

console.log(`Addition: ${arithmeticOperation("10", "20", "+")}`); // Addition: 30
console.log(`Subtraction: ${arithmeticOperation('50', '20', "-")}`); // Subtraction: 30
console.log(`Multiplication: ${arithmeticOperation(`30`, `40`, "*")}`); // Multiplication: 1200
console.log(`Division: ${arithmeticOperation("90", `20`, "/")}`); // Division: 4.5
console.log(`Modulo: ${arithmeticOperation(`100`, '17', "%")}`); // Modulo: 15

console.log(`Addition: ${arithmeticOperation(10, `20`, "+")}`); // Addition: 30
console.log(`Subtraction: ${arithmeticOperation('50', 20, "-")}`); // Subtraction: 30
console.log(`Multiplication: ${arithmeticOperation(30, "40", "*")}`); // Multiplication: 1200
console.log(`Division: ${arithmeticOperation(`90`, 20, "/")}`); // Division: 4.5
console.log(`Modulo: ${arithmeticOperation(`100`, 17, "%")}`); // Modulo: 15