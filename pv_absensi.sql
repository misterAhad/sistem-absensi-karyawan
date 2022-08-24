-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 24, 2022 at 06:41 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pv_absensi`
--

-- --------------------------------------------------------

--
-- Table structure for table `absensi`
--

CREATE TABLE `absensi` (
  `id` int(11) NOT NULL,
  `waktu_masuk` datetime DEFAULT NULL,
  `waktu_keluar` datetime DEFAULT NULL,
  `tanggal` date NOT NULL,
  `user_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `absensi`
--

INSERT INTO `absensi` (`id`, `waktu_masuk`, `waktu_keluar`, `tanggal`, `user_id`) VALUES
(2, '2022-08-23 03:53:13', NULL, '2022-08-23', 5),
(3, '2022-08-23 10:57:33', '2022-08-23 11:00:00', '2022-08-23', 4),
(4, '2022-08-24 18:20:58', '2022-08-24 19:45:04', '2022-08-24', 4);

-- --------------------------------------------------------

--
-- Table structure for table `cuti`
--

CREATE TABLE `cuti` (
  `id` int(11) NOT NULL,
  `tanggal_mulai` date NOT NULL,
  `tanggal_berakhir` date NOT NULL,
  `alasan` varchar(255) NOT NULL,
  `tanggal_disetujui` datetime DEFAULT NULL,
  `status` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `penyetuju_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cuti`
--

INSERT INTO `cuti` (`id`, `tanggal_mulai`, `tanggal_berakhir`, `alasan`, `tanggal_disetujui`, `status`, `user_id`, `penyetuju_id`) VALUES
(3, '2022-08-02', '2022-08-11', 'Alasan', NULL, 2, 4, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `departemen`
--

CREATE TABLE `departemen` (
  `id` int(11) NOT NULL,
  `nama_dept` varchar(255) NOT NULL,
  `perusahaan_id` int(11) NOT NULL,
  `kepala_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `departemen`
--

INSERT INTO `departemen` (`id`, `nama_dept`, `perusahaan_id`, `kepala_id`) VALUES
(1, 'Departemen IT', 1, 3),
(2, 'Departemen Keuangan', 1, 3),
(3, 'Departemen SDM', 1, 3);

-- --------------------------------------------------------

--
-- Table structure for table `jabatan`
--

CREATE TABLE `jabatan` (
  `id` int(11) NOT NULL,
  `nama_jabatan` varchar(50) NOT NULL,
  `role_level` int(11) NOT NULL,
  `departemen_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jabatan`
--

INSERT INTO `jabatan` (`id`, `nama_jabatan`, `role_level`, `departemen_id`) VALUES
(1, 'Admin 1', 1, 1),
(2, 'HRD 1', 2, 1),
(3, 'Manager IT', 3, 1),
(4, 'Staff IT', 4, 1),
(5, 'Admin 2', 1, 2),
(6, 'Manager Keuangan', 3, 2);

-- --------------------------------------------------------

--
-- Table structure for table `kelompok_absensi`
--

CREATE TABLE `kelompok_absensi` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `waktu_masuk` time NOT NULL,
  `waktu_keluar` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kelompok_absensi`
--

INSERT INTO `kelompok_absensi` (`id`, `nama`, `waktu_masuk`, `waktu_keluar`) VALUES
(1, 'Normal Shift', '08:00:00', '18:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `perusahaan`
--

CREATE TABLE `perusahaan` (
  `id` int(11) NOT NULL,
  `nama_perusahaan` varchar(255) NOT NULL,
  `email` varchar(25) NOT NULL,
  `telepon` varchar(25) NOT NULL,
  `kategori` varchar(50) NOT NULL,
  `pic` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `perusahaan`
--

INSERT INTO `perusahaan` (`id`, `nama_perusahaan`, `email`, `telepon`, `kategori`, `pic`) VALUES
(1, 'ADW Consulting', 'adw@mail.com', '0818278112', 'Client', 'Dede');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `nama_lengkap` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `telepon` varchar(255) DEFAULT NULL,
  `tanggal_lahir` date NOT NULL,
  `tanggal_bergabung` date NOT NULL,
  `aktif` int(1) NOT NULL,
  `nip` varchar(10) NOT NULL,
  `jabatan_id` int(11) NOT NULL,
  `kelompok_absensi_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `nama_lengkap`, `password`, `email`, `telepon`, `tanggal_lahir`, `tanggal_bergabung`, `aktif`, `nip`, `jabatan_id`, `kelompok_absensi_id`) VALUES
(1, 'admin', 'Admin Aplikasi', '123456', 'admin@presence.com', '000000000', '2022-08-01', '2022-08-02', 1, '1001123', 1, 1),
(2, 'dimas2766', 'Dimas Joji', '123456', 'dimas@presence.com', '08821763812', '2022-07-04', '2022-08-31', 1, '1001124', 2, 1),
(3, 'mina6652', 'Mina Bonino', '123456', 'mina@presence.com', '081821398', '2022-08-01', '2022-08-02', 1, '1001125', 3, 1),
(4, 'barata4551', 'Barata Yudha', '123456', 'barata@presence.com', '0828212899', '2022-08-01', '2022-08-02', 1, '1001126', 4, 1),
(5, 'febri1233', 'Febri Hidayat', '123456', 'febri@presence.com', NULL, '1999-06-14', '2022-08-11', 1, '1001127', 4, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `absensi`
--
ALTER TABLE `absensi`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cuti`
--
ALTER TABLE `cuti`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `departemen`
--
ALTER TABLE `departemen`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `jabatan`
--
ALTER TABLE `jabatan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `kelompok_absensi`
--
ALTER TABLE `kelompok_absensi`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `perusahaan`
--
ALTER TABLE `perusahaan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `absensi`
--
ALTER TABLE `absensi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `cuti`
--
ALTER TABLE `cuti`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `departemen`
--
ALTER TABLE `departemen`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `jabatan`
--
ALTER TABLE `jabatan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `kelompok_absensi`
--
ALTER TABLE `kelompok_absensi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `perusahaan`
--
ALTER TABLE `perusahaan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
