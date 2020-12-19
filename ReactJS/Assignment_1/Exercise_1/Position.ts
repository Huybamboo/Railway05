import { Posi } from "./enumPosition";

export class Position{
    private static counter : number = 0;
    PositionID : number ;
    PositionName : Posi;


	constructor(PositionName : Posi) {
        this.PositionID = ++Position.counter;
        this.PositionName = PositionName;
    }

    public setPositionName() : Posi{
        return this.PositionName;
    }
    
    public getPositionName(PositionName : Posi){
        this.PositionName = PositionName;
    }

    public printPosition(){
        console.log("ID position là: " + this.PositionID);
        console.log("Name position là: " + this.PositionName);
    }

}