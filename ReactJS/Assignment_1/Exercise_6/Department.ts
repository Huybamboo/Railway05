// Tạo file Department.ts có chứa
    // o Tạo class Department có chứa property id, name, tạo
        // constructor, getter cho các property
    // o Tạo object department1 có id = 1, name = "A"
    // o Tạo function printDepartment(department) và in ra thông tin
        // department vừa nhập vào
export class Department {
    private static counter : number = 0;
    ID : number;
    Name : string;

    constructor(Name : string){
        this.ID = ++Department.counter;
        this.Name = Name;
    }

    public setName(): string{
        return this.Name;
    }
    public getName(Name:string){
        this.Name = Name;
    }

    public PrintDep(){
        console.log("ID là: " + this.ID);
        console.log("Name là: " + this.Name);
    }

}