- -----------------------------------------------------
-- Schema whitecollar
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `whitecollar`;
USE `whitecollar` ;

-- -----------------------------------------------------
-- Table `whitecollar`.`shop`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `whitecollar`.`shop` (
  `id_shop` INT(11) NOT NULL,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `capacity` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id_shop`)
  );

-- -----------------------------------------------------
-- Table `whitecollar`.`collar`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `whitecollar`.`collar` (
  `id_collar` INT(11) NOT NULL,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `author` VARCHAR(45) NULL DEFAULT NULL,
  `price` DECIMAL(10,0) NULL DEFAULT NULL,
  `date` DATE NULL DEFAULT NULL,
  `shop_id_shop` INT(11) NOT NULL,
   PRIMARY KEY (`id_collar`),

  CONSTRAINT `fk_collar_shop`
    FOREIGN KEY (`shop_id_shop`)
    REFERENCES `whitecollar`.`shop` (`id_shop`)
    );
