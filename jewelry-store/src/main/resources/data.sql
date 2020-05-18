DROP TABLE IF EXISTS jCategories;
DROP TABLE IF EXISTS jSubCategories;
DROP TABLE IF EXISTS jSections;
DROP TABLE IF EXISTS jCollections;
DROP TABLE IF EXISTS jMaterials;
DROP TABLE IF EXISTS jMetalPurity;
DROP TABLE IF EXISTS jDiscount;
DROP TABLE IF EXISTS jProducts;
DROP TABLE IF EXISTS jTaxes;

CREATE TABLE `jCategories` (
  `CategoryID` int(11) NOT NULL AUTO_INCREMENT,
  `CategoryName` varchar(50) NOT NULL,
  `MEN` bit(1) default '0',
  `WOMEN` bit(1) default '0',
  `KIDS` bit(1) default '0',
  `POPULAR` bit(1) default '0',
  `ImagePath` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`CategoryID`)
);

INSERT INTO jCategories(CategoryName,MEN,WOMEN,KIDS,POPULAR,ImagePath) values
('Necklaces',1,1,1,0,''),
('Earrings',1,1,1,1,''),
('Bangles',0,1,0,1,'');


CREATE TABLE jSubCategory (
    `SubCategoryID` INT(11) AUTO_INCREMENT  PRIMARY KEY,
    `CategoryID` INT(11),
    `SubCategoryName` VARCHAR(50) NOT NULL,
   `MEN` bit(1) default '0',
    `WOMEN` bit(1) default '0',
    `KIDS` bit(1) default '0',
    `ImagePath` varchar(250) DEFAULT NULL,
    FOREIGN KEY (`CategoryID`) REFERENCES `jCategories`(`CategoryID`)
  );

INSERT INTO jSubCategory (CategoryID,SubCategoryName,MEN,WOMEN,KIDS,ImagePath) VALUES
(1,'Pendants',0,1,0,''),
(1,'Necklace Sets',0,1,0,''),
(1, 'Pattas',0,1,0,''),
(1, 'Mangalsutras',0,1,0,''),
(2,'Chandbali',0,1,0,''),
(2, 'Clipons',1,1,0,''),
(3,'Arm Braceletes',1,1,1,''),
(3, 'Braceletes',1,1,1,'');

CREATE TABLE jSections (
  `SectionID` INT(11) AUTO_INCREMENT  PRIMARY KEY,
  `SectionName` VARCHAR(50) DEFAULT NOT NULL,
  `ImagePath` varchar(250) DEFAULT NULL
);

INSERT INTO jSections (SectionName,ImagePath) VALUES
('KIDS',''),
('MEN',''),
('WOMEN','');

CREATE TABLE jCollections (
  `CollectionID` INT(11) AUTO_INCREMENT  PRIMARY KEY,
  `CollectionName` VARCHAR(50) DEFAULT NOT NULL,
  `ImagePath` varchar(250) DEFAULT NULL
);

INSERT INTO jCollections (CollectionName,ImagePath) VALUES
('DIWALI-COLLECTION',''),
('ROMANTIC-COLLECTION','');

CREATE TABLE `jMaterials` (
  `MaterialID` int(11) NOT NULL AUTO_INCREMENT,
  `MaterialType` varchar(50) NOT NULL,
  `ImagePath` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`MaterialID`)
);

INSERT INTO jMaterials(MaterialType,ImagePath) values
('GOLD',''),
('SILVER','');

CREATE TABLE `jMetalPurity` (
  `MetalPurityID` int(11) NOT NULL AUTO_INCREMENT,
  `Purity` varchar(50) NOT NULL,
  PRIMARY KEY (`MetalPurityID`)
);

INSERT INTO jMetalPurity(Purity) values
('24K'),
('18K');

CREATE TABLE `jDiscount` (
  `DiscountID` int(11) NOT NULL AUTO_INCREMENT,
  `DiscountType` varchar(50) NOT NULL,
  `Percentage` INT(11) default 0 ,
  `Worth` INT(11) default 0 ,
  PRIMARY KEY (`DiscountID`)
);

INSERT INTO jDiscount(DiscountType,Percentage,Worth) values
('DEFAULT',0.00,0),
('10%',10.00,0),
('20%',20.00,0),
('Dummy Sale',0,10);


