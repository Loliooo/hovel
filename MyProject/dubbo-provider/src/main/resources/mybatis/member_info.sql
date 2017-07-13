CREATE TABLE `member_info` (
  `memberid` int(11) NOT NULL,
  `addid` int(11) DEFAULT NULL,
  `nickname` varchar(20) DEFAULT NULL,
  `truename` varchar(20) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `sex` char(2) DEFAULT NULL,
  PRIMARY KEY (`memberid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into member_info VALUES (18570,1,'如果我是dj你会爱我吗','oy','1992-06-19','女');COMMIT ;