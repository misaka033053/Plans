use plans;
-- ----------------------------
-- 1、用户表
-- ----------------------------
CREATE TABLE plans_user (
  user_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  usr_name VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  create_date DATE NOT NULL,
  email VARCHAR(255),
  phone_num VARCHAR(255),
  gender VARCHAR(255) DEFAULT 'None',
  PRIMARY KEY (user_id)
);
-- ----------------------------
-- 2、储蓄计划表
-- ----------------------------
CREATE TABLE saving_plans (
  plan_id VARCHAR(255) NOT NULL PRIMARY KEY,
  user_Id INT,
  password VARCHAR(255) NOT NULL,
  plan_name VARCHAR(255) NOT NULL,
  target_amount FLOAT,
  period INT,
  interest_rate FLOAT,
  start_date DATE,
  end_date DATE
);
-- ----------------------------
-- 2、存款记录表
-- ----------------------------
CREATE TABLE deposit_record (
  record_id VARCHAR(255) NOT NULL PRIMARY KEY,
  plan_id VARCHAR(255) NOT NULL,
  deposit_date DATE NOT NULL,
  amount FLOAT NOT NULL
);
