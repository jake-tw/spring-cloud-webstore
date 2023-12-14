DROP TABLE IF EXISTS user;
CREATE TABLE IF NOT EXISTS user (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(64) NOT NULL,
  `email` VARCHAR(320) NOT NULL,
  `password` VARCHAR(64) NOT NULL,
  `salt` VARCHAR(36) NOT NULL,
  `create_time` DATETIME DEFAULT CURRENT_TIMESTAMP,
  `update_time` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY(`id`) USING BTREE,
  UNIQUE(`username`) USING BTREE,
  UNIQUE(`email`) USING BTREE
);
