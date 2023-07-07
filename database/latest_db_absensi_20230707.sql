-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 07, 2023 at 08:45 AM
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

--
-- Indexes for dumped tables
--

--
-- Indexes for table `absensi`
--
ALTER TABLE `absensi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `absensi`
--
ALTER TABLE `absensi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `absensi`
--
ALTER TABLE `absensi`
  ADD CONSTRAINT `absensi_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
