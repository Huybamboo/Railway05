"use strict";
exports.__esModule = true;
exports.Position = void 0;
var Position = /** @class */ (function () {
    function Position(PositionName) {
        this.PositionID = ++Position.counter;
        this.PositionName = PositionName;
    }
    Position.prototype.setPositionName = function () {
        return this.PositionName;
    };
    Position.prototype.getPositionName = function (PositionName) {
        this.PositionName = PositionName;
    };
    Position.prototype.printPosition = function () {
        console.log("ID position là: " + this.PositionID);
        console.log("Name position là: " + this.PositionName);
    };
    Position.counter = 0;
    return Position;
}());
exports.Position = Position;
