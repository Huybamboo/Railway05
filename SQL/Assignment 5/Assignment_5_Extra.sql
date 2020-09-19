-- Exercise 1: Subquery
   -- Question 1: Viết 1 query lấy thông tin "Name" từ bảng Production.Product có namecủa ProductSubcategory là 'Saddles'.

SELECT P.`Name`
FROM product P
INNER JOIN productsubcategory PDSCG ON P.productsubcategoryID= PDSCG.productsubcategoryID
WHERE PDSCG.`Name` LIKE 'Saddles';

   -- Question 2: Thay đổi câu Query 1 để lấy được kết quả sau co ‘Bo%'
SELECT P.`Name`
FROM product P
INNER JOIN productsubcategory PDSCG ON P.productsubcategoryID= PDSCG.productsubcategoryID
WHERE  (P.name) LIKE '%Bo%' ;
   -- Question 3:Viết câu query trả về tất cả các sản phẩm có giá rẻ nhất (lowest ListPrice) và TouringBike (nghĩa là ProductSubcategoryID = 3)
SELECT 
    `Name`
FROM
    product
WHERE ProductSubcategoryID = 3 and
    ListPrice = (SELECT 
            *
        FROM
            (SELECT MIN(ListPrice)
					FROM product
					WHERE ProductSubcategoryID = 3) AS min_ListPrice);

-- Exercise 2: JOIN nhiều bảng
		-- Question 1: Viết query lấy danh sách tên country và province được lưu trongAdventureWorks2008sample database. 
SELECT SP.Name, CTR.Name
FROM stateprovince SP
INNER JOIN countryregion CTR ON SP.CountryRegionCode = CTR.CountryRegionCode;
        -- Question 2: Tiếp tục với câu query trước và thêm điều kiện là chỉ lấy country Germany và Canada
SELECT  CTR.Name, SP.Name
FROM stateprovince SP
INNER JOIN countryregion CTR ON SP.CountryRegionCode = CTR.CountryRegionCode
WHERE CTR.Name LIKE 'Germany' OR CTR.Name LIKE 'Canada'
ORDER BY CTR.Name ASC;
        -- Question 3:SalesOrderID, OrderDate and SalesPersonID. Từ bảng SalesPerson, chúng ta lấy cột BusinessEntityID (là định danh của người sales), Bonus and the SalesYTD (là đã saleđược bao nhiêu người trong năm nay)
        
SELECT SH.SalesOrderID, SH.OrderDate, SH.SalesPersonID
FROM salesorderheader SH
LEFT JOIN salesperson SP ON SH.SalesPersonID = SP.SalesPersonID
WHERE SH.SalesPersonID IS NOT NULL;
		-- Question 4:Sử dụng câu query, thêm cột JobTitle and xóa cột SalesPersonID và BusinessEntityID.
DROP VIEW IF EXISTS QUESION_4;
CREATE VIEW QUESION_4 AS
			SELECT SOH.SalesOrderID, SOH.OrderDate, SP.Bonus, SP.SalesYTD
			FROM salesperson SP
			JOIN salesorderheader SOH ON SP.SalesPersonID = SOH.SalesPersonID;


