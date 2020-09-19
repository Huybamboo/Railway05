-- Exercise 1: Tiếp tục với Database Testing System
	-- Question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo trước 1 năm trước

DROP TRIGGER IF EXISTS K_NHAP_NGAY;
DELIMITER $$
CREATE TRIGGER K_NHAP_NGAY
BEFORE
INSERT ON groupaccount
	FOR EACH ROW 
BEGIN
	IF NEW.YEAR(now())-YEAR(join_date) =1 THEN 
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = 'khong duoc nhap';
		END IF;
END $$
DELIMITER ;

-- Question 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào department "Sale" nữa, khi thêm thì hiện ra thông báo "Department
				--  "Sale" cannot add more user"
DROP TRIGGER IF EXISTS K_DC_THEM;
DELIMITER $$
CREATE TRIGGER K_DC_THEM
BEFORE
INSERT ON `account`
FOR EACH ROW 
BEGIN 
	IF NEW.DepartmentID = 2 THEN 	SIGNAL SQLSTATE '12345'
									SET MESSAGE_TEXT = 'Department Sale cannot add more user';
        END IF;
END $$
DELIMITER ;

-- -- Question 3: Cấu hình 1 group có nhiều nhất là 5 user

DROP TRIGGER IF EXISTS MAX_5;
DELIMITER $$
CREATE TRIGGER MAX_5
BEFORE
INSERT ON groupaccount
FOR EACH ROW
BEGIN
		IF ( SELECT GroupID
				FROM groupaccount 
                WHERE COUNT(AccountID)>5)
		THEN
        SIGNAL SQLSTATE '12345'
		SET MESSAGE_TEXT = 'Group with at most 5 user';
		END IF;
END$$
DELIMITER ;

-- --Question 4: Cấu hình 1 bài thi có nhiều nhất là 10 Question
DROP TRIGGER IF EXISTS Question_max_10;
DELIMITER $$
CREATE TRIGGER Question_max_10
BEFORE
INSERT ON `examquestion`
FOR EACH ROW
BEGIN
		IF ( SELECT ExamID
				FROM examquestion
                WHERE COUNT(QuestionID)>10 )
		THEN 	SIGNAL SQLSTATE '12345'
				SET MESSAGE_TEXT = 'The test has 10 questions at most';
		END IF;
END$$
DELIMITER ;

--  Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là
		--  admin@gmail.com (đây là tài khoản admin, không cho phép user xóa),
		--  còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông
		--  tin liên quan tới user đó 

DROP TRIGGER IF EXISTS not_del_admin;
DELIMITER $$
CREATE TRIGGER not_del_admin
BEFORE
DELETE ON `account`
FOR EACH ROW
	BEGIN
        IF OLD.Email ='admin@gmail.com' THEN 	SIGNAL SQLSTATE '12345'
												SET MESSAGE_TEXT = 'not_delete_account_admin';
        END IF;
    END $$
DELIMITER ;

--  Question 6: Không sử dụng cấu hình default cho field DepartmentID của table Account, hãy tạo trigger cho phép người dùng khi tạo account không điền
				--  vào departmentID thì sẽ được phân vào phòng ban "waiting Department"

DROP TRIGGER IF EXISTS waiting_DEP;
DELIMITER $$
CREATE TRIGGER waiting_DEP
BEFORE
INSERT ON `account`
FOR EACH ROW
BEGIN
		DECLARE new_department_id INT;
		SELECT DepartmentID INTO new_department_id 
		FROM department
		WHERE DepartmentName = 'Waiting Room';
	IF NEW.DepartmentID IS NULL THEN
	SET NEW.DepartmentID = new_department_id;
	END IF;
END$$
DELIMITER ;

-- Question 7: Cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗi question, trong đó có tối đa 2 đáp án đúng.

DROP TRIGGER IF EXISTS exam_max_4_answers;
DELIMITER $$
CREATE TRIGGER exam_max_4_answers
BEFORE
INSERT ON answer
FOR EACH ROW
	BEGIN
		SELECT COUNT(AnswerID) as so_luong_cau
        FROM answer
        GROUP BY QuestionID
        HAVING QuestionID = NEW.QuestionID;
        SELECT COUNT(AnswerID) as so_cau_dung
        FROM `answer` 
        GROUP BY QuestionID
        HAVING QuestionID = NEW.QuestionID AND isCorrect = '1';
        IF so_luong_cau > 4 and so_cau_dung >2 THEN SIGNAL SQLSTATE '12345'
													SET MESSAGE_TEXT = 'cannot create';
        END IF;
	END$$
    DELIMITER ;
    
