DROP PROCEDURE IF EXISTS  TEN_CAN_TAO;
DELIMITER $$
CREATE PROCEDURE TEN_CAN_TAO (IN BIEN_THAY_DOI VARCHAR(30)) -- KHONG FIX CUNG DU LIEU
     BEGIN
         SELECT *
         FROM `ACCOUNT`
         WHERE AccountID = BIEN_THAY_DOI;
	 END$$
DELIMITER ;
CALL TEN_CAN_TAO(1);

-- Question 1	Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó
DROP PROCEDURE IF EXISTS  TEN_PHONG_BAN;
DELIMITER $$
CREATE PROCEDURE 	TEN_PHONG_BAN (IN depart_name VARCHAR(30))
     BEGIN  
			SELECT A.AccountID, A.Fullname, D.DepartmentName
            FROM department D
            JOIN `Account` A ON D.DepartmentID=A.DepartmentID
            WHERE D.DepartmentName= depart_name;
	 END $$
DELIMITER ;
CALL TEN_PHONG_BAN( 'Bảo vệ');

-- Question 2: Tạo store để in ra số lượng account trong mỗi group
DROP PROCEDURE IF EXISTS TAI_KHOAN;
DELIMITER $$
CREATE PROCEDURE  TAI_KHOAN ( IN nhom_can_tim TINYINT )
		BEGIN 
			SELECT 	GA.GroupID, A.AccountID ,A.FullName
            FROM 	groupaccount GA
            JOIN 	`account` A ON A.AccountID = GA.AccountID
            WHERE 	GA.GroupID = nhom_can_tim;
		END $$
DELIMITER ;
CALL TAI_KHOAN ('1');

-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạotrong tháng hiện tại
DROP PROCEDURE IF EXISTS question_trong_thang;
DELIMITER $$
CREATE PROCEDURE question_trong_thang( IN loai_cau_hoi ENUM ('essay' , 'Multiple-Choice'), IN thoi_gian_can_tim DATETIME)
		BEGIN 
			SELECT q.QuestionID, TQ.TypeID, Q.CreateDate, COUNT(TQ.TypeID) AS So_lan
            FROM 	question Q
            JOIN 	typequestion TQ ON Q.TypeID = TQ.TypeID
            WHERE 	TQ.TypeName = loai_cau_hoi OR Q.CreateDate = thoi_gian_can_tim
            GROUP BY TQ.TypeID;
		END $$
DELIMITER ;
CALL question_trong_thang('essay', '2020-04-07');

-- 	Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất

DROP PROCEDURE IF EXISTS Max_question ;
DELIMITER $$
CREATE PROCEDURE Max_question (IN loai_cau_hoi ENUM ('essay' , 'Multiple-Choice'))
	BEGIN 
		SELECT 		TQ.TypeID, COUNT(TQ.TypeID) AS So_cau_hoi
        FROM 		question Q
		JOIN 		typequestion TQ ON Q.TypeID = TQ.TypeID 
        WHERE 		TQ.TypeName = 'essay'
        GROUP BY 	TQ.TypeID
        ORDER BY    So_cau_hoi DESC
        LIMIT 1;
	END $$
DELIMITER ;
CALL Max_question('essay');

--  Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
DROP PROCEDURE IF EXISTS Max_questionName;
DELIMITER $$
CREATE PROCEDURE Max_questionName (IN loai_cau_hoi ENUM ('essay' , 'Multiple-Choice'))
	BEGIN 
		SELECT 		TQ.TypeID, Q.Content, COUNT(TQ.TypeID) AS So_cau_hoi
        FROM 		question Q
		JOIN 		typequestion TQ ON Q.TypeID = TQ.TypeID 
        WHERE 		TQ.TypeName = loai_cau_hoi
        GROUP BY 	TQ.TypeID
        ORDER BY    So_cau_hoi DESC
        LIMIT 1;
	END $$
DELIMITER ;
CALL Max_questionName('essay');

-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa chuỗi của người dùng nhập vào
DROP PROCEDURE IF EXISTS  Mot_chuoi;
DELIMITER $$
CREATE PROCEDURE Mot_chuoi (IN Nhap_chuoi SMALLINT, OUT chuoi_gourp TINYINT, OUT user_can_tim VARCHAR(100))
	BEGIN 
		SELECT 	A.AccountID, A.Username, G.GroupName
        FROM 	groupaccount GA
        JOIN 	`group` G ON GA.GroupID = G.GroupID
        JOIN 	`account` A ON GA.AccountID = A.AccountID
        WHERE 	A.AccountID = Nhap_chuoi;
	END $$
DELIMITER ;
SET @chuoi_gourp = '';
SET @user_can_tim = '' ;
CALL Mot_chuoi('3', @chuoi_gourp, @user_can_tim);

-- Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email vàtrong store sẽ tự động gán:username sẽ giống email nhưng bỏ phần @..mail đipositionID: sẽ có default là developerdepartmentID: sẽ được cho vào 1 phòng chờSau đó in ra kết quả tạo thành công

DROP PROCEDURE IF EXISTS Nguoi_dung_nhap;
DELIMITER $$
CREATE PROCEDURE Nguoi_dung_nhap (IN Ten_day_du VARCHAR(50), IN NameEmail VARCHAR(50))
	BEGIN 
		SELECT P.PositionName, A.FullName, A.Email
        FROM position P
        JOIN `account` A ON P.PositionID= A.PositionID
        WHERE A.FullName = Ten_day_du OR A.Username = NameEmail;
	END$$
DELIMITER ;
CALL Nguoi_dung_nhap ('Nguyen Thanh Tung', 'duongghuu');

-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất
DROP PROCEDURE IF EXISTS Max_content;
DELIMITER $$ 
CREATE PROCEDURE Max_content ( IN nguoi_dung_nhap ENUM ('Essay', 'Multiple-Choice'))
	BEGIN
		SELECT 	 Q.QuestionID, AW.Content, LENGTH(AW.Content) AS cau_tra_loi_dai_nhat
        FROM	 question Q
        JOIN	 typequestion TQ ON Q.TypeID = TQ.TypeID
        JOIN	 answer AW ON AW.QuestionID = Q.QuestionID
        WHERE 	 TQ.TypeName = nguoi_dung_nhap
        ORDER BY LENGTH(AW.Content) DESC
        LIMIT 	 1;
	END$$
DELIMITER ; 
CALL Max_content ('Essay');


-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID
DROP PROCEDURE IF EXISTS xoa_Exam;
DELIMITER $$
CREATE PROCEDURE xoa_Exam ( IN Nguoi_dung_nhap TINYINT)
	BEGIN 
		DELETE FROM examquestion
		WHERE ExamID = Nguoi_dung_nhap;
	END $$
DELIMITER ;
CALL xoa_Exam('2');

-- Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử dụng store ở câu 9 để xóa) Sau đó in số lượng record đã remove từ các table liên quan trong khi removing
DROP PROCEDURE IF EXISTS 3_years_ago;
DELIMITER $$
CREATE PROCEDURE 3_years_ago()
BEGIN 
		DELETE 
			FROM `exam`
			WHERE exam_id = (	SELECT exam_id
								FROM `exam`
								WHERE YEAR(now())-YEAR(create_date) >3 );
				
END $$
DELIMITER ;
-- Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng
			--  nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được
			--  chuyển về phòng ban default là phòng ban chờ việc
DROP PROCEDURE IF EXISTS XOA_PB;
DELIMITER $$
CREATE PROCEDURE XOA_PB (in input_department_name varchar(50))
BEGIN 
	UPDATE `account`
    SET department_id = 1
    WHERE departmen_id = (	SELECT departmen_id
							FROM `department`
							WHERE department_name = input_department_name);
	DELETE
    FROM `department` 
	WHERE department_name = input_department_name;
END$$
DELIMITER ;
            
            
-- Question 13: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong 6
		-- tháng gần đây nhất
		-- (Nếu tháng nào không có thì sẽ in ra là "không có câu hỏi nào trong tháng")

DELIMITER $$
CREATE PROCEDURE NUMBER_QUESTION_6_MONTH_AGO ()
BEGIN 
	SELECT COUNT(question_id) as so_cau_hoi
    FROM `question`
    GROUP BY create_date
    HAVING MONTH(create_date) =MONTH(CURRENT_DATE - INTERVAL 0 MONTH)
    UNION 
    SELECT COUNT(question_id) AS so_cau_hoi
    FROM `question`
    GROUP BY create_date
    HAVING MONTH(create_date) =MONTH(CURRENT_DATE - INTERVAL 1 MONTH)
	UNION
    SELECT COUNT(question_id) AS so_cau_hoi
    FROM `question`
    GROUP BY create_date
    HAVING MONTH(create_date) =MONTH(CURRENT_DATE - INTERVAL 2 MONTH)
	UNION
    SELECT COUNT(question_id) AS so_cau_hoi
    FROM `question`
    GROUP BY create_date
    HAVING MONTH(create_date) =MONTH(CURRENT_DATE - INTERVAL 3 MONTH)
	UNION
    SELECT COUNT(question_id) AS so_cau_hoi
    FROM `question`
    GROUP BY create_date
    HAVING MONTH(create_date) =MONTH(CURRENT_DATE - INTERVAL 4 MONTH)
	UNION
    SELECT COUNT(question_id) AS so_cau_hoi
    FROM `question`
    GROUP BY create_date
    HAVING MONTH(create_date) =MONTH(CURRENT_DATE - INTERVAL 5 MONTH);
END$$
DELIMITER ;


            
            