CREATE DATABASE `myedtsdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
CREATE TABLE `employee` (
  `id` decimal(19,2) NOT NULL,
  `grade` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `salary` decimal(19,2) DEFAULT NULL,
  `totalBonus` decimal(19,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;




/*
-- Query: SELECT `employee`.`id`,
    `employee`.`name`,
    `employee`.`salary`,
    `employee`.`grade`,
    `employee`.`totalBonus`
FROM `myedtsdb`.`employee`
LIMIT 0, 1000

-- Date: 2021-12-25 01:38
*/
INSERT INTO `` (`id`,`grade`,`name`,`salary`,`totalBonus`) VALUES (10001.00,'1','Jonah Bluesky',7563000.00,8319300.00);
INSERT INTO `` (`id`,`grade`,`name`,`salary`,`totalBonus`) VALUES (10002.00,'2','Stevenson Black',5124000.00,5431440.00);
INSERT INTO `` (`id`,`grade`,`name`,`salary`,`totalBonus`) VALUES (10004.00,'3','Susan Random',3980000.00,4099400.00);
