-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 05. Mai 2022 um 19:30
-- Server-Version: 10.4.22-MariaDB
-- PHP-Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `m306`
--
CREATE DATABASE IF NOT EXISTS `m306` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `m306`;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `adminlogin`
--

CREATE TABLE IF NOT EXISTS `adminlogin` (
  `id` int(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `adminlogin`
--

INSERT INTO `adminlogin` (`id`, `username`, `password`) VALUES
(1, 'Kikocup', 'Kikocup');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `wordlist`
--

CREATE TABLE IF NOT EXISTS `wordlist` (
  `id` int(100) NOT NULL,
  `word` varchar(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `wordlist`
--

INSERT INTO `wordlist` (`id`, `word`) VALUES
(1, 'avoid'),
(2, 'catch'),
(3, 'plant'),
(4, 'laugh'),
(5, 'torch'),
(6, 'drink'),
(7, 'march'),
(8, 'smart'),
(9, 'movie');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
