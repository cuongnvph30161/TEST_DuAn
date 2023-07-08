create database TEST_ANH
go
use  TEST_ANH
go

CREATE TABLE NguoiDung(
	Id int identity(1,1) NOT NULL PRIMARY KEY,
	Anh varbinary(max),
)
select * from NguoiDung
BACKUP DATABASE TEST_ANH TO DISK = 'C:\Users\Admin\Pictures\ktpm\TEST_ANH.bak'
