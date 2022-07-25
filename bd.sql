CREATE TABLE `Gestion_Park`.`EMPLOYE` (`MATRICULE` VARCHAR(255) NOT NULL , `NOM_EMPLOYE` VARCHAR(255) NOT NULL , `PRENOM_EMPLOYE` VARCHAR(255) NOT NULL ,`MOT_DE_PASS` VARCHAR(255) NOT NULL, PRIMARY KEY (`MATRICULE`)) ENGINE = InnoDB;

CREATE TABLE `Gestion_Park`.`AUTRES` ( `ID_AUTRES` INT NOT NULL AUTO_INCREMENT , `NOM` VARCHAR(255) NOT NULL , `DESCRIPTION` VARCHAR(255) NOT NULL , PRIMARY KEY (`ID_AUTRES`)) ENGINE = InnoDB;
CREATE TABLE `Gestion_Park`.`AUTRES_DISPO` ( `ID_AUTRES_DISPO` INT NOT NULL AUTO_INCREMENT , `ID_AUTRES` INT NOT NULL , PRIMARY KEY (`ID_AUTRES_DISPO`)) ENGINE = InnoDB;
CREATE TABLE `Gestion_Park`.`AUTRES_UTILISE` ( `ID_AUTRES_UTILISE` INT NOT NULL AUTO_INCREMENT , `ID_AUTRES` INT NOT NULL , `MATRICULE` VARCHAR(255) NOT NULL , PRIMARY KEY (`ID_AUTRES_UTILISE`)) ENGINE = InnoDB;
ALTER TABLE `AUTRES_DISPO` ADD CONSTRAINT `FK_AUTRES_1` FOREIGN KEY (`ID_AUTRES`) REFERENCES `AUTRES` (`ID_AUTRES`);
ALTER TABLE `AUTRES_UTILISE` ADD CONSTRAINT `FK_AUTRES_2` FOREIGN KEY (`ID_AUTRES`) REFERENCES `AUTRES` (`ID_AUTRES`);
ALTER TABLE `AUTRES_UTILISE` ADD CONSTRAINT `FK_AUTRES_3` FOREIGN KEY (`MATRICULE`) REFERENCES `EMPLOYE`(`MATRICULE`) ON DELETE RESTRICT ON UPDATE RESTRICT;

CREATE TABLE `Gestion_Park`.`LOGICIEL` ( `ID_LOGICIEL` INT NOT NULL AUTO_INCREMENT , `NOM_LOGICIEL` VARCHAR(255) NOT NULL , `TYPE` VARCHAR(255) NOT NULL ,`VERSION` VARCHAR(255) NOT NULL , PRIMARY KEY (`ID_LOGICIEL`)) ENGINE = InnoDB;
CREATE TABLE `Gestion_Park`.`LOGICIEL_DISPO` ( `ID_LOGICIEL_DISPO` INT NOT NULL AUTO_INCREMENT , `ID_LOGICIEL` INT NOT NULL , PRIMARY KEY (`ID_LOGICIEL_DISPO`)) ENGINE = InnoDB;
CREATE TABLE `Gestion_Park`.`LOGICIEL_UTILISE` ( `ID_LOGICIEL_UTILISE` INT NOT NULL AUTO_INCREMENT , `ID_LOGICIEL` INT NOT NULL , `MATRICULE` VARCHAR(255) NOT NULL , PRIMARY KEY (`ID_LOGICIEL_UTILISE`)) ENGINE = InnoDB;
ALTER TABLE `LOGICIEL_DISPO` ADD CONSTRAINT `FK_LOGICIEL_1` FOREIGN KEY (`ID_LOGICIEL`) REFERENCES `LOGICIEL`(`ID_LOGICIEL`) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE `LOGICIEL_UTILISE` ADD CONSTRAINT `FK_LOGICIEL_2` FOREIGN KEY (`ID_LOGICIEL`) REFERENCES `LOGICIEL`(`ID_LOGICIEL`);
ALTER TABLE `LOGICIEL_UTILISE` ADD CONSTRAINT `FK_LOGICIEL_3` FOREIGN KEY (`MATRICULE`) REFERENCES `EMPLOYE`(`MATRICULE`) ON DELETE RESTRICT ON UPDATE RESTRICT;

