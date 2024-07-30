-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 30 Jul 2024 pada 06.02
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `data_karyawan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `input_data_karyawan`
--

CREATE TABLE `input_data_karyawan` (
  `nip` varchar(15) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `jabatan` varchar(50) NOT NULL,
  `jenis_kelamin` varchar(15) NOT NULL,
  `agama` varchar(15) NOT NULL,
  `status` varchar(20) NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `input_data_karyawan`
--

INSERT INTO `input_data_karyawan` (`nip`, `nama`, `jabatan`, `jenis_kelamin`, `agama`, `status`, `alamat`) VALUES
('123', 'Dinar', 'IT', 'perempuan', 'Islam', 'belum menikah', 'Surabaya'),
('111', 'Safira Tracy', 'Staff Administrasi', 'perempuan', 'Kristen', 'menikah', 'Surabaya Barat'),
('112', 'Rony P', 'CEO', 'laki-laki', 'Kristen', 'menikah', 'Jakarta'),
('222', 'Nuca Pratama', 'HRD', 'laki-laki', 'Islam', 'belum menikah', 'Semarang');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