CREATE TABLE `jProducts` (
  `ProductID` int(11) NOT NULL AUTO_INCREMENT,
  `ProductName` varchar(400) NOT NULL,
  `CategoryID` int(11) NOT NULL,
  `SectionID` int(11) NOT NULL,
  `CollectionID` int(11) NOT NULL,
  `MaterialID` int(11) NOT NULL,
  `MetalPurityID` int(11) NOT NULL,
  `DiscountID` int(11) DEFAULT 1 NOT NULL,
  `SubCategoryID` INT(11) NOT NULL,
  `InStockQuantity` int(22) DEFAULT '0',
  `BestSeller` bit(1) DEFAULT '0',
  `TopProduct` bit(1) DEFAULT '0',
  `Price` decimal(10,2) DEFAULT '0.00',
  `ImagePath` varchar(250) DEFAULT NULL,
  `version` int(11) DEFAULT '1',
  `CreateDate` datetime(6) DEFAULT NULL,
  `UpdateDate` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`ProductID`),
  FOREIGN KEY (`CategoryID`) REFERENCES `jCategories` (`CategoryID`),
  FOREIGN KEY (`SectionID`) REFERENCES `jSections` (`SectionID`),
  FOREIGN KEY (`CollectionID`) REFERENCES `jCollections` (`CollectionID`),
  FOREIGN KEY (`MaterialID`) REFERENCES `jMaterials` (`MaterialID`),
  FOREIGN KEY (`MetalPurityID`) REFERENCES `jMetalPurity` (`MetalPurityID`),
  FOREIGN KEY (`DiscountID`) REFERENCES `jDiscount` (`DiscountID`),
  FOREIGN KEY (`SubCategoryID`) REFERENCES `jSubCategory` (`SubCategoryID`)
);

INSERT INTO jProducts (ProductName,CategoryID,SectionID,CollectionID,MaterialID,MetalPurityID,DiscountID,SubCategoryID,InStockQuantity,Price,ImagePath,CreateDate,BestSeller,TopProduct) VALUES
('2.6 Size Three-tone Bangle in 22K Gold',1,3,1,1,1,2,1,12,234.67,'http://aws.com/s3','2020-04-06',0,1),
('3.25 Size Diamond Ring 18 Karat Rose Gold',1,3,2,1,2,1,1,3,333,'http://aws.com/s3','2020-05-05',1,1),
('4.25 Size Diamond Ring 18 Karat Rose Gold',1,3,2,1,1,2,1,3,444.56,'http://aws.com/s3','2020-05-04',1,0),
('5.25 Size Diamond Ring 18 Karat Rose Gold',1,3,2,1,1,1,1,3,121,'http://aws.com/s3','2020-04-20',1,1);

CREATE TABLE `jTaxes` (
  `TaxID` int(11) NOT NULL AUTO_INCREMENT,
  `TaxType` varchar(50) NOT NULL,
  `Percentage` int(11) default 0,
  `Worth` int(11) default 0,
  PRIMARY KEY (`TaxID`)
);

INSERT INTO jTaxes (TaxType,Percentage,Worth)
VALUES
('FEDERAL',18,0),
('STATE',4,0);

DROP TABLE jCustomers IF EXISTS;
DROP TABLE jWishList IF EXISTS;
DROP TABLE jAddresses IF EXISTS;
DROP TABLE jOrderItems IF EXISTS;
DROP TABLE jOrders IF EXISTS;

CREATE TABLE jCustomers(
CustomerID INT(11) AUTO_INCREMENT PRIMARY KEY,
CustomerFirstName VARCHAR(120) NOT NULL,
CustomerLastName VARCHAR(120) NOT NULL,
Phone VARCHAR(20),
EmailAddress VARCHAR NOT NULL,
isGuest BIT DEFAULT '0',
Version INT (11) NOT NULL DEFAULT '1',
ObjectID BINARY(16) DEFAULT NULL);

INSERT INTO jCustomers(CustomerFirstName, CustomerLastName, Phone, EmailAddress) values
('sarita','owner','4444444444','sarita.kkt@gmail.com'),
('sai','pothulapally','4444444444','sai.kkt@gmail.com');


CREATE TABLE jWishList(
Id INT(11) AUTO_INCREMENT PRIMARY KEY,
CustomerID INT(11),
ProductsList VARCHAR(200) NOT NULL,
Version INT (11) NOT NULL DEFAULT '1',
ObjectID BINARY(16) DEFAULT NULL,

FOREIGN KEY (`CustomerID`) REFERENCES `jCustomers` (`CustomerID`)
);

INSERT INTO jWishList(CustomerID, ProductsList) values
(1,'1~2~'),
(2,'1~');


