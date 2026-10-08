3-Layer Architecture
        USER / CLIENT
             ↓
┌─────────────────────────┐
│  1. Presentation Layer  │
│     UI / Controller      │
└────────────┬────────────┘
             ↓
┌─────────────────────────┐
│  2. Business Layer       │
│     Service / Logic      │
└────────────┬────────────┘
             ↓
┌─────────────────────────┐
│  3. Data Access Layer    │
│     DAO                  │
└────────────┬────────────┘
             ↓
          DATABASE

1. Presentation Layer
This is the top layer.
Its job is to interact with the user and receive/send data.
Examples:
- Console application
- Java Swing
- JavaFX
- Servlet
- REST Controller
For example, if the user wants to find a customer:
User → "Give me customer with ID 10"

The Presentation Layer receives this request and sends it to the Business Layer.
It should NOT contain business logic.
2. Business Layer
This is where the actual application rules and logic are written.
For example:
CustomerService

It may perform:
- Validation
- Calculations
- Checking conditions
- Applying business rules
- Calling the DAO layer
Example:
CustomerController
        ↓
CustomerService
        ↓
CustomerDAO

Suppose a customer wants to withdraw ₹10,000.
The Business Layer can check:
Is the account active?
Does the customer have enough balance?
Is the withdrawal amount valid?

Only after these checks does it ask the Data Access Layer to update the data.
3. Data Access Layer (DAO)
This layer is responsible for communicating with the database.
Without JPA, you can use JDBC.
For example:
CustomerDAO

Its responsibilities are:
- Open database connection
- Execute SQL queries
- Insert data
- Update data
- Delete data
- Retrieve data
- Close database resources
Example:
SELECT * FROM Customer WHERE id = 10;

The DAO executes this SQL and returns the result to the Business Layer.
Complete Flow
Suppose you have a Banking Application.
User wants to check balance.
User
 ↓
Presentation Layer
(CustomerController)
 ↓
Business Layer
(CustomerService)
 ↓
Data Access Layer
(CustomerDAO)
 ↓
Database

The response travels back:
Database
 ↓
CustomerDAO
 ↓
CustomerService
 ↓
CustomerController
 ↓
User

Example Project Structure
Without JPA:
BankingApplication
│
├── model
│   └── Customer.java
│
├── controller
│   └── CustomerController.java
│
├── service
│   └── CustomerService.java
│
├── dao
│   └── CustomerDAO.java
│
├── util
│   └── DBConnection.java
│
└── Main.java

model
Contains the data representation.
Customer
 ├── id
 ├── name
 ├── balance
 └── phone

controller
Handles user requests.
CustomerController

service
Contains business logic.
CustomerService

dao
Handles database operations using JDBC.
CustomerDAO

util
Contains common utilities such as:
DBConnection

for creating JDBC connections.
Easy way to remember
Layer	Main Question	Responsibility
Presentation	What does the user want?	Input/output
Business	What should the application do?	Business logic
DAO	How do I get/save the data?	Database operations


In one line:
Controller → Service → DAO → Database
And the response comes back:
Database → DAO → Service → Controller → User
