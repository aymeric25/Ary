-- MySQL Script generated by MySQL Workbench
-- Fri Dec 15 14:30:57 2023
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Condo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Condo` (
  `host_id` INT NOT NULL,
  `number_of_units` INT NOT NULL,
  `num_of_floors` INT NOT NULL,
  PRIMARY KEY (`host_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Co_op`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Co_op` (
  `host_id` INT NOT NULL,
  `name_of_company` VARCHAR(45) NOT NULL,
  `num_of_co` INT NOT NULL,
  PRIMARY KEY (`host_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`House`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`House` (
  `host_id` INT NOT NULL,
  `num_of_floors` INT NOT NULL,
  `construction_year` INT NOT NULL,
  PRIMARY KEY (`host_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Listing`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Listing` (
  `host_id` INT NOT NULL,
  `host_location` VARCHAR(45) NOT NULL,
  `listing_area` VARCHAR(45) NOT NULL,
  `type_of_listing` VARCHAR(45) NULL,
  `Condo_host_id` INT NULL,
  `Co_op_host_id` INT NULL,
  `House_host_id` INT NULL,
  PRIMARY KEY (`host_id`, `Condo_host_id`, `Co_op_host_id`, `House_host_id`),
  INDEX `fk_Listing_Condo1_idx` (`Condo_host_id` ASC) VISIBLE,
  INDEX `fk_Listing_Co_op1_idx` (`Co_op_host_id` ASC) VISIBLE,
  INDEX `fk_Listing_House1_idx` (`House_host_id` ASC) VISIBLE,
  CONSTRAINT `fk_Listing_Condo1`
    FOREIGN KEY (`Condo_host_id`)
    REFERENCES `mydb`.`Condo` (`host_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Listing_Co_op1`
    FOREIGN KEY (`Co_op_host_id`)
    REFERENCES `mydb`.`Co_op` (`host_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Listing_House1`
    FOREIGN KEY (`House_host_id`)
    REFERENCES `mydb`.`House` (`host_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Host`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Host` (
  `user_id` INT NOT NULL,
  `num_of_listings` INT NOT NULL,
  `avg_num_reservations` DOUBLE NOT NULL,
  `ratings` DOUBLE NOT NULL,
  `Listing_host_id` INT NOT NULL,
  PRIMARY KEY (`user_id`, `Listing_host_id`),
  INDEX `fk_Host_Listing1_idx` (`Listing_host_id` ASC) VISIBLE,
  CONSTRAINT `fk_Host_Listing1`
    FOREIGN KEY (`Listing_host_id`)
    REFERENCES `mydb`.`Listing` (`host_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`User` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `firstname` VARCHAR(45) NOT NULL,
  `Host_user_id` INT NOT NULL,
  PRIMARY KEY (`user_id`, `Host_user_id`),
  UNIQUE INDEX `user_id_UNIQUE` (`user_id` ASC) VISIBLE,
  INDEX `fk_User_Host_idx` (`Host_user_id` ASC) VISIBLE,
  CONSTRAINT `fk_User_Host`
    FOREIGN KEY (`Host_user_id`)
    REFERENCES `mydb`.`Host` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;