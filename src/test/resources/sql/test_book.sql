DROP TABLE IF EXISTS `test_book`;

CREATE TABLE `test_book` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '',
  `author` varchar(100) NOT NULL DEFAULT '',
  `publisher` varchar(255) DEFAULT '',
  `price` double(10,2) unsigned DEFAULT '0.00',
	`page` int(5) unsigned DEFAULT '100',
	`discount` double(4,2) DEFAULT '1.0',
  `pub_date` date DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



INSERT INTO `test_book` VALUES (1,'Java基础教程','张大强','人民邮电出版社',58.00,682,0.9,'2015-04-30'),(2,'Python高级编程','李小刚','天津人民出版社',62.00,532,0.95,'2014-08-22'),(3,'C语言教程','李峰','人民大学出版社',36.00,234,0.8,'2010-09-02'),(4,'JavaScript傻瓜教程','封连宇','北京大学出版社',43.00,226,0.8,'2017-01-15'),(5,'JavaScript高级编程技术','汤恩佑','人民文学出版社',103.00,1032,0.9,'2013-03-03');
