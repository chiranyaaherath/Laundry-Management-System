-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 14, 2021 at 02:59 PM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `laundry`
--
CREATE DATABASE IF NOT EXISTS `laundry` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `laundry`;

-- --------------------------------------------------------

--
-- Table structure for table `delivery`
--

CREATE TABLE IF NOT EXISTS `delivery` (
  `name` varchar(100) NOT NULL,
  `location` varchar(100) NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `delivery`
--

INSERT INTO `delivery` (`name`, `location`, `price`) VALUES
('suranga pradeep', 'kandy', 300),
('saman lakmal', 'kurunegala', 240),
('ayesh chamika', 'kuliyapitiya', 360),
('supun avishka', 'polgahawela', 450),
('nisal sanjeewa', 'ambepussa', 270),
('kasun dias', 'alawwa', 330);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE IF NOT EXISTS `orders` (
  `name` varchar(100) NOT NULL,
  `location` varchar(100) NOT NULL,
  `weight` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`name`, `location`, `weight`) VALUES
('suranga pradeep', 'kandy', 10),
('saman lakmal', 'kurunegala', 8),
('ayesh chamika', 'kuliyapitiya', 12),
('supun avishka', 'polgahawela', 15),
('nisal sanjeewa', 'ambepussa', 13),
('kasun dias', 'alawwa', 11);

-- --------------------------------------------------------

--
-- Table structure for table `store`
--

CREATE TABLE IF NOT EXISTS `store` (
  `name` varchar(100) NOT NULL,
  `white` int(11) NOT NULL,
  `colour` int(11) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `store`
--

INSERT INTO `store` (`name`, `white`, `colour`, `status`) VALUES
('suranga pradeep', 6, 20, 'Finished'),
('saman lakmal', 4, 15, 'Finished'),
('ayesh chamika', 8, 24, 'Finished'),
('supun avishka', 10, 29, 'Finished'),
('nisal sanjeewa', 7, 20, 'Finished'),
('kasun dias', 7, 18, 'Finished');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `name` varchar(100) NOT NULL,
  `nic` varchar(100) NOT NULL,
  `mobile` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`nic`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`name`, `nic`, `mobile`, `username`, `password`) VALUES
('saman lakmal', '926985365v', '0788888888', 'saman', '456'),
('saman pradeep', '936254089v', '0799999999', 'saman', '123'),
('Kamal Herath', '945986327v', '0776666666', 'admin', 'admin'),
('supun avishka', '948965236v', '0733333333', 'supun', '111'),
('nisal sanjeewa', '958745692v', '0766666666', 'nisal', '222'),
('ayesh chamika', '963689562v', '0744444444', 'ayesh', '789'),
('kasun dias', '984785962v', '0711111111', 'kasun', '333');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