CREATE TABLE jAddresses(
AddressID INT(11) AUTO_INCREMENT PRIMARY KEY,
CustomerID INT (11),
Street VARCHAR NOT NULL,
ApartmentNumber VARCHAR DEFAULT NULL,
City VARCHAR NOT NULL,
State VARCHAR NOT NULL,
Country VARCHAR NOT NULL,
isDefaultShipping BIT(1) NOT NULL DEFAULT '0',
isDefaultBilling BIT(1) NOT NULL DEFAULT '0',
Version INT(11) NOT NULL DEFAULT '1',
ObjectID BINARY(16) DEFAULT NULL,
FOREIGN KEY (`CustomerID`) REFERENCES `jCustomers` (`CustomerID`)
);

INSERT INTO jAddresses (CustomerID, Street, City, State, Country) VALUES
(1,'arlington avenue','pitt','pa','us');


CREATE TABLE jOrders(
OrderID INT(11) PRIMARY KEY AUTO_INCREMENT,
CustomerID INT(11),
OrderDate datetime DEFAULT NULL,
OrderStatus VARCHAR(15) DEFAULT NULL,
CheckoutPrice DECIMAL(10,2) DEFAULT 0.0000,
Version INT(11) NOT NULL DEFAULT '1',
ObjectID BINARY(16) DEFAULT NULL,
FOREIGN KEY (`CustomerID`) REFERENCES `jCustomers` (`CustomerID`)
);

INSERT INTO jOrders(CustomerID,CheckoutPrice,OrderStatus) VALUES
(1,2345.67,'PLACED'),
(2,23.67,'PLACED');



CREATE TABLE jOrderItems(
OrderItemID INT(11) PRIMARY KEY AUTO_INCREMENT,
OrderID INT(11) NOT NULL,
ProductID INT(11) NOT NULL,
UnitPrice DECIMAL(10,2) NOT NULL  DEFAULT 0.0000,
Quantity INT(11) NOT NULL DEFAULT '1',
Discount DECIMAL(10,2) DEFAULT 0.0000,
TotalPrice DECIMAL(10,2) NOT NULL DEFAULT 0.0000,
Version INT(11) NOT NULL DEFAULT '1',
ObjectID BINARY(16) DEFAULT NULL,
FOREIGN KEY (`OrderID`) REFERENCES `jOrders` (`OrderID`),
FOREIGN KEY (`ProductID`) REFERENCES `jProducts` (`ProductID`)
);

INSERT INTO jOrderItems(OrderID,ProductID) values
(1,1),
(2,2);

DROP TABLE IF EXISTS jShippingDetails;

CREATE TABLE jShippingDetails(
  `ShippingID` int(11) NOT NULL AUTO_INCREMENT,
  `OrderID` int(11) DEFAULT NOT NULL,
  `TrackId` varchar(40) DEFAULT NULL,
  `ShipName` varchar(40) DEFAULT NULL,
  `ShipAddress` varchar(60) DEFAULT NULL,
  `ShipCity` varchar(15) DEFAULT NULL,
  `ShipRegion` varchar(15) DEFAULT NULL,
  `ShipPostalCode` varchar(10) DEFAULT NULL,
  `ShipCountry` varchar(15) DEFAULT NULL,
  `isGuest` bit(1) DEFAULT '0',
  `Version` int(11) NOT NULL DEFAULT '1',
  `ObjectID` binary(16) DEFAULT NULL,
  PRIMARY KEY (`ShippingID`),
  FOREIGN KEY (`OrderID`) REFERENCES `jOrders` (`OrderID`)
);

INSERT INTO jShippingDetails(OrderID,ShipName) values
(1,'USPS');

DROP TABLE IF EXISTS jHomePageSlidingImages;