CREATE TABLE `Gestion_Park`.`MEMOIRE` ( `ID_MEMOIRE` INT NOT NULL AUTO_INCREMENT , `NOM_MEMOIRE` VARCHAR(255) NOT NULL , `CAPACITE` DOUBLE NOT NULL , PRIMARY KEY (`ID_MEMOIRE`)) ENGINE = InnoDB;
CREATE TABLE `Gestion_Park`.`MEMOIRE_DISPO` ( `ID_MEMOIRE_DISPO` INT NOT NULL AUTO_INCREMENT , `ID_MEMOIRE` INT NOT NULL , PRIMARY KEY (`ID_MEMOIRE_DISPO`)) ENGINE = InnoDB;
CREATE TABLE `Gestion_Park`.`MEMOIRE_UTILISE` ( `ID_MEMOIRE_UTILISE` INT NOT NULL AUTO_INCREMENT , `ID_MEMOIRE` INT NOT NULL , `MATRICULE` VARCHAR(255) NOT NULL , PRIMARY KEY (`ID_MEMOIRE_UTILISE`)) ENGINE = InnoDB;
ALTER TABLE `MEMOIRE_DISPO` ADD CONSTRAINT `FK_MEMOIRE_1` FOREIGN KEY (`ID_MEMOIRE`) REFERENCES `MEMOIRE`(`ID_MEMOIRE`) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE `MEMOIRE_UTILISE` ADD CONSTRAINT `FK_MEMOIRE_2` FOREIGN KEY (`ID_MEMOIRE`) REFERENCES `MEMOIRE`(`ID_MEMOIRE`) ON DELETE RESTRICT ON UPDATE RESTRICT; 
ALTER TABLE `MEMOIRE_UTILISE` ADD CONSTRAINT `FK_MEMOIRE_3` FOREIGN KEY (`MATRICULE`) REFERENCES `EMPLOYE`(`MATRICULE`) ON DELETE RESTRICT ON UPDATE RESTRICT;

CREATE TABLE `Gestion_Park`.`ORDINATEUR` ( `ID_ORDINATEUR` INT NOT NULL AUTO_INCREMENT , `NOM` VARCHAR(255) NOT NULL , `MARQUE` VARCHAR(255) NOT NULL,`PROCESSEUR` VARCHAR(255) NOT NULL,`RAM` DOUBLE NOT NULL,`ROM` DOUBLE NOT NULL,`VITESSE` DOUBLE NOT NULL ,PRIMARY KEY (`ID_ORDINATEUR`)) ENGINE = InnoDB;
CREATE TABLE `Gestion_Park`.`ORDINATEUR_DISPO` ( `ID_ORDINATEUR_DISPO` INT NOT NULL AUTO_INCREMENT , `ID_ORDINATEUR` INT NOT NULL , PRIMARY KEY (`ID_ORDINATEUR_DISPO`)) ENGINE = InnoDB;
CREATE TABLE `Gestion_Park`.`ORDINATEUR_UTILISE` ( `ID_ORDINATEUR_UTILISE` INT NOT NULL AUTO_INCREMENT , `ID_ORDINATEUR` INT NOT NULL , `MATRICULE` VARCHAR(255) NOT NULL , PRIMARY KEY (`ID_ORDINATEUR_UTILISE`)) ENGINE = InnoDB;
ALTER TABLE `ORDINATEUR_DISPO` ADD CONSTRAINT `FK_ORDINATEUR_1` FOREIGN KEY (`ID_ORDINATEUR`) REFERENCES `ORDINATEUR` (`ID_ORDINATEUR`);
ALTER TABLE `ORDINATEUR_UTILISE` ADD CONSTRAINT `FK_ORDINATEUR_2` FOREIGN KEY (`ID_ORDINATEUR`) REFERENCES `ORDINATEUR` (`ID_ORDINATEUR`);
ALTER TABLE `ORDINATEUR_UTILISE` ADD CONSTRAINT `FK_ORDINATEUR_3` FOREIGN KEY (`MATRICULE`) REFERENCES `EMPLOYE`(`MATRICULE`) ON DELETE RESTRICT ON UPDATE RESTRICT;

CREATE USER 'prince'@'localhost' IDENTIFIED BY 'prince';
GRANT ALL PRIVILEGES ON * . * TO 'prince'@'localhost';
