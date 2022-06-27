-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 26, 2022 lúc 05:17 PM
-- Phiên bản máy phục vụ: 10.4.24-MariaDB
-- Phiên bản PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `db_qlcb`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_canbo`
--

CREATE TABLE `tbl_canbo` (
  `macb` int(11) NOT NULL,
  `tencb` varchar(50) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `namsinh` int(11) NOT NULL,
  `gioitinh` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `diachi` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `manghe` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `tbl_canbo`
--

INSERT INTO `tbl_canbo` (`macb`, `tencb`, `namsinh`, `gioitinh`, `diachi`, `manghe`) VALUES
(72, 'Đỗ Ngọc Đức', 2001, 'Nam', 'Hà Nam', 0),
(81, 'Trần Duy Khương', 2001, 'Nam', 'Hải Dương', 1),
(82, 'Trần Văn Công', 1998, 'Nữ', 'Hải Phòng', 1),
(83, 'Trần Thị Minh', 2006, 'Nữ', 'Hải Nam', 1),
(84, 'Trần Thành ', 1995, 'Nam', 'Quảng Bình', 3),
(85, 'Lê Thị Thơm', 2004, 'Nữ', 'Hà Giang', 3),
(86, 'Nguyễn Tiến Long', 1997, 'Nam', 'Nghệ An', 3),
(87, 'Trịnh Văn Sơn', 1995, 'Nam', 'Thanh Hóa', 2),
(88, 'Đỗ Ngọc Đức', 2001, 'Nam', 'Hà Nam', 2),
(89, 'Trần Tiến Công', 1997, 'Nam', 'Cà Mau', 1),
(90, 'Lương Văn Sơn', 1997, 'Nam', 'Quảng Ninh', 2),
(91, 'Phạm Thế Hùng', 2009, 'Nam', 'Ninh Bình', 3),
(92, 'Nguyễn Văn Dương', 2001, 'Nam', 'Hà Nam', 2),
(93, 'Hoàng Trịnh Trọng', 2000, 'Nam', 'Thanh Hóa', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_congnhan`
--

