-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 21, 2024 at 07:35 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `teamdata`
--

-- --------------------------------------------------------

--
-- Table structure for table `teaminfo`
--

CREATE TABLE `teaminfo` (
  `TeamName` varchar(200) NOT NULL,
  `PlayedMatch` int(5) NOT NULL DEFAULT 0,
  `Win` int(5) NOT NULL DEFAULT 0,
  `Point` int(5) NOT NULL DEFAULT 0,
  `PlayersName` text NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teaminfo`
--

INSERT INTO `teaminfo` (`TeamName`, `PlayedMatch`, `Win`, `Point`, `PlayersName`) VALUES
('CSE Boosters', 1, 0, -1, 'Utsho'),
('CSE Knight Riders', 0, 0, 0, 'Zahid, Faysal, Rakib, Anisur, Sazzad'),
('CSE Vikings', 1, 1, 3, 'jaMIL'),
('CSE Worriors', 0, 0, 0, '0');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `teaminfo`
--
ALTER TABLE `teaminfo`
  ADD PRIMARY KEY (`TeamName`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
