CREATE TABLE joueur(
	idjou SERIAL,
	pseudojou varchar(100),
nomjou  varchar(100),
prenomjou varchar(100),
mdpjou varchar(500),
emailjou varchar(100),
CONSTRAINT pk_joueur PRIMARY KEY(idjou)
);
 
CREATE TABLE race(
idrac SERIAL,
librac varchar(50) NOT NULL,
CONSTRAINT pk_rac PRIMARY KEY (idrac)
);
 
CREATE TABLE sousrace (
	idsra SERIAL,
	libsra varchar(50),
	racesra int,
	CONSTRAINT pk_sra PRIMARY KEY (idsra),
	CONSTRAINT fk_sra__rac FOREIGN KEY(racesra) REFERENCES race(idrac)
);
 
CREATE TABLE pays (
idpay SERIAL,
libpay varchar(50) NOT NULL,
CONSTRAINT pk_pay PRIMARY KEY (idpay)
);
 
CREATE TABLE province (
idpro SERIAL,
libpro varchar(50) NOT NULL,
payspro int NOT NULL,
CONSTRAINT pk_pro PRIMARY KEY (idpro),
CONSTRAINT fk_pro_pay FOREIGN KEY (payspro) REFERENCES PAYS(idpay)
);
 
 
CREATE TABLE personnage (
idper SERIAL,
    	pointviacper int NOT NULL,
    	expacper int NOT NULL,
    	nomper varchar(50) NOT NULL,
    	prenomper varchar(50) NOT NULL,
    	ageper int NOT NULL,
    	sexeper char(1) DEFAULT ‘A’,
    	poidsper int NOT NULL,
    	tailleper int NOT NULL,
    	descper varchar(500) DEFAULT NULL,
     	sraper int,
    	provinceper int,
    	CONSTRAINT pk_per PRIMARY KEY (idper),
Constraint fk_per__sra FOREIGN KEY (sraper) REFERENCES sousrace (idsra),
CONSTRAINT fk_per__pro FOREIGN KEY (provinceper) REFERENCES province (idpro)
);
 
 
CREATE TABLE campagne(
	idcam SERIAL,
	nomcam varchar(100),
	datedebutcam date,
	datefincam date,
	mjcam int,
	CONSTRAINT pk_campagne PRIMARY KEY(idcam),
	CONSTRAINT fk_cam__jou FOREIGN KEY(mjcam) REFERENCES joueur(idjou)
);
 
CREATE TABLE carriere (
    	idcar SERIAL,
    	libcar varchar(100) NOT NULL,
    	desccar varchar(500) NOT NULL,
    	CONSTRAINT pk_car PRIMARY KEY(idcar)
);
 
CREATE TABLE travailler (
    	personnage_tra int,
    	carriere_tra int,
    	dateobtentiontra date,
    	CONSTRAINT pk_tra PRIMARY KEY(personnage_tra, carriere_tra),
   	CONSTRAINT fk_car__tra FOREIGN KEY(carriere_tra) REFERENCES carriere (idcar),
	CONSTRAINT fk_per__tra FOREIGN KEY(personnage_tra) REFERENCES personnage (idper)
);
 
CREATE TABLE intervenir(
	campagne_int int,
	personnage_int int,
	CONSTRAINT pk_intervenir PRIMARY KEY(campagne_int, personnage_int),
	CONSTRAINT fk_int__cam FOREIGN KEY(campagne_int) REFERENCES campagne(idcam),
	CONSTRAINT fk_int__per FOREIGN KEY(personnage_int) REFERENCES personnage(idper)
);
