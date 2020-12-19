// Khai báo 1 array có các chữ từ "a" tới "e"
// Hãy in ra các element trong array theo
//  Value
var que3 = ["a", "b", "c", "d", "e"];
for (var _i = 0, que3_1 = que3; _i < que3_1.length; _i++) {
    var value1 = que3_1[_i];
    console.log("Theo Value " + value1);
}
//  Index 
for (var valuex in que3) {
    console.log("Theo Index " + valuex);
}
;
