"use strict";
exports.__esModule = true;
var Department_1 = require("./Department");
var enumPosition_1 = require("./enumPosition");
var Position_1 = require("./Position");
var department1 = new Department_1.Department("Bảo vệ");
console.log(department1);
var pos1 = new Position_1.Position(enumPosition_1.Posi.Dev);
console.log(pos1);