-- Question 8: Viết trigger sửa lại dữ liệu cho đúng:
		--  Nếu người dùng nhập vào gender của account là nam, nữ, chưa xác định
		--  Thì sẽ đổi lại thành M, F, U cho giống với cấu hình ở database
DROP TRIGGER IF EXISTS gender_of_account;
DELIMITER $$
CREATE TRIGGER gender_of_account
BEFORE INSERT ON `account`
FOR EACH ROW
BEGIN 
	IF NEW.gender = 'nam' then SET gender = 'M';
	ELSEIF NEW.gender = 'nu' then SET gender = 'F';
    ELSEIF NEW.gender = 'chưa xác định' then SET gender= 'U';
	END IF ;
END$$
DELIMITER ;

-- Question 9: Viết trigger không cho phép người dùng xóa bài thi mới tạo được 2 ngày
DROP TRIGGER IF EXISTS cannot_delete_exam;
DELIMITER $$
CREATE TRIGGER cannot_delete_exam
BEFORE DELETE ON exam
FOR EACH ROW
BEGIN
	IF OLD.CreateDate =DATE_SUB(NOW(), INTERVAL 2 DAY) THEN
    SIGNAL SQLSTATE '12345'
	SET MESSAGE_TEXT = 'cannot delete exam';
    END IF ;
END$$
DELIMITER ;

-- Question 10: Viết trigger chỉ cho phép người dùng chỉ được update, delete các question khi question đó chưa nằm trong exam nào
DROP TRIGGER IF EXISTS cannot_update_delete_question;
DELIMITER $$
CREATE TRIGGER cannot_update_delete_question
BEFORE DELETE ON question
FOR EACH ROW
BEGIN 
    SELECT QuestionID AS QUESTION_IS_NOT_AVAILABLE_FOR_TEST
    FROM question
    WHERE QuestionID = (SELECT QuestionID
							FROM examquestion
							WHERE ExamID IS NULL);
	IF OLD.QuestionID = QUESTION_IS_NOT_AVAILABLE_FOR_TEST THEN SIGNAL SQLSTATE '12345'
																SET MESSAGE_TEXT = 'cannot delete question';
    END IF ;
END$$
DELIMITER ;

-- Question 12: Lấy ra thông tin exam trong đó:
				-- Duration <= 30 thì sẽ đổi thành giá trị "Short time"
				-- 30 < Duration <= 60 thì sẽ đổi thành giá trị "Medium time"
				-- Duration > 60 thì sẽ đổi thành giá trị "Long time"
SELECT Duration,
		CASE 
			WHEN Duration <= '60' THEN 'Short time'
            WHEN Duration > '60' AND Duration <= '90' THEN 'Medium time'
            WHEN Duration >= '120' THEN 'Long time'
		END AS HOW_TIME
FROM Exam;

-- Question 13: Thống kê số account trong mỗi group và in ra thêm 1 column nữa có tên
				--  là the_number_user_amount và mang giá trị được quy định như sau:
				-- 2
				-- Nếu số lượng user trong group =< 5 thì sẽ có giá trị là few
				-- Nếu số lượng user trong group <= 20 và > 5 thì sẽ có giá trị là normal
				-- Nếu số lượng user trong group > 20 thì sẽ có giá trị là higher

SELECT g.GroupID,
    CASE
		WHEN COUNT(ga.AccountID) <= 5 then 'few'
        WHEN COUNT(ga.AccountID) <= 20 then  'normal'
        ELSE 'higher'
	END AS the_number_user_amount
	FROM groupaccount ga
    left join `group` g on ga.GroupID = g.GroupID
    group by g.GroupID ;
    
    
-- Question 14: Thống kê số mỗi phòng ban có bao nhiêu user, nếu phòng ban nào không có user thì sẽ thay đổi giá trị 0 thành "Không có User"	
SELECT D.DepartmentID, D.DepartmentName,
	CASE 
		WHEN COUNT(A.AccountID) = 0 THEN 'Không có User'
		ELSE COUNT(A.AccountID)
		END AS Empty_rooms
FROM `account` A
LEFT JOIN `department` D ON A.DepartmentID = D.DepartmentID
GROUP BY  D.DepartmentID;