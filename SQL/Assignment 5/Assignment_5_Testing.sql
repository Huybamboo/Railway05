-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
DROP VIEW IF EXISTS Nv_phong_sale;
CREATE VIEW Nv_phong_sale AS
SELECT D.DepartmentID, D.DepartmentName, A.Fullname
FROM Department D
join `account` A ON D.DepartmentID= A.DepartmentID
Where  D.DepartmentName = 'sale';

SELECT *
FROM Nv_phong_sale;

-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
DROP VIEW IF EXISTS thong_tin_Acc_tham_gia_nhieu_nhom_nhat;
CREATE VIEW thong_tin_Acc_tham_gia_nhieu_nhom_nhat AS
SELECT		 A.*, count(GA.AccountID) AS So_lan
FROM		 `Account` A 
INNER JOIN	 Groupaccount GA ON A.AccountID= GA.AccountID
GROUP BY	 A.AccountID
HAVING		 count(GA.AccountID) = (SELECT   count(GA.AccountID)
									FROM `Account` A 
									INNER JOIN 	GroupAccount GA ON A.AccountID = GA.AccountID
									GROUP BY A.AccountID
									ORDER BY count(GA.AccountID) DESC
									LIMIT 1);
                                    
SELECT *
FROM thong_tin_Acc_tham_gia_nhieu_nhom_nhat;
-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi                                

SELECT *
FROM question
WHERE Content > 300;

-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
DROP VIEW IF EXISTS PB_nhieu_nv;
CREATE VIEW PB_nhieu_nv AS
SELECT	D.DepartmentName,COUNT(PositionID) AS so_nv
FROM `Account` A
INNER JOIN department D ON A.DepartmentID = D.DepartmentID
GROUP BY PositionID
ORDER BY COUNT(PositionID) DESC
LIMIT 1 ;

SELECT *
FROM PB_nhieu_nv;


-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
DROP VIEW IF EXISTS AS_ho_nguyen;
CREATE VIEW AS_ho_nguyen AS
SELECT A.FullName, Q.QuestionID, Q.Content
FROM `account` A
INNER JOIN question Q ON A.AccountID = Q.QuestionID
WHERE SUBSTRING_INDEX(FullName,' ',1) = 'Nguyen';

SELECT * 
FROM AS_ho_nguyen;