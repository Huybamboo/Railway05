export class Department{
    private static counter : number = 0;
    DepartmentID : number ;
    DepartmentName : string;

    constructor( DepartmentName : string){
        this.DepartmentID = ++Department.counter;
        this.DepartmentName = DepartmentName;
    }

    public setDepartmentName(): string{
        return this.DepartmentName;
    }

    public getDepartmentName(DepartmentName: string){
        this.DepartmentName = DepartmentName;
    }

    public printDeparment(){
        console.log("departmentID là: " + this.DepartmentID);
        console.log("DepartmentName là: " + this.DepartmentName);
    }
}
