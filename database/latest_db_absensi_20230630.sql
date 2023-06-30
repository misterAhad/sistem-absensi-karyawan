-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 30, 2023 at 04:28 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 7.4.33

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `absensi`
--

INSERT INTO `absensi` (`id`, `waktu_masuk`, `waktu_keluar`, `tanggal`, `user_id`) VALUES
(6, '2023-06-19 07:45:13', '2023-06-19 17:05:13', '2023-06-19', 4),
(7, '2023-06-19 07:55:13', '2023-06-19 17:15:13', '2023-06-19', 5),
(8, '2023-06-19 07:35:13', '2023-06-19 17:12:13', '2023-06-19', 8),
(9, '2023-06-19 07:38:13', '2023-06-19 17:28:13', '2023-06-19', 9),
(10, '2023-06-19 07:58:13', '2023-06-19 17:10:13', '2023-06-19', 10),
(11, '2023-06-19 07:48:13', '2023-06-19 17:04:13', '2023-06-19', 11),
(12, '2023-06-19 08:22:13', '2023-06-19 18:05:13', '2023-06-19', 12),
(13, '2023-06-19 07:49:13', '2023-06-19 17:07:13', '2023-06-19', 14),
(14, '2023-06-20 07:45:13', '2023-06-20 17:05:13', '2023-06-20', 4),
(15, '2023-06-20 07:55:13', '2023-06-20 17:15:13', '2023-06-20', 5),
(16, '2023-06-20 07:35:13', '2023-06-20 17:12:13', '2023-06-20', 8),
(17, '2023-06-20 07:38:13', '2023-06-20 17:28:13', '2023-06-20', 9),
(18, '2023-06-20 07:58:13', '2023-06-20 17:10:13', '2023-06-20', 10),
(19, '2023-06-20 07:48:13', '2023-06-20 17:04:13', '2023-06-20', 11),
(20, '2023-06-20 08:22:13', '2023-06-20 18:05:13', '2023-06-20', 12),
(21, '2023-06-20 07:49:13', '2023-06-20 17:07:13', '2023-06-20', 14),
(22, '2023-06-21 07:45:13', '2023-06-21 17:05:13', '2023-06-21', 4),
(23, '2023-06-21 07:55:13', '2023-06-21 17:15:13', '2023-06-21', 5),
(24, '2023-06-21 07:35:13', '2023-06-21 17:12:13', '2023-06-21', 8),
(25, '2023-06-21 07:38:13', '2023-06-21 17:28:13', '2023-06-21', 9),
(26, '2023-06-21 07:58:13', '2023-06-21 17:10:13', '2023-06-21', 10),
(27, '2023-06-21 07:48:13', '2023-06-21 17:04:13', '2023-06-21', 11),
(28, '2023-06-21 08:22:13', '2023-06-21 18:05:13', '2023-06-21', 12),
(29, '2023-06-21 07:49:13', '2023-06-21 17:07:13', '2023-06-21', 14);

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
  `penyetuju_id` int(11) DEFAULT NULL,
  `tanggal_pengajuan` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `cuti`
--

INSERT INTO `cuti` (`id`, `tanggal_mulai`, `tanggal_berakhir`, `alasan`, `tanggal_disetujui`, `status`, `user_id`, `penyetuju_id`, `tanggal_pengajuan`) VALUES
(4, '2023-06-19', '2023-06-23', 'Acara keluarga', '2023-05-28 04:26:57', 1, 4, 15, '2023-05-20'),
(5, '2023-06-26', '2023-06-29', 'Workshop di Jepang', '2023-06-16 05:34:40', 1, 5, 15, '2023-06-16'),
(6, '2023-07-01', '2023-07-04', 'Wisuda', '2023-06-17 05:34:40', 1, 10, 7, '2023-06-16'),
(7, '2023-08-20', '2023-08-25', 'Menikah', '2023-06-23 16:20:54', 1, 14, 3, '2023-06-19');

-- --------------------------------------------------------

--
-- Table structure for table `departemen`
--

