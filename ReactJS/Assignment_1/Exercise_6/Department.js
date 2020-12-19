"use strict";
exports.__esModule = true;
exports.Department = void 0;
// Tạo file Department.ts có chứa
// o Tạo class Department có chứa property id, name, tạo
// constructor, getter cho các property
// o Tạo object department1 có id = 1, name = "A"
// o Tạo function printDepartment(department) và in ra thông tin
// department vừa nhập vào
var Department = /** @class */ (function () {
    function Department(Name) {
        this.ID = ++Department.counter;
        this.Name = Name;
    }
    Department.prototype.setName = function () {
        return this.Name;
    };
    Department.prototype.getName = function (Name) {
        this.Name = Name;
    };
    Department.prototype.PrintDep = function () {
        console.log("ID là: " + this.ID);
        console.log("Name là: " + this.Name);
    };
    Department.counter = 0;
    return Department;
}());
exports.Department = Department;
