--<<<<<<< HEAD
----DROP TABLE IF EXISTS jCategories;
----DROP TABLE IF EXISTS jSections;
----DROP TABLE IF EXISTS jCollections;
----DROP TABLE IF EXISTS jProducts;
----
----CREATE TABLE jCategories (
----  CategoryID INT(11) AUTO_INCREMENT  PRIMARY KEY,
----  CategoryName VARCHAR(50) DEFAULT NOT NULL
----);
----
----INSERT INTO jCategories (CategoryName) VALUES
----('RINGS'),
----('WATCHES');
----
----CREATE TABLE jSections (
----  SectionID INT(11) AUTO_INCREMENT  PRIMARY KEY,
----  SectionName VARCHAR(50) DEFAULT NOT NULL
----);
----
----INSERT INTO jSections (SectionName) VALUES
----('KIDS'),
----('MEN'),
----('WOMEN');
----
----CREATE TABLE jCollections (
----  CollectionID INT(11) AUTO_INCREMENT  PRIMARY KEY,
----  CollectionName VARCHAR(50) DEFAULT NOT NULL
----);
----
----INSERT INTO jCollections (CollectionName) VALUES
----('DIWALI-COLLECTION'),
----('ROMANTIC-COLLECTION');
----
----CREATE TABLE jProducts (
----  ProductID INT AUTO_INCREMENT  PRIMARY KEY,
----  ProductName VARCHAR(400) DEFAULT NOT NULL,
----  CategoryID INT(11) DEFAULT NOT NULL,
----  SectionID INT(11) NOT NULL,
----  CollectionID INT(11) NOT NULL,
----  InStockQuantity INT(22) DEFAULT 0,
----  Price DECIMAL(10,2) DEFAULT 0000.00,
----  ImagePath VARCHAR(250),
----  version INT(11) DEFAULT 1,
----  FOREIGN KEY (`CategoryID`) REFERENCES `jcategories`(`CategoryID`),
----  FOREIGN KEY (`SectionID`) REFERENCES `jsections`(`SectionID`),
----  FOREIGN KEY (`CollectionID`) REFERENCES `jcollections`(`CollectionID`)
----);
----
----INSERT INTO jProducts (ProductName,CategoryID,SectionID,CollectionID,InStockQuantity,Price,ImagePath) VALUES
----('2.6 Size Three-tone Bangle in 22K Gold',1,1,1,2,234.67,'http://aws.com/s3'),
----('6.25 Size Diamond Ring 18 Karat Rose Gold',2,2,2,3,444.56,'http://aws.com/s3');
----
----DROP TABLE jCustomers IF EXISTS;
----DROP TABLE jAddresses IF EXISTS;
----DROP TABLE jOrderItems IF EXISTS;
----DROP TABLE jOrders IF EXISTS;
----
----CREATE TABLE jCustomers(
----CustomerID INT(11) AUTO_INCREMENT PRIMARY KEY,
----CustomerFirstName VARCHAR(120) NOT NULL,
----CustomerLastName VARCHAR(120) NOT NULL,
----Phone VARCHAR(20),
----EmailAddress VARCHAR NOT NULL,
----isGuest BIT DEFAULT '0',
----Version INT (11) NOT NULL DEFAULT '1',
----ObjectID BINARY(16) DEFAULT NULL);
----
----INSERT INTO jCustomers(CustomerFirstName, CustomerLastName, Phone, EmailAddress) values
----('sai','pothulapally','4444444444','sai.kkt@gmail.com');
----
----
----
----CREATE TABLE jAddresses(
----AddressID INT(11) AUTO_INCREMENT PRIMARY KEY,
----CustomerID INT (11),
----Street VARCHAR NOT NULL,
----ApartmentNumber VARCHAR DEFAULT NULL,
----City VARCHAR NOT NULL,
----State VARCHAR NOT NULL,
----Country VARCHAR NOT NULL,
----isDefaultShipping BIT(1) NOT NULL DEFAULT '0',
----isDefaultBilling BIT(1) NOT NULL DEFAULT '0',
----Version INT(11) NOT NULL DEFAULT '1',
----ObjectID BINARY(16) DEFAULT NULL,
----FOREIGN KEY (`CustomerID`) REFERENCES `jCustomers` (`CustomerID`)
----);
----
----INSERT INTO jAddresses (CustomerID, Street, City, State, Country) VALUES
----(1,'arlington avenue','pitt','pa','us');
----
----
----CREATE TABLE jOrders(
----OrderID INT(11) PRIMARY KEY AUTO_INCREMENT,
----CustomerID INT(11),
----AddressID INT(11)
----OrderDate datetime DEFAULT NULL,
----OrderStatus VARCHAR(15) DEFAULT NULL,
----CheckoutPrice DECIMAL(10,2) DEFAULT 0.0000,
----Version INT(11) NOT NULL DEFAULT '1',
----ObjectID BINARY(16) DEFAULT NULL,
----FOREIGN KEY (`CustomerID`) REFERENCES `jCustomers` (`CustomerID`),
----FOREIGN KEY (`AddressID`) REFERENCES `jAddresses` (`AddressID`)
----);
----
----INSERT INTO jOrders(CustomerID,CheckoutPrice) VALUES
----(1,2345.6734);
----
----
----
----CREATE TABLE jOrderItems(
----OrderItemID INT(11) PRIMARY KEY AUTO_INCREMENT,
----OrderID INT(11) NOT NULL,
----ProductID INT(11) NOT NULL,
----UnitPrice DECIMAL(10,2) NOT NULL DEFAULT 0.0000,
----Quantity INT(11) NOT NULL DEFAULT '1',
----Discount DECIMAL(10,2) DEFAULT 0.0000,
----TotalPrice DECIMAL(10,2) NOT NULL DEFAULT 0.0000,
----Version INT(11) NOT NULL DEFAULT '1',
----ObjectID BINARY(16) DEFAULT NULL,
----FOREIGN KEY (`OrderID`) REFERENCES `jOrders` (`OrderID`),
----FOREIGN KEY (`ProductID`) REFERENCES `jProducts` (`ProductID`)
----);
----
----INSERT INTO jOrderItems(OrderID,ProductID) values
----(1,1);
----
----
--
----Guest
----CREATE TABLE `jguest` (
----  `GuestID` int(11) NOT NULL AUTO_INCREMENT,
----  `ApartmentNumber` varchar(10) DEFAULT NULL,
----  `City` varchar(25) NOT NULL,
----  `EmailAddress` varchar(255) NOT NULL,
----  `FirstName` varchar(120) NOT NULL,
----  `lastName` varchar(120) NOT NULL,
----  `State` varchar(30) NOT NULL,
----  `StreetAddress` varchar(255) NOT NULL,
----  `ZipCode` int(10) NOT NULL,
----  PRIMARY KEY (`GuestID`)
----) ENGINE=InnoDB DEFAULT CHARSET=latin1;
--=======
--DROP TABLE IF EXISTS jCategories;
--DROP TABLE IF EXISTS jSections;
--DROP TABLE IF EXISTS jCollections;
--DROP TABLE IF EXISTS jProducts;
--
--CREATE TABLE jCategories (
--  CategoryID INT(11) AUTO_INCREMENT  PRIMARY KEY,
--  CategoryName VARCHAR(50) DEFAULT NOT NULL
--);
--
--INSERT INTO jCategories (CategoryName) VALUES
--('RINGS'),
--('WATCHES');
--
--CREATE TABLE jSections (
--  SectionID INT(11) AUTO_INCREMENT  PRIMARY KEY,
--  SectionName VARCHAR(50) DEFAULT NOT NULL
--);
--
--INSERT INTO jSections (SectionName) VALUES
--('KIDS'),
--('MEN'),
--('WOMEN');
--
--CREATE TABLE jCollections (
--  CollectionID INT(11) AUTO_INCREMENT  PRIMARY KEY,
--  CollectionName VARCHAR(50) DEFAULT NOT NULL
--);
--
--INSERT INTO jCollections (CollectionName) VALUES
--('DIWALI-COLLECTION'),
--('ROMANTIC-COLLECTION');
--
--CREATE TABLE jProducts (
--  ProductID INT AUTO_INCREMENT  PRIMARY KEY,
--  ProductName VARCHAR(400) DEFAULT NOT NULL,
--  CategoryID INT(11) DEFAULT NOT NULL,
--  SectionID INT(11) NOT NULL,
--  CollectionID INT(11) NOT NULL,
--  InStockQuantity INT(22) DEFAULT 0,
--  Price DECIMAL(10,2) DEFAULT 0000.00,
--  Discount DECIMAL(10,2) DEFAULT 0000.00,
--  CreateDate datetime DEFAULT NULL,
--  UpdateDate datetime DEFAULT NULL,
--  ImagePath VARCHAR(250),
--  version INT(11) DEFAULT 1,
--  FOREIGN KEY (`CategoryID`) REFERENCES `jcategories`(`CategoryID`),
--  FOREIGN KEY (`SectionID`) REFERENCES `jsections`(`SectionID`),
--  FOREIGN KEY (`CollectionID`) REFERENCES `jcollections`(`CollectionID`)
--);
--
--INSERT INTO jProducts (ProductName,CategoryID,SectionID,CollectionID,InStockQuantity,Price,ImagePath) VALUES
--('2.6 Size Three-tone Bangle in 22K Gold',1,1,1,2,234.67,'http://aws.com/s3'),
--('6.25 Size Diamond Ring 18 Karat Rose Gold',2,2,2,3,444.56,'http://aws.com/s3');
--
--DROP TABLE jCustomers IF EXISTS;
--DROP TABLE jAddresses IF EXISTS;
--DROP TABLE jOrderItems IF EXISTS;
--DROP TABLE jOrders IF EXISTS;
--
--CREATE TABLE jCustomers(
--CustomerID INT(11) AUTO_INCREMENT PRIMARY KEY,
--CustomerFirstName VARCHAR(120) NOT NULL,
--CustomerLastName VARCHAR(120) NOT NULL,
--Phone VARCHAR(20),
--EmailAddress VARCHAR NOT NULL,
--isGuest BIT DEFAULT '0',
--Version INT (11) NOT NULL DEFAULT '1',
--ObjectID BINARY(16) DEFAULT NULL);
--
--INSERT INTO jCustomers(CustomerFirstName, CustomerLastName, Phone, EmailAddress) values
--('sai','pothulapally','4444444444','sai.kkt@gmail.com');
--
--
--
--CREATE TABLE jAddresses(
--AddressID INT(11) AUTO_INCREMENT PRIMARY KEY,
--CustomerID INT (11),
--Street VARCHAR NOT NULL,
--ApartmentNumber VARCHAR DEFAULT NULL,
--City VARCHAR NOT NULL,
--State VARCHAR NOT NULL,
--Country VARCHAR NOT NULL,
--isDefaultShipping BIT(1) NOT NULL DEFAULT '0',
--isDefaultBilling BIT(1) NOT NULL DEFAULT '0',
--Version INT(11) NOT NULL DEFAULT '1',
--ObjectID BINARY(16) DEFAULT NULL,
--FOREIGN KEY (`CustomerID`) REFERENCES `jCustomers` (`CustomerID`)
--);
--
--INSERT INTO jAddresses (CustomerID, Street, City, State, Country) VALUES
--(1,'arlington avenue','pitt','pa','us');
--
--
--CREATE TABLE jOrders(
--OrderID INT(11) PRIMARY KEY AUTO_INCREMENT,
--CustomerID INT(11),
--OrderDate datetime DEFAULT NULL,
--OrderStatus VARCHAR(15) DEFAULT NULL,
--CheckoutPrice DECIMAL(10,2) DEFAULT 0.0000,
--Version INT(11) NOT NULL DEFAULT '1',
--ObjectID BINARY(16) DEFAULT NULL,
--FOREIGN KEY (`CustomerID`) REFERENCES `jCustomers` (`CustomerID`)
--);
--
--INSERT INTO jOrders(CustomerID,CheckoutPrice) VALUES
--(1,2345.67);
--
--
--
--CREATE TABLE jOrderItems(
--OrderItemID INT(11) PRIMARY KEY AUTO_INCREMENT,
--OrderID INT(11) NOT NULL,
--ProductID INT(11) NOT NULL,
--UnitPrice DECIMAL(10,2) NOT NULL DEFAULT 0.0000,
--Quantity INT(11) NOT NULL DEFAULT '1',
--Discount DECIMAL(10,2) DEFAULT 0.0000,
--TotalPrice DECIMAL(10,2) NOT NULL DEFAULT 0.0000,
--Version INT(11) NOT NULL DEFAULT '1',
--ObjectID BINARY(16) DEFAULT NULL,
--FOREIGN KEY (`OrderID`) REFERENCES `jOrders` (`OrderID`),
--FOREIGN KEY (`ProductID`) REFERENCES `jProducts` (`ProductID`)
--);
--
--INSERT INTO jOrderItems(OrderID,ProductID) values
--(1,1);
-->>>>>>> 29d64e98c61f7863625410dd0265f12cc7ec3f46
--
--DROP TABLE IF EXISTS jShippingDetails;
--
--CREATE TABLE jShippingDetails(
--  `ShippingID` int(11) NOT NULL AUTO_INCREMENT,
--  `OrderID` int(11) DEFAULT NULL,
--  `TrackId` varchar(40) DEFAULT NULL,
--  `ShipName` varchar(40) DEFAULT NULL,
--  `ShipAddress` varchar(60) DEFAULT NULL,
--  `ShipCity` varchar(15) DEFAULT NULL,
--  `ShipRegion` varchar(15) DEFAULT NULL,
--  `ShipPostalCode` varchar(10) DEFAULT NULL,
--  `ShipCountry` varchar(15) DEFAULT NULL,
--  `Version` int(11) NOT NULL DEFAULT '1',
--  `ObjectID` binary(16) DEFAULT NULL,
--  PRIMARY KEY (`ShippingID`),
--  FOREIGN KEY (`OrderID`) REFERENCES `jOrders` (`OrderID`)
--);
--
--INSERT INTO jShippingDetails(OrderID,ShipName) values
--(1,'USPS');
--
--DROP TABLE IF EXISTS jHomePageSlidingImages;
--
--CREATE TABLE jHomePageSlidingImages(
--  `ImageID` int(11) NOT NULL AUTO_INCREMENT,
--  `ImageUrl` varchar(200) DEFAULT NULL,
--  `ImageDescription` varchar(200) DEFAULT NULL,
--  `ImageOrientation` varchar(10) DEFAULT NULL,
--  PRIMARY KEY (`ImageID`)
--);
--
--INSERT INTO jHomePageSlidingImages(ImageUrl,ImageDescription,ImageOrientation) values
--('image1.url','Gift it to your Wife','LEFT'),
--('image2.url','Gift it to your SON','RIGHT'),
--('image3.url','Gift it to your Mom','UP');