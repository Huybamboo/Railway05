"use strict";
exports.__esModule = true;
exports.Department = void 0;
var Department = /** @class */ (function () {
    function Department(DepartmentName) {
        this.DepartmentID = ++Department.counter;
        this.DepartmentName = DepartmentName;
    }
    Department.prototype.setDepartmentnName = function () {
        return this.DepartmentName;
    };
    Department.prototype.getDepartmentName = function (DepartmentName) {
        this.DepartmentName = DepartmentName;
    };
    Department.prototype.printDeparment = function () {
        console.log("departmentID là: " + this.DepartmentID);
        console.log("DepartmentName là: " + this.DepartmentName);
    };
    Department.counter = 0;
    return Department;
}());
exports.Department = Department;