CREATE TABLE jHomePageSlidingImages(
  `ImageID` int(11) NOT NULL AUTO_INCREMENT,
  `ImageUrl` varchar(200) DEFAULT NULL,
  `ImageDescription` varchar(200) DEFAULT NULL,
  `ImageOrientation` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ImageID`)
);

INSERT INTO jHomePageSlidingImages(ImageUrl,ImageDescription,ImageOrientation) values
('image1.url','Gift it to your Wife','LEFT'),
('image2.url','Gift it to your SON','RIGHT'),
('image3.url','Gift it to your Mom','UP');

DROP TABLE IF EXISTS jUsers;

create table jUsers(
      `Id` INT(11) AUTO_INCREMENT  PRIMARY KEY,
      `UserName` varchar(50) not null,
      `Password` varchar(300) not null,
      `Active` BIT DEFAULT '1',
      `Roles` varchar(100) DEFAULT 'ROLE_USER',
      `CustomerID` INT(11),
      FOREIGN KEY (`CustomerID`) REFERENCES `jCustomers` (`CustomerID`)
      );

INSERT INTO jUsers (UserName,Password,Active,Roles,CustomerId) values
('admin','password',1,'ROLE_ADMIN',1),
('user','password',1,'ROLE_USER',2);

DROP TABLE IF EXISTS jVerificationToken;

create table jVerificationToken(
      `TokenId` INT(11) AUTO_INCREMENT  PRIMARY KEY,
      `Token` varchar(50) not null,
      `ExpiryDate` datetime DEFAULT NULL,
      `Id` INT(11) not null,
      FOREIGN KEY (`Id`) REFERENCES `jUsers` (`Id`)
      );

--Guest
DROP TABLE IF EXISTS jGuest;
DROP TABLE IF EXISTS jGuestOrders;
DROP TABLE IF EXISTS jGuestOrderItems;

CREATE TABLE `jGuest` (
  `GuestID` int(11) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(120) NOT NULL,
  `LastName` varchar(120) NOT NULL,
  `EmailAddress` varchar(255) NOT NULL,
  `StreetAddress` varchar(255) NOT NULL,
  `ApartmentNumber` varchar(10) DEFAULT NULL,
  `City` varchar(25) NOT NULL,
  `State` varchar(30) NOT NULL,
  `ZipCode` int(10) NOT NULL,
  `Country` varchar(30) NOT NULL,
  `Version` int(11) NOT NULL DEFAULT '1',
  `ObjectID` binary(16) DEFAULT NULL,
  PRIMARY KEY (`GuestID`)
);


CREATE TABLE `jGuestOrders` (
  `GuestOrderID` int(11) NOT NULL AUTO_INCREMENT,
  `GuestID` int(11) DEFAULT NULL,
  `OrderDate` datetime DEFAULT NULL,
  `OrderStatus` varchar(15) DEFAULT NULL,
  `CheckoutPrice` decimal(10,2) DEFAULT '0.00',
  `Version` int(11) NOT NULL DEFAULT '1',
  `ObjectID` binary(16) DEFAULT NULL,
  PRIMARY KEY (`GuestOrderID`),
  FOREIGN KEY (`GuestID`) REFERENCES `jGuest` (`GuestID`)
  );

CREATE TABLE `jGuestOrderItems` (
  `GuestOrderItemID` int(11) NOT NULL AUTO_INCREMENT,
  `GuestOrderID` int(11) NOT NULL,
  `ProductID` int(11) NOT NULL,
  `UnitPrice` decimal(10,2) NOT NULL DEFAULT '0.00',
  `Quantity` int(11) NOT NULL DEFAULT '1',
  `Discount` decimal(10,2) DEFAULT '0.00',
  `TotalPrice` decimal(10,2) NOT NULL DEFAULT '0.00',
  `Version` int(11) NOT NULL DEFAULT '1',
  `ObjectID` binary(16) DEFAULT NULL,
  PRIMARY KEY (`GuestOrderItemID`),
 FOREIGN KEY (`GuestOrderID`) REFERENCES `jGuestOrders` (`GuestOrderID`)
);


CREATE TABLE `jTransactions`(
`TransactionID` int(11) NOT NULL AUTO_INCREMENT,
`OrderID` int(11) DEFAULT NULL,
`GuestOrderID` int(11) DEFAULT NULL,
`ChargeID` VARCHAR (250) NOT NULL,
`ChargeAmount` DECIMAL(10,2) NOT NULL,
`Version` int(11) NOT NULL DEFAULT '1',
`ObjectID` binary(16) DEFAULT NULL,
PRIMARY KEY (`TransactionID`)
);

INSERT INTO jTransactions(OrderID,ChargeID,ChargeAmount) VALUES
(1,'abc-123',200.23);

--Write a trigger to check if either one of the column is null (OrderID or GuestOrderID)

CREATE TABLE `jCarouselImages`(
`ImageID` int(11) NOT NULL AUTO_INCREMENT,
`ImageURL` varchar(250) NOT NULL,
`ImageDescription` varchar(250) NOT NULL,
`SecondSentence` varchar(250) NOT NULL,
`ImageOrientation` varchar(20) NOT NULL,
PRIMARY KEY (`ImageID`)
);

INSERT INTO jCarouselImages(ImageURL,ImageDescription,SecondSentence,ImageOrientation) values
('/abc/def','Dummy Desc','Dummy Second Sentence','LEFT');

CREATE TABLE `jCombos`(
`ComboID` int(11) NOT NULL AUTO_INCREMENT,
`ComboImagePath` varchar(250) NOT NULL,
`ComboName` varchar(250) NOT NULL,
PRIMARY KEY (`ComboID`)
);

INSERT INTO jCombos(ComboImagePath,ComboName) values
('dummy/path/1','dummy combo 1'),
('dummy/path/2','dummy combo 2');