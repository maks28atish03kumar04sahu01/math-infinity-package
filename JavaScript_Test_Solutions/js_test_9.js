// PRINT RANGE1 TO RANGE2 IN STRING FORMAT

import {rangetorangeString} from "mathinfinity";

rangetorangeString(10, 20); // 10 11 12 13 14 15 16 17 18 19 20 
rangetorangeString('10', 20); // 10 11 12 13 14 15 16 17 18 19 20 
rangetorangeString(10, "20"); // 10 11 12 13 14 15 16 17 18 19 20 
rangetorangeString(`10`, 20); // 10 11 12 13 14 15 16 17 18 19 20 

rangetorangeString(50, 60); // 50 51 52 53 54 55 56 57 58 59 60
rangetorangeString('50', '60'); // 50 51 52 53 54 55 56 57 58 59 60
rangetorangeString("50", "60"); // 50 51 52 53 54 55 56 57 58 59 60
rangetorangeString(`50`, `60`); // 50 51 52 53 54 55 56 57 58 59 60