CREATE TABLE `tbl_congnhan` (
  `macn` int(11) NOT NULL,
  `bac` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `tbl_congnhan`
--

INSERT INTO `tbl_congnhan` (`macn`, `bac`) VALUES
(81, 9),
(82, 6),
(83, 10),
(89, 9),
(93, 7);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_kysu`
--

CREATE TABLE `tbl_kysu` (
  `maks` int(11) NOT NULL,
  `nganhdt` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `loaibang` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `tbl_kysu`
--

INSERT INTO `tbl_kysu` (`maks`, `nganhdt`, `loaibang`) VALUES
(87, 'CNTT', 'Giỏi'),
(88, 'Tự động hóa', 'Giỏi'),
(90, 'Cơ điện tử', 'Khá'),
(92, 'CNTT', 'Giỏi');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_nghe`
--

CREATE TABLE `tbl_nghe` (
  `manghe` int(11) NOT NULL,
  `tennghe` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `tbl_nghe`
--

INSERT INTO `tbl_nghe` (`manghe`, `tennghe`) VALUES
(0, 'Quản trị viên'),
(1, 'Công Nhân'),
(2, 'Kỹ Sư'),
(3, 'Nhân Viên');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_nhanvien`
--

CREATE TABLE `tbl_nhanvien` (
  `manv` int(11) NOT NULL,
  `congviec` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `tbl_nhanvien`
--

INSERT INTO `tbl_nhanvien` (`manv`, `congviec`) VALUES
(84, 'Phục vụ'),
(85, 'Phụ bếp'),
(86, 'Đầu bếp'),
(91, 'Quản lý');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_taikhoan`
--

CREATE TABLE `tbl_taikhoan` (
  `id` int(11) NOT NULL,
  `username` varchar(30) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `password` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `macb` int(11) NOT NULL,
  `quyen` int(3) NOT NULL,
  `trangthai` text COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `tbl_taikhoan`
--

INSERT INTO `tbl_taikhoan` (`id`, `username`, `password`, `macb`, `quyen`, `trangthai`) VALUES
(12, 'ducdn', 'admin@123', 72, 0, 'Đang hoạt động'),
(14, 'tranduykhuong', '76797943', 81, 1, 'Đang hoạt động'),
(15, 'tranvancong', '5742266', 82, 1, 'Đang hoạt động'),
(16, 'tranthiminh', '40446294', 83, 0, 'Vô hiệu hóa'),
(17, 'tranthanh', '3926818', 84, 0, 'Đang hoạt động'),
(18, 'lethithom', '41433794', 85, 1, 'Đang hoạt động'),
(19, 'nguyentienlong', 'long2001@', 86, 0, 'Đang hoạt động'),
(21, 'dongocduc', '11405031', 88, 1, 'Đang hoạt động'),
(22, 'trantiencong', '64423393', 89, 1, 'Đang hoạt động'),
(23, 'luongvanson', 'son2001@', 90, 1, 'Đang hoạt động'),
(24, 'phamthehung', '80902513', 91, 1, 'Đang hoạt động'),
(25, 'nguyenvanduong', '14878199', 92, 1, 'Đang hoạt động'),
(26, 'hoangtrinhtrong', '64539800', 93, 0, 'Đang hoạt động');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `tbl_canbo`
--
ALTER TABLE `tbl_canbo`
  ADD PRIMARY KEY (`macb`),
  ADD KEY `fk_nghe` (`manghe`);

--
-- Chỉ mục cho bảng `tbl_congnhan`
--
ALTER TABLE `tbl_congnhan`
  ADD PRIMARY KEY (`macn`);

--
-- Chỉ mục cho bảng `tbl_kysu`
--
ALTER TABLE `tbl_kysu`
  ADD PRIMARY KEY (`maks`);

--
-- Chỉ mục cho bảng `tbl_nghe`
--
ALTER TABLE `tbl_nghe`
  ADD PRIMARY KEY (`manghe`);

--
-- Chỉ mục cho bảng `tbl_nhanvien`
--
ALTER TABLE `tbl_nhanvien`
  ADD PRIMARY KEY (`manv`);

--
-- Chỉ mục cho bảng `tbl_taikhoan`
--
ALTER TABLE `tbl_taikhoan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_tk` (`macb`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `tbl_canbo`
--
ALTER TABLE `tbl_canbo`
  MODIFY `macb` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=94;

--
-- AUTO_INCREMENT cho bảng `tbl_nghe`
--
ALTER TABLE `tbl_nghe`
  MODIFY `manghe` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT cho bảng `tbl_taikhoan`
--
ALTER TABLE `tbl_taikhoan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `tbl_canbo`
--
ALTER TABLE `tbl_canbo`
  ADD CONSTRAINT `fk_nghe` FOREIGN KEY (`manghe`) REFERENCES `tbl_nghe` (`manghe`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `tbl_congnhan`
--
ALTER TABLE `tbl_congnhan`
  ADD CONSTRAINT `fk_macn` FOREIGN KEY (`macn`) REFERENCES `tbl_canbo` (`macb`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `tbl_kysu`
--
ALTER TABLE `tbl_kysu`
  ADD CONSTRAINT `fk_maks` FOREIGN KEY (`maks`) REFERENCES `tbl_canbo` (`macb`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `tbl_nhanvien`
--
ALTER TABLE `tbl_nhanvien`
  ADD CONSTRAINT `fk_manv` FOREIGN KEY (`manv`) REFERENCES `tbl_canbo` (`macb`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Các ràng buộc cho bảng `tbl_taikhoan`
--
ALTER TABLE `tbl_taikhoan`
  ADD CONSTRAINT `fk_tk` FOREIGN KEY (`macb`) REFERENCES `tbl_canbo` (`macb`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
