-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: checkup
-- ------------------------------------------------------
-- Server version	5.6.22-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `attribute_values`
--

DROP TABLE IF EXISTS `attribute_values`;
DROP TABLE IF EXISTS `contact_details`;
DROP TABLE IF EXISTS `employee`;
DROP TABLE IF EXISTS `followup_form`;
DROP TABLE IF EXISTS `illness_attributes`;
DROP TABLE IF EXISTS `illness_record`;
DROP TABLE IF EXISTS `patient_record`;
DROP TABLE IF EXISTS `specialization`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `attribute_values` (
  `caseNum` varchar(11) NOT NULL,
  `attributeID` varchar(45) NOT NULL,
  `value` text,
  KEY `valueProperty_idx` (`attributeID`),
  KEY `valueCase` (`caseNum`),
  CONSTRAINT `attribute_values_ibfk_1` FOREIGN KEY (`caseNum`) REFERENCES `illness_record` (`caseNum`),
  CONSTRAINT `valueAttribute` FOREIGN KEY (`attributeID`) REFERENCES `illness_attributes` (`attributeID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `valueCase` FOREIGN KEY (`caseNum`) REFERENCES `illness_record` (`caseNum`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attribute_values`
--

LOCK TABLES `attribute_values` WRITE;
/*!40000 ALTER TABLE `attribute_values` DISABLE KEYS */;
INSERT INTO `attribute_values` VALUES ('1000','APA1_1','complaint here'),('1000','APA2_1','...'),('1000','APA3_1','true'),('1000','APA3_2','true'),('1000','APA3_3','false'),('1000','APA3_4','true'),('1000','APA3_5','false'),('1000','APA3_6','false'),('1000','APA3_7','false'),('1000','APA3_8','false'),('1000','APA3_9','false'),('1000','APA3_10','true'),('1000','APA3_11','true'),('1000','APA3_12','false'),('1000','APA3_13','true'),('1000','APA3_14','false'),('1000','APA3_15','false'),('1000','APA3_16','false');
/*!40000 ALTER TABLE `attribute_values` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `employeeID` varchar(11) NOT NULL,
  `password` varchar(45) NOT NULL,
  `firstName` varchar(45) NOT NULL,
  `lastName` varchar(45) NOT NULL,
  `employeeType` varchar(45) NOT NULL,
  `mobileNum` varchar(20) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  `registerDate` varchar(45) NOT NULL,
  PRIMARY KEY (`employeeID`),
  UNIQUE KEY `employeeID_UNIQUE` (`employeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES ('1000','emp1000','John','Bautista','Physician','9156782322','johnbautista@gmail.com','2010-05-05'),('1001','emp1001','Stacey','Castro','Secretary','9277649012','stacey.castro@yahoo.com','2010-06-10'),('1002','emp1002','David','Diaz','Physician','9428736291','david_diaz@gmail.com','2010-11-05'),('1003','emp1003','Anne','Cruz','Physician','9184557323','annecruz@yahoo.com','2011-01-27'),('1004','emp1004','Paul','Torres','Physician','9172389013','paul_torres@yahoo.com','2011-04-19');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `followup_form`
--


/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `followup_form` (
  `caseNum` varchar(11) NOT NULL,
  `patientID` varchar(11) NOT NULL,
  `employeeID` varchar(11) NOT NULL,
  `requestDate` varchar(45) NOT NULL,
  KEY `caseNum_idx` (`caseNum`),
  KEY `patientID_idx` (`patientID`),
  KEY `employeeID_idx` (`employeeID`),
  CONSTRAINT `followupCase` FOREIGN KEY (`caseNum`) REFERENCES `illness_record` (`caseNum`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `followupEmployee` FOREIGN KEY (`employeeID`) REFERENCES `employee` (`employeeID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `followupPatient` FOREIGN KEY (`patientID`) REFERENCES `patient_record` (`patientID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `followup_form`
--

LOCK TABLES `followup_form` WRITE;
/*!40000 ALTER TABLE `followup_form` DISABLE KEYS */;
/*!40000 ALTER TABLE `followup_form` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `illness_attributes`
--


/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `illness_attributes` (
  `attributeID` varchar(45) NOT NULL,
  `form` varchar(45) NOT NULL,
  `section` varchar(45) NOT NULL,
  `subsection` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `dataType` varchar(45) NOT NULL,
  UNIQUE KEY `attributeID_UNIQUE` (`attributeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `illness_attributes`
--

LOCK TABLES `illness_attributes` WRITE;
/*!40000 ALTER TABLE `illness_attributes` DISABLE KEYS */;
INSERT INTO `illness_attributes` VALUES ('APA10_1','APAS','Personal and Social History','Smoker','none','text'),('APA10_2','APAS','Personal and Social History','Alcoholic beverage drinker','none','boolean'),('APA10_3','APAS','Personal and Social History','Status','none','text'),('APA10_4','APAS','Personal and Social History','Educational attainment','none','text'),('APA10_5','APAS','Personal and Social History','Illicit drug use  ','none','boolean'),('APA10_6','APAS','Personal and Social History','OCP use','none','boolean'),('APA10_7','APAS','Personal and Social History','No of siblings/children','none','text'),('APA10_8','APAS','Personal and Social History','Occupation','none','text'),('APA11_1','APAS','Previous Work Up','CBC, differential count, platelet count','none','boolean'),('APA11_10','APAS','Previous Work Up','aPTT','none','boolean'),('APA11_11','APAS','Previous Work Up','KCT, DRVVT','none','boolean'),('APA11_12','APAS','Previous Work Up','ACA IgG, ACA IgM','none','boolean'),('APA11_13','APAS','Previous Work Up','Anti B2 GP1','none','boolean'),('APA11_14','APAS','Previous Work Up','Abdominal UTZ +/- doppler','none','boolean'),('APA11_15','APAS','Previous Work Up','Peripheral arterial doppler','none','boolean'),('APA11_16','APAS','Previous Work Up','Venous duplex scan ','none','boolean'),('APA11_17','APAS','Previous Work Up','ANA','none','boolean'),('APA11_18','APAS','Previous Work Up','Protein C','none','boolean'),('APA11_19','APAS','Previous Work Up','Protein S','none','boolean'),('APA11_2','APAS','Previous Work Up','BUN, crea, Na, K, AST, ALT, Alk Phos','none','boolean'),('APA11_20','APAS','Previous Work Up','Peripheral blood smear','none','boolean'),('APA11_21','APAS','Previous Work Up','Coomb’s test – direct, indirect','none','boolean'),('APA11_22','APAS','Previous Work Up','Others','none','text'),('APA11_3','APAS','Previous Work Up','ESR','none','boolean'),('APA11_4','APAS','Previous Work Up','Urinalysis','none','boolean'),('APA11_5','APAS','Previous Work Up','CXR-AP/PA','none','boolean'),('APA11_6','APAS','Previous Work Up','12-lead ECG','none','boolean'),('APA11_7','APAS','Previous Work Up','CT scan','none','boolean'),('APA11_8','APAS','Previous Work Up','2D echocardiography','none','boolean'),('APA11_9','APAS','Previous Work Up','PT','none','boolean'),('APA1_1','APAS','General','Chief Complaint','none','text'),('APA2_1','APAS','General','History of Present Illness','none','text'),('APA3_1','APAS','General','Review of Systems','Headache','boolean'),('APA3_10','APAS','General','Review of Systems','Abdominal pain','boolean'),('APA3_11','APAS','General','Review of Systems','Contractions','boolean'),('APA3_12','APAS','General','Review of Systems','Bleeding','boolean'),('APA3_13','APAS','General','Review of Systems','Joint pain / swelling','boolean'),('APA3_14','APAS','General','Review of Systems','Paresthesia','boolean'),('APA3_15','APAS','General','Review of Systems','Claudication','boolean'),('APA3_16','APAS','General','Review of Systems','Others','boolean'),('APA3_2','APAS','General','Review of Systems','Blurring of vision','boolean'),('APA3_3','APAS','General','Review of Systems','Photosentivity','boolean'),('APA3_4','APAS','General','Review of Systems','Easy bruisability','boolean'),('APA3_5','APAS','General','Review of Systems','Oral ulcers','boolean'),('APA3_6','APAS','General','Review of Systems','Malar rash','boolean'),('APA3_7','APAS','General','Review of Systems','Chest pain','boolean'),('APA3_8','APAS','General','Review of Systems','Skin mottling','boolean'),('APA3_9','APAS','General','Review of Systems','Paroxysmal dyspnea','boolean'),('APA4_10_1','APAS','Birth History','Maternal illness','Genetic','boolean'),('APA4_10_2','APAS','Birth History','Maternal illness','Infectious','boolean'),('APA4_10_3','APAS','Birth History','Maternal illness','Autoimmune','boolean'),('APA4_10_4','APAS','Birth History','Maternal illness','Clotting disorder','boolean'),('APA4_10_5','APAS','Birth History','Maternal illness','Others','text'),('APA4_1_1','APAS','Birth History','AOG','Term','boolean'),('APA4_1_2','APAS','Birth History','AOG','Preterm','boolean'),('APA4_2','APAS','Birth History','Estimated AOG','none','text'),('APA4_3_1','APAS','Birth History','Type of Delivery','NSVD','boolean'),('APA4_3_2','APAS','Birth History','Type of Delivery','Forceps','boolean'),('APA4_3_3','APAS','Birth History','Type of Delivery','CS','boolean'),('APA4_4_1','APAS','Birth History','Location','Hospital','boolean'),('APA4_4_2','APAS','Birth History','Location','Lying in','boolean'),('APA4_4_3','APAS','Birth History','Location','Home assisted by','text'),('APA4_5_1','APAS','Birth History','Complications','No','boolean'),('APA4_5_2','APAS','Birth History','Complications','Yes','text'),('APA4_6_1','APAS','Birth History','Umbilical catheterization','No','boolean'),('APA4_6_2','APAS','Birth History','Umbilical catheterization','Yes','boolean'),('APA4_7','APAS','Birth History','Maternal age','none','text'),('APA4_8','APAS','Birth History','Prenatal care','none','text'),('APA4_9_1','APAS','Birth History','Maternal use of','alcohol','boolean'),('APA4_9_2','APAS','Birth History','Maternal use of','drugs','boolean'),('APA5_1','APAS','Immunization History','BCG','none','boolean'),('APA5_10','APAS','Immunization History','Td/tetanus toxoid','none','boolean'),('APA5_11','APAS','Immunization History','Others','none','text'),('APA5_12','APAS','Immunization History','Any adverse reactions to immunization?','none','text'),('APA5_2','APAS','Immunization History','DPT','none','text'),('APA5_3','APAS','Immunization History','OPV','none','text'),('APA5_4','APAS','Immunization History','Measles','none','boolean'),('APA5_5','APAS','Immunization History','HiB','none','boolean'),('APA5_6','APAS','Immunization History','Hep B','none','text'),('APA5_7','APAS','Immunization History','Hep A','none','text'),('APA5_8','APAS','Immunization History','Varicella','none','boolean'),('APA5_9','APAS','Immunization History','Anti rabies','none','boolean'),('APA6_1','APAS','Nutritional History','Breastfeed','none','text'),('APA6_2','APAS','Nutritional History','Formula','none','text'),('APA6_3','APAS','Nutritional History','Solids','none','text'),('APA6_4','APAS','Nutritional History','Preference','none','text'),('APA7_1_1','APAS','Growth and Developmental History','Gross Motor','0-3 mos Lifts head 45o','boolean'),('APA7_1_2','APAS','Growth and Developmental History','Gross Motor','2.5-5.5 mos Rolls over','boolean'),('APA7_1_3','APAS','Growth and Developmental History','Gross Motor','5.5-7.5 mos Sits w/o support','boolean'),('APA7_1_4','APAS','Growth and Developmental History','Gross Motor','8-10 mos Pulls self to stand','boolean'),('APA7_1_5','APAS','Growth and Developmental History','Gross Motor','11-15 mos Walks well','boolean'),('APA7_1_6','APAS','Growth and Developmental History','Gross Motor','14-22 mos Walks up steps','boolean'),('APA7_2_1','APAS','Growth and Developmental History','Personal-Social','0-1 mo Regards face	','boolean'),('APA7_2_2','APAS','Growth and Developmental History','Personal-Social','1-2 mos Smiles responsively','boolean'),('APA7_2_3','APAS','Growth and Developmental History','Personal-Social','7-14 mos Waves bye-bye','boolean'),('APA7_2_4','APAS','Growth and Developmental History','Personal-Social','10-16 mos Imitates activities','boolean'),('APA7_2_5','APAS','Growth and Developmental History','Personal-Social','2.5-3.5 yrs Names friend','boolean'),('APA7_2_6','APAS','Growth and Developmental History','Personal-Social','3-4.5 yrs	Dresses w/o help','boolean'),('APA7_3_1','APAS','Growth and Developmental History','Fine Motor','1.5-3 mos Visual tracking past midline','boolean'),('APA7_3_2','APAS','Growth and Developmental History','Fine Motor','3-4 mos Grasps rattle','boolean'),('APA7_3_3','APAS','Growth and Developmental History','Fine Motor','4-6 mos Reaches for objects','boolean'),('APA7_3_4','APAS','Growth and Developmental History','Fine Motor','12-16 mos Scubbles','boolean'),('APA7_3_5','APAS','Growth and Developmental History','Fine Motor','3-4.5 yrs Draws a person w/ 3 parts','boolean'),('APA7_4_1','APAS','Growth and Developmental History','Language ','0-1 mo Responds to sound','boolean'),('APA7_4_2','APAS','Growth and Developmental History','Language ','1-3 mos Coos ','boolean'),('APA7_4_3','APAS','Growth and Developmental History','Language ','1.5-4.5 mos Squeals / laughs aloud ','boolean'),('APA7_4_4','APAS','Growth and Developmental History','Language ','6-10 mos Combines syllables / babbles ','boolean'),('APA7_4_5','APAS','Growth and Developmental History','Language ','8-14 mos Dada / mama specific ','boolean'),('APA7_4_6','APAS','Growth and Developmental History','Language ','17-25 mos Points to pictures ','boolean'),('APA7_4_7','APAS','Growth and Developmental History','Language ','2.4-4 yrs Speech all understandable','boolean'),('APA7_4_8','APAS','Growth and Developmental History','Language ','20-25 mos Points to body parts','boolean'),('APA8_1','APAS','Past Medical History','Hypertension','none','boolean'),('APA8_10','APAS','Past Medical History','Thrombocytopenia','none','boolean'),('APA8_11','APAS','Past Medical History','Chronic infections','none','boolean'),('APA8_12_1','APAS','Past Medical History','PTB treatment','Tx regimen ','text'),('APA8_12_2','APAS','Past Medical History','PTB treatment','Duration','text'),('APA8_13','APAS','Past Medical History','Heart disease','none','boolean'),('APA8_14','APAS','Past Medical History','Heart attack','none','boolean'),('APA8_15','APAS','Past Medical History','Varicose veins ','none','boolean'),('APA8_16','APAS','Past Medical History','Stroke','none','boolean'),('APA8_17','APAS','Past Medical History','Idiopathic seizure','none','boolean'),('APA8_18','APAS','Past Medical History','Chronic venous insufficiency','none','boolean'),('APA8_19','APAS','Past Medical History','Hospitalization','none','text'),('APA8_2','APAS','Past Medical History','Diabetes','none','boolean'),('APA8_3','APAS','Past Medical History','Anemia','none','boolean'),('APA8_4','APAS','Past Medical History','Clotting disorder','none','boolean'),('APA8_5','APAS','Past Medical History','PTB exposure','none','boolean'),('APA8_6','APAS','Past Medical History','Medication use','none','text'),('APA8_7','APAS','Past Medical History','Surgery','none','text'),('APA8_8','APAS','Past Medical History','SLE / CTD','none','boolean'),('APA8_9','APAS','Past Medical History','Cancer','none','boolean'),('APA9_1','APAS','Family Medical History','Hypertension','none','boolean'),('APA9_10','APAS','Family Medical History','Clotting disorder','none','boolean'),('APA9_11','APAS','Family Medical History','Kidney disease','none','boolean'),('APA9_12','APAS','Family Medical History','Thyroid disease','none','boolean'),('APA9_13','APAS','Family Medical History','Similar OB history','none','boolean'),('APA9_2','APAS','Family Medical History','Diabetes','none','boolean'),('APA9_3','APAS','Family Medical History','Heart disease','none','boolean'),('APA9_4','APAS','Family Medical History','Multiple sibling deaths','none','text'),('APA9_5','APAS','Family Medical History','SLE / CTD','none','boolean'),('APA9_6','APAS','Family Medical History','Cancer','none','boolean'),('APA9_7','APAS','Family Medical History','PTB','none','boolean'),('APA9_8','APAS','Family Medical History','Stroke','none','boolean'),('APA9_9','APAS','Family Medical History','Stroke in the young (<45yo)','none','boolean');
/*!40000 ALTER TABLE `illness_attributes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `illness_record`
--


/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `illness_record` (
  `caseNum` varchar(11) NOT NULL,
  `employeeID` varchar(11) NOT NULL,
  `patientID` varchar(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  `recordDate` varchar(45) NOT NULL,
  `modifyDate` varchar(45) NOT NULL,
  `checkupDate` varchar(45) NOT NULL,
  PRIMARY KEY (`caseNum`),
  UNIQUE KEY `caseNum_UNIQUE` (`caseNum`),
  KEY `patientID_idx` (`patientID`),
  KEY `employeeID_idx` (`employeeID`),
  CONSTRAINT `illnessEmployee` FOREIGN KEY (`employeeID`) REFERENCES `employee` (`employeeID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `illnessPatient` FOREIGN KEY (`patientID`) REFERENCES `patient_record` (`patientID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `illness_record`
--

LOCK TABLES `illness_record` WRITE;
/*!40000 ALTER TABLE `illness_record` DISABLE KEYS */;
INSERT INTO `illness_record` VALUES ('1000','1003','1000','...','APAS','January 1, 2014','2014-01-01','2014-01-01');
/*!40000 ALTER TABLE `illness_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_record`
--


/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patient_record` (
  `patientID` varchar(11) NOT NULL,
  `recordDate` varchar(45) NOT NULL,
  `modifyDate` varchar(45) NOT NULL,
  `firstName` varchar(45) NOT NULL,
  `lastName` varchar(45) NOT NULL,
  `age` int(11) NOT NULL,
  `sex` varchar(45) NOT NULL,
  `birthDate` varchar(45) NOT NULL,
  `birthPlace` varchar(45) NOT NULL,
  `civilStatus` varchar(45) NOT NULL,
  `referredBy` varchar(200) NOT NULL,
  `street` varchar(100) NOT NULL,
  `city` varchar(45) NOT NULL,
  `region` varchar(45) NOT NULL,
  `contactNum` varchar(20) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`patientID`),
  UNIQUE KEY `patientID_UNIQUE` (`patientID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_record`
--

LOCK TABLES `patient_record` WRITE;
/*!40000 ALTER TABLE `patient_record` DISABLE KEYS */;
INSERT INTO `patient_record` VALUES ('1000','2014-01-01','2014-01-01','Grace','Reyes',26,'F','1990-10-30','Pasay General Hospital','Single','Angel Pascual', 'Leveriza','Pasay','NCR','9053429812','gracereyes@gmail.com'),(1001,'2014-06-04','2014-06-04','Allan','Navarro',45,'M','1970-04-03','Manila Doctors\' Hospital ','Married','Juan Salazar','E. Jacinto','Manila','NCR','9237658841','allan_navarro@yahoo.com'),('1002','2014-09-07','2014-09-07','Christine','Ramos',18,'F','1996-12-08','Hospital of the Infant Jesus','Single','May Ramos','Laong Laan ','Manila','NCR','9159874510','christineramos@yahoo.com'),(1003,'2015-05-05','2015-05-05','Mary','Ocampo',60,'F','1955-11-26','Adventist Medical Center Manila','Married','Brian Ocampo','Libertad','Pasay','NCR','8054512','mary.ocampo@gmail.com'),('1004','2015-03-17','2015-03-17','Marvin','Garcia',13,'M','2002-03-03','Mary Johnston Hospital','Single','Hayley Mendoza','Juan Nolasco ','Manila','NCR','8752346','marvin_garcia@yahoo.com');
/*!40000 ALTER TABLE `patient_record` ENABLE KEYS */;
UNLOCK TABLES;
--
-- Table structure for table `specialization`
--


/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `specialization` (
  `employeeID` varchar(11) NOT NULL,
  `specialty` varchar(45) NOT NULL,
  
  PRIMARY KEY(`employeeID`, `specialty`), CONSTRAINT `specialtyEmployee` FOREIGN KEY (`employeeID`) REFERENCES `employee` (`employeeID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `specialization`
--

LOCK TABLES `specialization` WRITE;
/*!40000 ALTER TABLE `specialization` DISABLE KEYS */;
INSERT INTO `specialization` VALUES ('1000','APAS'),('1001','APAS'),('1002','APAS'),('1003','APAS'),('1004','APAS');
/*!40000 ALTER TABLE `specialization` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-03-15 23:12:50
