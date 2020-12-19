// Ta có variable name và 1 function printName
// a) Hãy khai báo name là var và có scope là global
var name1 = "A";
console.log(name1);
{
    var name1 = "B";
    console.log(name1);
}
;
console.log(name1);
console.log("thay d0i duoc");
// b) Hãy khai báo name là var và có scope là local
var name2 = "c";
console.log(name2);
{
    var name2_1 = "D";
    console.log(name2_1);
}
;
console.log(name2);
console.log('khong thay doi duoc');
// c) Hãy thử thay đổi giá trị của name xem được không?
var name3 = "E";
console.log(name3);
{
    var name3_1 = "F";
    console.log(name3_1);
}
;
console.log(name3);
console.log('khong thay doi duoc');