CREATE TABLE `departemen` (
  `id` int(11) NOT NULL,
  `nama_dept` varchar(255) NOT NULL,
  `perusahaan_id` int(11) NOT NULL,
  `kepala_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `departemen`
--

INSERT INTO `departemen` (`id`, `nama_dept`, `perusahaan_id`, `kepala_id`) VALUES
(1, 'Departemen IT', 1, 15),
(2, 'Departemen Keuangan', 1, 13),
(3, 'Departemen SDM', 1, 3),
(11, 'Departemen Pemasaran', 1, 7);

-- --------------------------------------------------------

--
-- Table structure for table `jabatan`
--

CREATE TABLE `jabatan` (
  `id` int(11) NOT NULL,
  `nama_jabatan` varchar(50) NOT NULL,
  `role_level` int(11) NOT NULL,
  `departemen_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `jabatan`
--

INSERT INTO `jabatan` (`id`, `nama_jabatan`, `role_level`, `departemen_id`) VALUES
(1, 'Admin Aplikasi', 1, 1),
(2, 'Lead HR', 2, 3),
(3, 'Manager Dept. IT', 3, 1),
(4, 'Staff IT', 4, 1),
(5, 'Administrator 2', 1, 2),
(6, 'Manager Dept. Keuangan', 3, 2),
(8, 'Manajer Dept. SDM', 3, 3),
(9, 'Manajer Dept. Pemasaran', 3, 11),
(10, 'Staff Keuangan', 4, 2),
(11, 'Staff SDM', 4, 3),
(12, 'Staff Pemasaran', 4, 11);

-- --------------------------------------------------------

--
-- Table structure for table `kelompok_absensi`
--

CREATE TABLE `kelompok_absensi` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `waktu_masuk` time NOT NULL,
  `waktu_keluar` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kelompok_absensi`
--

INSERT INTO `kelompok_absensi` (`id`, `nama`, `waktu_masuk`, `waktu_keluar`) VALUES
(1, 'Normal Shift', '08:00:00', '17:00:00');

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `nama_lengkap`, `password`, `email`, `telepon`, `tanggal_lahir`, `tanggal_bergabung`, `aktif`, `nip`, `jabatan_id`, `kelompok_absensi_id`) VALUES
(1, 'admin', 'Admin Aplikasi', '123456', 'admin@presence.com', '000000000', '1990-08-01', '2022-08-02', 1, '1001123', 1, 1),
(2, 'wiwiek2766', 'Wiwiek Nurlianty', '123456', 'wiwiek@presence.com', '08821763812', '1982-07-04', '2022-08-31', 1, '1001124', 2, 1),
(3, 'mina6652', 'Mina Hasanah', '123456', 'mina@presence.com', '081821398', '1991-08-01', '2022-08-02', 1, '1001125', 8, 1),
(4, 'barata4551', 'Barata Yudha', '123456', 'barata@presence.com', '0828212899', '1997-08-01', '2022-08-02', 1, '1001126', 4, 1),
(5, 'febri1233', 'Febri Hidayat', '123456', 'febri@presence.com', NULL, '1999-06-14', '2022-08-11', 1, '1001127', 4, 1),
(7, 'katri5201', 'Katri Iskandar', '123456', 'katri@presence.com', '087726373618', '1974-11-05', '2004-05-01', 1, '1001128', 9, 1),
(8, 'iqbal7556', 'Iqbal Fahreza', '123456', 'iqbal@presence.com', '087826373619', '1993-05-23', '2017-07-01', 1, '1001129', 10, 1),
(9, 'ari2633', 'Muhammad Ari', '123456', 'ari@presence.com', '087726373620', '1990-02-11', '2021-03-01', 1, '1001130', 10, 1),
(10, 'dandy8733', 'Dandi Rafliansyah', '123456', 'dandy@presence.com', '087726373621', '1993-05-18', '2020-06-01', 1, '1001131', 12, 1),
(11, 'jihan4587', 'Jihan Nabila', '123456', 'jihan@presence.com', '087726373622', '1985-01-30', '2016-10-03', 1, '1001132', 12, 1),
(12, 'ayu4588', 'Ayu Prihatini', '123456', 'ayu@presence.com', '087726373623', '2000-04-11', '2021-05-15', 1, '1001133', 11, 1),
(13, 'rani6577', 'Rani Wijaya', '123456', 'rani@presence.com', '087726373624', '1983-03-02', '2012-03-01', 1, '1001134', 6, 1),
(14, 'zahra3484', 'Zahra Putri', '123456', 'zahra@presence.com', '087726373611', '1999-10-05', '2020-09-01', 1, '1001135', 11, 1),
(15, 'asri2197', 'Asri Artanti', '123456', 'asri@presence.com', '087726373621', '1993-02-21', '2017-03-01', 1, '1001136', 3, 1);

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT for table `cuti`
--
ALTER TABLE `cuti`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `departemen`
--
ALTER TABLE `departemen`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `jabatan`
--
ALTER TABLE `jabatan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
