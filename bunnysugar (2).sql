-- phpMyAdmin SQL Dump
-- version 5.1.2
-- https://www.phpmyadmin.net/
--
-- 主機： localhost:3306
-- 產生時間： 2024-09-10 09:00:29
-- 伺服器版本： 5.7.24
-- PHP 版本： 8.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 資料庫: `bunnysugar`
--

-- --------------------------------------------------------

--
-- 資料表結構 `cart`
--

CREATE TABLE `cart` (
  `id` int(10) UNSIGNED NOT NULL COMMENT '主鍵ID',
  `user_id` int(10) UNSIGNED NOT NULL COMMENT '用戶ID',
  `total` int(10) NOT NULL DEFAULT '0' COMMENT '總計',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '創建時間',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改時間'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='購物車表';

-- --------------------------------------------------------

--
-- 資料表結構 `users`
--

CREATE TABLE `users` (
  `id` int(10) UNSIGNED NOT NULL,
  `account` varchar(1000) NOT NULL,
  `password` varchar(1000) NOT NULL,
  `email` varchar(1000) NOT NULL,
  `name` varchar(1000) NOT NULL,
  `gender` varchar(1000) NOT NULL,
  `phone` varchar(1000) NOT NULL,
  `birthday` datetime NOT NULL,
  `bunny_coin` decimal(10,2) NOT NULL DEFAULT '0.00',
  `is_active` varchar(100) NOT NULL DEFAULT '0',
  `verifying_token` varchar(1000) DEFAULT NULL,
  `forget_token` varchar(1000) DEFAULT NULL,
  `login_method` int(100) DEFAULT NULL,
  `google_token` varchar(1000) DEFAULT NULL,
  `facebook_token` varchar(1000) DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  `last_login_time` datetime NOT NULL,
  `game_times` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 傾印資料表的資料 `users`
--

INSERT INTO `users` (`id`, `account`, `password`, `email`, `name`, `gender`, `phone`, `birthday`, `bunny_coin`, `is_active`, `verifying_token`, `forget_token`, `login_method`, `google_token`, `facebook_token`, `create_time`, `update_time`, `last_login_time`, `game_times`) VALUES
(1, '1', '1', '1', '1', '1', '1', '2024-09-10 08:52:16', '0.00', '0', NULL, NULL, NULL, NULL, NULL, '2024-09-10 08:52:16', '2024-09-10 08:52:16', '2024-09-10 08:52:16', '2024-09-10 08:52:16'),
(2, 'user2', 'password2', 'user2@example.com', 'User Two', 'F', '1234567890', '1990-01-01 00:00:00', '10.00', '1', 'token2', 'forgettoken2', 0, 'googletoken2', 'facebooktoken2', '2024-09-10 09:00:00', '2024-09-10 09:00:00', '2024-09-10 09:00:00', '0000-00-00 00:00:00'),
(3, 'user3', 'password3', 'user3@example.com', 'User Three', 'M', '0987654321', '1985-05-15 00:00:00', '20.00', '1', 'token3', 'forgettoken3', 0, 'googletoken3', 'facebooktoken3', '2024-09-10 09:05:00', '2024-09-10 09:05:00', '2024-09-10 09:05:00', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- 資料表結構 `wish_list`
--

CREATE TABLE `wish_list` (
  `id` int(10) UNSIGNED NOT NULL COMMENT '主鍵ID',
  `user_id` int(10) UNSIGNED NOT NULL COMMENT '用戶ID',
  `cart_id` int(10) UNSIGNED NOT NULL COMMENT '購物車ID',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '創建時間',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改時間'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='願望清單表';

--
-- 已傾印資料表的索引
--

--
-- 資料表索引 `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`);

--
-- 資料表索引 `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- 資料表索引 `wish_list`
--
ALTER TABLE `wish_list`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `cart_id` (`cart_id`);

--
-- 在傾印的資料表使用自動遞增(AUTO_INCREMENT)
--

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `cart`
--
ALTER TABLE `cart`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主鍵ID';

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `users`
--
ALTER TABLE `users`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `wish_list`
--
ALTER TABLE `wish_list`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主鍵ID';

--
-- 已傾印資料表的限制式
--

--
-- 資料表的限制式 `cart`
--
ALTER TABLE `cart`
  ADD CONSTRAINT `cart_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE;

--
-- 資料表的限制式 `wish_list`
--
ALTER TABLE `wish_list`
  ADD CONSTRAINT `wish_list_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `wish_list_ibfk_2` FOREIGN KEY (`cart_id`) REFERENCES `cart` (`id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
