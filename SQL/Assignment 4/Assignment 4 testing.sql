SELECT *
FROM `Group` G
JOIN `Account` A ON  G.CreatorID = A.AccountID
JOIN Department D ON A.DepartmentID  = D.DepartmentID;

-- Question 1 : Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT A.FullName , D.DepartmentID, D.DepartmentName
FROM `ACCOUNT` A
JOIN department D ON A.departmentID = D.departmentID;

-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010
SELECT *
FROM `ACCOUNT` A
JOIN department D ON A.departmentID = D.departmentID
WHERE CreateDate >= '2010-12-20';


-- Question 3: Viết lệnh để lấy ra tất cả các developer 
SELECT P.PositionID, P.PositionName, A.FullName
FROM `Account` A
JOIN Position P ON P.PositionID = A.PositionID
Where PositionName = 'Dev';

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >2 nhân viên

SELECT A.DepartmentID, COUNT(A.AccountID)
FROM  `Account` A
JOIN department D ON A.DepartmentID = D.DepartmentID
GROUP BY A.DepartmentID
HAVING COUNT(A.AccountID) >2;

-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiềunhất

SELECT 		Q.QuestionID -- , COUNT(EQ.ExamID), GROUP_CONCAT(EQ.ExamID)
FROM 		Question Q
LEFT JOIN	examquestion EQ ON EQ.QuestionID = Q.QuestionID
GROUP BY	Q.QuestionID
HAVING 		COUNT(EQ.ExamID) = (SELECT Max(So_Luong_Exam) 
								FROM ( SELECT 		COUNT(EQ.ExamID) AS So_Luong_Exam
										FROM 		Question Q
										LEFT JOIN	examquestion EQ ON EQ.QuestionID = Q.QuestionID
										GROUP BY	Q.QuestionID) AS statistic_Question_Exam);

-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question

SELECT  CQ.CategoryID, CQ.CategoryName, COUNT(Q.CategoryID) AS 'So_lan'
FROM categoryquestion CQ
JOIN question Q ON CQ.CategoryID = Q.CategoryID
GROUP BY CategoryID;

-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam

SELECT Q.Content, COUNT(EQ.QuestionID) AS 'So_lan'
FROM Question Q
JOIN examquestion EQ ON Q.QuestionID= EQ.QuestionID
GROUP BY Q.QuestionID;

-- Question 8: Lấy ra Question có nhiều câu trả lời nhất
SELECT 		Q.QuestionID, Q.Content, COUNT(A.QuestionID) AS 'So_lan'
FROM		Question Q 
INNER JOIN 	Answer A ON	Q.QuestionID = A.QuestionID
GROUP BY	A.QuestionID
HAVING		COUNT(A.QuestionID) =	(SELECT 	MAX(CountQ)
									 FROM		(SELECT 		COUNT(A.QuestionID) AS CountQ
												FROM			Answer A 
												RIGHT JOIN  Question Q ON A.QuestionID = Q.QuestionID 
												GROUP BY		A.QuestionID) AS MaxCountQ);

-- Question 9: Thống kê số lượng account trong mỗi group
SELECT		G.GroupID, COUNT(GA.AccountID) AS 'SO LUONG'
FROM		GroupAccount GA 
RIGHT JOIN 	`Group` G ON	GA.GroupID = G.GroupID
GROUP BY	G.GroupID;

-- Question 10: Tìm chức vụ có ít người nhất

SELECT 		P.PositionID, P.PositionName, COUNT(A.PositionID) AS 'So_nguoi'
FROM		Position P 
INNER JOIN 	`Account` A ON P.PositionID = A.PositionID
GROUP BY 	P.PositionID
HAVING		COUNT(A.PositionID)	=	(SELECT 	MIN(CountP)
									 FROM		(SELECT 	COUNT(P.PositionID) AS CountP
												FROM		Position P 
												INNER JOIN 	`Account` A ON P.PositionID = A.PositionID		
												GROUP BY	P.PositionID) AS MinCountP);

-- question 11 Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
SELECT *
FROM department;

-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì,....
SELECT *
FROM Question Q 
INNER JOIN 	Answer A ON	Q.QuestionID = A.QuestionID
INNER JOIN	TypeQuestion TQ ON Q.TypeID = TQ.TypeID;

-- Question 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
SELECT		T.TypeName, COUNT(Q.TypeID)
FROM		Question Q 
INNER JOIN 	TypeQuestion T ON Q.TypeID = T.TypeID
GROUP BY	Q.TypeID;


-- Question 14: Lấy ra group không có account nào
SELECT * 
FROM  `group` G
LEFT JOIN `Groupaccount` GA ON G.GroupID = GA.GroupID
WHERE GA.GroupID IS NULL;
-- Question 16: Lấy ra question không có answer nào
SELECT Q.QuestionID, Q.Content
FROM question Q
INNER JOIN answer A ON Q.QuestionID =A.QuestionID 
WHERE Q.QuestionID IN (5,6,7)

-- Question 17:  Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau
(SELECT 		A.FullName -- a)Lấy các account thuộc nhóm thứ 1
FROM 		`Account` A
JOIN 		GroupAccount GA ON A.AccountID = GA.AccountID
WHERE 		GA.GroupID = 1)
UNION
(SELECT 		A.FullName -- b)Lấy các account thuộc nhóm thứ 2
FROM 		`Account` A
JOIN 		GroupAccount GA ON A.AccountID = GA.AccountID
WHERE 		GA.GroupID = 2);

-- Question 18: 
(SELECT 		G.GroupName, COUNT(1) AS so_luong -- Lấy các group có lớn hơn 5 thành viên
FROM 		`Group` G
JOIN 		GroupAccount GA ON G.GroupID = GA.GroupID
GROUP BY	GA.GroupID
HAVING 		so_luong >= 5)
UNION
(SELECT 		G.GroupName, COUNT(1) AS so_luong -- Lấy các group có lớn hơn 7 thành viên
FROM 		`Group` G
JOIN 		GroupAccount GA ON G.GroupID = GA.GroupID
GROUP BY	GA.GroupID
HAVING 		so_luong >= 7)






