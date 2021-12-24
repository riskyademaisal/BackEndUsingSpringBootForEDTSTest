CREATE DATABASE `myedtsdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
CREATE TABLE `employee` (
  `id` bigint NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `salary` bigint DEFAULT NULL,
  `grade` varchar(1) DEFAULT NULL,
  `totalBonus` decimal(19,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

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
INSERT INTO `` (`id`,`name`,`salary`,`grade`,`totalBonus`) VALUES (111,'Tono',2000000,'2',NULL);
INSERT INTO `` (`id`,`name`,`salary`,`grade`,`totalBonus`) VALUES (1001,'Andi',30000000,'1',NULL);
INSERT INTO `` (`id`,`name`,`salary`,`grade`,`totalBonus`) VALUES (1003,'Beta',7563000,'1',NULL);
