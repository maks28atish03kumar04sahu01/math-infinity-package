// ARITHMETIC OPERATIONS

import {arithmeticOperation} from "mathinfinity";

console.log(`Addition: ${arithmeticOperation(12.47, 22.63, "+")}`); // Addition: 35.1
console.log(`Subtraction: ${arithmeticOperation(47.25, 18.49, "-")}`); // Subtraction: 28.76
console.log(`Multiplication: ${arithmeticOperation(40.12, 50.22, "*")}`); // Multiplication: 2014.8264
console.log(`Division: ${arithmeticOperation(90.17, 33.14, "/")}`); // Division: 2.7208811104405553
console.log(`Modulo: ${arithmeticOperation(101.22, 11.24, "%")}`); // Modulo: 0.059999999999996945

console.log(`Addition: ${arithmeticOperation("101.39", 210.147, "+")}`); // Addition: 311.537
console.log(`Subtraction: ${arithmeticOperation(50.36, "20.17", "-")}`); // Subtraction: 30.189999999999998
console.log(`Multiplication: ${arithmeticOperation('30.71', 40.55, "*")}`); // Multiplication: 1245.2904999999998
console.log(`Division: ${arithmeticOperation(90.18, '20.63', "/")}`); // Division: 4.371303926320892
console.log(`Modulo: ${arithmeticOperation(`100.99`, 28.14, "%")}`); // Modulo: 16.569999999999993