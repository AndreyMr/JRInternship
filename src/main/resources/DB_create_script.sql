CREATE DATABASE test;
USE test;
CREATE TABLE `test`.`part` (
  `id_part` INT(8) NOT NULL AUTO_INCREMENT,
  `part_name` VARCHAR(125) NOT NULL,
  `part_quantity` INT NULL DEFAULT 0,
  `part_need` BIT(1) NOT NULL,
  PRIMARY KEY (`id_part`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('материнская плата', '3', b'1');
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('процессор', '2', b'1');
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('видеокарта', '4', b'0');
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('радиатор', '3', b'1');
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('корпус', '5', b'1');
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('HDD', '2', b'1');
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('SSD', '0', b'0');
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('блок питания', '2', b'1');
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('оперативная память', '3', b'1');
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('PCI сетевая карта', '2', b'0');
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('PCI звуковая карта', '1', b'0');
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('куллер', '5', b'0');
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('SATA 2.0 data-кабель', '10', b'1');
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('SATA 3.0 data-кабель', '6', b'0');
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('DVD-ROM', '3', b'0');
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('плата расширения USB', '4', b'0');
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('Водяное охлаждение', '2', b'0');
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('подсветка корпуса', '1', b'0');
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('кабель доп. питания', '4', b'0');
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('PCI RAID контроллер', '2', b'0');
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('PCI WiFi адаптер', '6', b'0');
INSERT INTO `test`.`part` (`part_name`, `part_quantity`, `part_need`) VALUES ('PCI Bluetooth адаптер', '6', b'0');
