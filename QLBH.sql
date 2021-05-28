create database QLBH
go
use QLBH
go
create table tblHang
(
	maHang varchar(10),
	tenHang nvarchar(100),
	tien money,
	loaiHang nvarchar(50),
	canNang float,
	chieuCao float
)

create table tblKhachHang
(
	maKhachHang varchar(10),
	tenKhachHang nvarchar(50),
	SDT int,
	diaChi nvarchar(100),
	gioiTinh varchar(10)
)

create table tbDonHang
(
	MaDonHang varchar(10),
	TenDonHang nvarchar(50),
	SoLuong nvarchar(50),
	Tien money,
	ngayMua date
)