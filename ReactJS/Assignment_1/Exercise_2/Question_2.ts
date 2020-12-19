// Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
    // có số 0 ở đầu cho đủ 5 chữ số)

var a = Math.floor(Math.random() * 100000);
if(a >= 0 && a <= 9)
    console.log("0000" + a)
else if (a >= 10 && a <= 99)
        console.log("000" + a)
    else if(a >= 100 && a <= 999)
            console.log("00" + a)
        else if(a >= 1000 && a <= 9999)
                console.log("0" + a)
            else console.log(a);

