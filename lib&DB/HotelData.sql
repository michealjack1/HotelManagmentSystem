-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 05, 2018 at 07:32 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `HotelData`
--

-- --------------------------------------------------------

--
-- Table structure for table `Admin`
--

CREATE TABLE `Admin` (
  `UserName` varchar(40) NOT NULL,
  `PassWord` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

-- --------------------------------------------------------

--
-- Table structure for table `Drink`
--

CREATE TABLE `Drink` (
  `id` int(11) NOT NULL,
  `DrinkName` varchar(40) NOT NULL,
  `Cost` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

-- --------------------------------------------------------

--
-- Table structure for table `Employee`
--

CREATE TABLE `Employee` (
  `id` int(11) NOT NULL,
  `FullName` varchar(40) NOT NULL,
  `Age` int(11) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Phone` varchar(20) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Salary` int(11) NOT NULL,
  `UserName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

-- --------------------------------------------------------

--
-- Table structure for table `Food`
--

CREATE TABLE `Food` (
  `id` int(11) NOT NULL,
  `FoodName` varchar(40) NOT NULL,
  `Cost` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

-- --------------------------------------------------------

--
-- Table structure for table `Guest`
--

CREATE TABLE `Guest` (
  `id` int(11) NOT NULL,
  `FullName` varchar(50) NOT NULL,
  `Phone` varchar(20) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Country` varchar(30) NOT NULL,
  `Status` varchar(20) NOT NULL,
  `NumberChildren` int(11) NOT NULL,
  `RoomID` int(11) NOT NULL,
  `EnterDate` date NOT NULL,
  `LeaveDate` date NOT NULL,
  `Email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

-- --------------------------------------------------------

--
-- Table structure for table `Room`
--

CREATE TABLE `Room` (
  `RoomID` int(11) NOT NULL,
  `RoomType` varchar(20) NOT NULL,
  `FoodCost` int(11) NOT NULL,
  `DrinkCost` int(11) NOT NULL,
  `TripCost` int(11) NOT NULL,
  `Payment` int(11) NOT NULL,
  `Available` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

-- --------------------------------------------------------

--
-- Table structure for table `Room_Drink`
--

CREATE TABLE `Room_Drink` (
  `RoomID` int(11) NOT NULL,
  `Drink_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

-- --------------------------------------------------------

--
-- Table structure for table `Room_Food`
--

CREATE TABLE `Room_Food` (
  `RoomID` int(11) NOT NULL,
  `Food_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

-- --------------------------------------------------------

--
-- Table structure for table `Room_Trip`
--

CREATE TABLE `Room_Trip` (
  `RoomID` int(11) NOT NULL,
  `Trip_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

-- --------------------------------------------------------

--
-- Table structure for table `Trip`
--

CREATE TABLE `Trip` (
  `id` int(11) NOT NULL,
  `TripName` varchar(40) NOT NULL,
  `Cost` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Admin`
--
ALTER TABLE `Admin`
  ADD PRIMARY KEY (`UserName`);

--
-- Indexes for table `Drink`
--
ALTER TABLE `Drink`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Employee`
--
ALTER TABLE `Employee`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UserName` (`UserName`);

--
-- Indexes for table `Food`
--
ALTER TABLE `Food`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `Guest`
--
ALTER TABLE `Guest`
  ADD PRIMARY KEY (`id`),
  ADD KEY `RoomID` (`RoomID`);

--
-- Indexes for table `Room`
--
ALTER TABLE `Room`
  ADD PRIMARY KEY (`RoomID`);

--
-- Indexes for table `Room_Drink`
--
ALTER TABLE `Room_Drink`
  ADD PRIMARY KEY (`RoomID`,`Drink_id`);

--
-- Indexes for table `Room_Food`
--
ALTER TABLE `Room_Food`
  ADD PRIMARY KEY (`RoomID`,`Food_id`);

--
-- Indexes for table `Room_Trip`
--
ALTER TABLE `Room_Trip`
  ADD PRIMARY KEY (`RoomID`,`Trip_id`);

--
-- Indexes for table `Trip`
--
ALTER TABLE `Trip`
  ADD PRIMARY KEY (`id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Guest`
--
ALTER TABLE `Guest`
  ADD CONSTRAINT `Guest_ibfk_1` FOREIGN KEY (`RoomID`) REFERENCES `Room` (`RoomID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
