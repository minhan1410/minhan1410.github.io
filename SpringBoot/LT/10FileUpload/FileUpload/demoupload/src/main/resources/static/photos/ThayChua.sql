/*
Character Strings
  char, varchar, varchar(max), text
 Unicode Character Strings 
  nchar, nvarchar, nvarchar(max), ntext
 Date and Time 
  datetime, smalldatetime
 Intger Numbers 
  int, smallint, tinyint, bigint, bit
 Special Data Types 
  sql_variant 
*/

--1.	Viết 1 Script tạo hai biến số nguyên (var1 và var2), thiết lập giá trị 
--cho hai biến đó là 2 và 4, In ra giá trị tổng của 2 biến đó.
declare @var1 int, @var2 int
select @var1 = 2, @var2 = 4
print @var1 + @var2

use NORTHWND
go
--2.	Trên CSDL Northwind. Viết 1 script thực hiện các công việc sau:
--o	Tạo một biến là MinOrder
--o	Lấy thông tin về tổng giá trị (số tiền) nhỏ nhất (Quantity * UnitPrice * (1-Discount)) 
--	của sản phẩm trong tất cả hoá đơn của khách hàng có mã CustomerID=’ALFKI’,  
--	gán giá trị này vào biến MinOrder
--o	 Hiển thị thông tin của biến MinOrder.
declare @MinOrder money
select @MinOrder = (select top 1 sum(Quantity * UnitPrice * (1-Discount)) as MinOd
					from Orders o join [Order Details] od on o.OrderID = od.OrderID
					where CustomerID = 'ALFKI'
					group by o.OrderID
					order by MinOd asc) 
print @MinOrder

--3.	Trên CSDL Northwind. Viết 1 script thực hiện các công việc sau:
--o	Tạo 2 biến là OrderID, MaxQuantityOrder
--o	Lấy thông tin  về số hoá đơn (OrderID ) và tổng khối lượng hàng hoá của hoá đơn có 
--	tổng khối lượng hàng hoá (Quantity) lớn nhất  trong tất cả hoá đơn của khách hàng có mã 
--	CustomerID=’ALFKI’,  gán các giá trị này lần lượt vào các biến vào biến OrderID, MaxQuantityOrder
--o	 Hiển thị thông tin của biến OrderID, MaxQuantityOrder
go
declare @OrderID int, @MaxQuantityOrder smallint
select @OrderID = OrderID, @MaxQuantityOrder = MaxQuantity
from (
	select top 1 o.OrderID, sum(Quantity) as MaxQuantity
	from Orders o join [Order Details] od on o.OrderID = od.OrderID
	where CustomerID = 'ALFKI'
	group by o.OrderID
	order by MaxQuantity
	) as T
--print 'Mã hóa đơn: ' + cast(@OrderID as varchar)
--print 'Tổng khối lượng hàng hóa: ' + cast(@MaxQuantityOrder as varchar)

print 'Mã hóa đơn: ' + convert(varchar,@OrderID)
print 'Tổng khối lượng hàng hóa: ' + convert(varchar,@MaxQuantityOrder)

--4. Viết một đoạn lệnh sử dụng câu lệnh While in ra kết quả như sau
--10 9 8 7 6 5 4 3 2 1
go
declare @arr varchar(30), @n int
select @arr = '', @n = 10
while @n > 0
begin
	set @arr = @arr + ' ' + cast(@n as varchar)
	set @n = @n - 1
end
print @arr

--7.	Trên CSDL Northwind , Viết đoạn lệnh sử dụng lệnh Exec thực hiện việc 
--hiển thị thông tin CompanyName của khách hàng  có CustomerID =ALFKI
go
declare @Company varchar(300)
set @Company = 'select CompanyName from Customers where CustomerID = ''ALFKI'''
exec(@Company)

--8.	Trên CSDL Northwind , Viết đoạn lệnh sử dụng hàm sp_executesql để thực hiện
--	Khai báo biến, nhập thông tin về mã khách hàng
--	Sử dụng hàm sp_executesql để thực hiện câu truy vấn liệt kê tất cả các hoá đơn 
--	của khách hàng có mã khách hàng vừa nhập. 
declare @i as varchar(10)
set @i = 'ALFKI'

declare @sql nvarchar(300)
set @sql = 'select * from Orders where CustomerID = @cusid'
exec sp_executesql
@stmt = @sql,
@params = N'@cusid varchar(10)',
@cusid = @i

--9.	Trên CSDL Northwind , Viết đoạn lệnh thêm mới thông tin vào bảng [Order Details] 
--	(sử dụng cấu trúc Try/Catch để bắt lỗi, dùng hàm Raiserror() để phát sinh lỗi) :
--a.	Khai báo các biến, nhập giá trị cho các biến @OrderID, @ProductID, @UnitPrice, @Quantity, @Discount
--b.	Kiểm tra nếu số lượng hàng (@Quantity) <= 0 thì hiện ra thông báo lỗi “Số lượng sản phẩm phải >0” 
--	và không thực hiện lệnh thêm mới dữ liệu
--c.	Kiểm tra nếu số giảm giá  (@Discount) > 10 thì hiện ra thông báo lỗi “% giảm giá phải <=10%” 
--	và không thực hiện lệnh thêm mới dữ liệu
--d.	Nếu thoả mãn hai điều kiện trên thực hiện thêm mới dữ liệu vào bảng [Order Details]. 
--e.	Bắt các lỗi thêm mới dữ liệu nếu có và hiển thị thông tin của lỗi. 
go
declare  @OrderID int, @ProductID int, @UnitPrice money, @Quantity smallint, @Discount real
select  @OrderID = 1234, @ProductID = 15, @UnitPrice = 18, @Quantity = 0, @Discount = 11

begin try
	if @Quantity <=0
		raiserror ('So luong phai > 0', 10, 1)
	if @Discount >=10
		raiserror ('giam gia <10', 11, 1)
	insert into [Order Details](OrderID, ProductID, UnitPrice, Quantity, Discount)
	values(@OrderID, @ProductID, @UnitPrice, @Quantity, @Discount)
	print 'INSERT succeeded.';
end try

begin catch
PRINT Error_message();
--PRINT Error_number();
--PRINT Error_Severity()
--PRINT Error_State()
--PRINT Error_Procedure()
--PRINT Error_Line()
end catch