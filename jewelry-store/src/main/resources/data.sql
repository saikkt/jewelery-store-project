DROP TABLE jCustomers IF EXISTS;
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
('sai','pothulapally','4444444444','sai.kkt@gmail.com');



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
TotalPrice DECIMAL(10,4) DEFAULT 0.0000,
Version INT(11) NOT NULL DEFAULT '1',
ObjectID BINARY(16) DEFAULT NULL,
FOREIGN KEY (`CustomerID`) REFERENCES `jCustomers` (`CustomerID`)
);

INSERT INTO jOrders(CustomerID,TotalPrice) VALUES
(1,2345.6787);



CREATE TABLE jOrderItems(
OrderItemID INT(11) PRIMARY KEY AUTO_INCREMENT,
OrderID INT(11) NOT NULL,
ProductID INT(11) NOT NULL,
UnitPrice DECIMAL(10,4) DEFAULT 0.0000,
Quantity INT(11) NOT NULL DEFAULT '1',
Discount DECIMAL(10,4) DEFAULT 0.0000,
Version INT(11) NOT NULL DEFAULT '1',
ObjectID BINARY(16) DEFAULT NULL,
FOREIGN KEY (`OrderID`) REFERENCES `jOrders` (`OrderID`)
);

INSERT INTO jOrderItems(OrderID,ProductID) values
(1,1);