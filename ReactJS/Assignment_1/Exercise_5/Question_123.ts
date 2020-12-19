// Ta có variable name và 1 function printName

    // a) Hãy khai báo name là var và có scope là global
    
        var name1: string ="A";
        console.log(name1);
        {
            var name1:string = "B"
            console.log(name1)
        };
        console.log(name1);
        console.log("thay d0i duoc");
    // b) Hãy khai báo name là var và có scope là local
    let name2:string = "c";
    console.log(name2);
    {
        let name2:string = "D"
        console.log(name2)
    };
    console.log(name2);
    console.log('khong thay doi duoc');

    // c) Hãy thử thay đổi giá trị của name xem được không?
    const name3:string = "E";
    console.log(name3);
    {
        const name3:string = "F"
        console.log(name3)
    };
    console.log(name3)
    console.log('khong thay doi duoc');
