
DROP TABLE IF EXISTS jCategories;
DROP TABLE IF EXISTS jSections;
DROP TABLE IF EXISTS jCollections;
DROP TABLE IF EXISTS jProducts;

CREATE TABLE jCategories (
  CategoryID INT(11) AUTO_INCREMENT  PRIMARY KEY,
  CategoryName VARCHAR(50) DEFAULT NOT NULL
);

INSERT INTO jCategories (CategoryName) VALUES
('RINGS'),
('WATCHES');

CREATE TABLE jSections (
  SectionID INT(11) AUTO_INCREMENT  PRIMARY KEY,
  SectionName VARCHAR(50) DEFAULT NOT NULL
);

INSERT INTO jSections (SectionName) VALUES
('KIDS'),
('MEN'),
('WOMEN');

CREATE TABLE jCollections (
  CollectionID INT(11) AUTO_INCREMENT  PRIMARY KEY,
  CollectionName VARCHAR(50) DEFAULT NOT NULL
);

INSERT INTO jCollections (CollectionName) VALUES
('DIWALI-COLLECTION'),
('ROMANTIC-COLLECTION');

CREATE TABLE jProducts (
  ProductID INT AUTO_INCREMENT  PRIMARY KEY,
  ProductName VARCHAR(400) DEFAULT NOT NULL,
  CategoryID INT(11) DEFAULT NOT NULL,
  SectionID INT(11) NOT NULL,
  CollectionID INT(11) NOT NULL,
  InStockQuantity INT(22) DEFAULT 0,
  Price INT(250) DEFAULT 0,
  ImagePath VARCHAR(250),
  version INT(11) DEFAULT 1,
  FOREIGN KEY (`CategoryID`) REFERENCES `jcategories`(`CategoryID`),
  FOREIGN KEY (`SectionID`) REFERENCES `jsections`(`SectionID`),
  FOREIGN KEY (`CollectionID`) REFERENCES `jcollections`(`CollectionID`)
);

INSERT INTO jProducts (ProductName,CategoryID,SectionID,CollectionID,InStockQuantity,ImagePath) VALUES
('2.6 Size Three-tone Bangle in 22K Gold',1,1,1,2,'http://aws.com/s3'),
('6.25 Size Diamond Ring 18 Karat Rose Gold',2,2,2,3,'http://aws.com/s3');