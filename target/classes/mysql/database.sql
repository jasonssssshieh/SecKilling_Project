

CREATE TABLE `miaosha`.`user_info` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(64) NOT NULL,
  `gender` INT NOT NULL COMMENT '//1: Male, 2: Female',
  `age` INT NOT NULL,
  `telephone` VARCHAR(45) NOT NULL,
  `register_mode` VARCHAR(45) NOT NULL COMMENT '//by phone, wechat, alipay, applepay and etc',
  `third_party_id` VARCHAR(64) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);


CREATE TABLE `miaosha`.`user_password` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `encrpt_password` VARCHAR(128) NOT NULL,
  `user_id` INT NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);

