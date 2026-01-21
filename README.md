# Railway_Ticket_Booking_System

The Railway Ticket Booking System is a menu-driven console application developed using Core Java to simulate a simplified version of a real-world railway reservation system.
The application enables users to manage railway ticket operations such as checking seat availability, booking tickets, cancelling reservations, and viewing booked passenger details.
The system is designed with a fixed number of seats (10–20), which are stored and managed using arrays. Each seat is represented by an index in the array, making seat management efficient and easy to understand.
This project emphasizes the practical use of Object-Oriented Programming (OOP) concepts along with custom exception handling to ensure data integrity and proper validation of user actions.

The primary objective of this project is to:
--------------------------------------------
    - Understand and implement Core Java fundamentals
    - Apply OOP principles in a real-world–like application
    - Handle user input and invalid operations using custom exceptions
    - Build a structured menu-driven console application
    - Simulate real-life railway booking logic using simple data structures
    
----------------------------------------------------------------------------------
Detailed Module Explanation
----------------------------  
1️⃣ Passenger Module
---------------------
The Passenger module represents an individual ticket holder.
It stores essential passenger information and ensures proper encapsulation of data.

Responsibilities:
  Store passenger name
  Store passenger age
  Store allotted seat number
  Provide constructors and getter methods

This module demonstrates class design, object creation, and encapsulation in Java.

2️⃣ Train Module
------------------
The Train module is the core component of the system.
It maintains an array of seats, where:
Each index represents a seat number
A null value indicates an available seat
A Passenger object indicates a booked seat

Operations performed:
    Display all available seats
    Book a seat for a passenger
    Cancel an existing booking
    Display details of all booked tickets

This module handles all validations related to seat management and ensures smooth operation of the system.

3️⃣ Exception Module (Custom Exception)
----------------------------------------
To handle invalid operations gracefully, the system uses a custom exception named: SeatNotAvailableException

This exception is thrown when:
    The user enters a seat number outside the valid range
    The selected seat is already booked
    The user tries to cancel a seat that is not booked

Using a custom exception helps separate error-handling logic from business logic, improving code clarity and robustness.

4️⃣ Main (User Interface) Module
----------------------------------
The Main module acts as the controller of the application.

Responsibilities:
    Display menu options to the user
    Accept user input using Scanner
    Use switch-case to execute selected operations
    Handle exceptions using try-catch blocks
    Control application flow until the user exits

This module demonstrates control flow management, input handling, and exception handling in console-based applications.

------------------------------------------------------------------------------------------------------------------------------
🔹 Check Available Seats
-------------------------

Displays all seat numbers that are currently unbooked
Helps users decide which seat to book
Improves usability and prevents invalid booking attempts

🔹 Book Ticket
----------------
User provides passenger details:
    Name
    Age
    Seat number

System validates:
    Seat number range
    Seat availability
    If validation fails, a custom exception is thrown

On success, the passenger is assigned to the selected seat

🔹 Cancel Ticket
------------------
User enters the seat number to cancel
System checks:
    Whether the seat number is valid
    Whether the seat is currently booked
    If conditions are not met, an exception is thrown

On successful cancellation, the seat becomes available again

🔹 Display Booked Tickets
---------------------------
Displays details of all booked passengers
Shows:
    Passenger name
    Age
    Seat number

Ensures only valid bookings are displayed

Technologies & Concepts Used
------------------------------
    Programming Language: Java (Core Java)
    OOP Concepts: Classes, Objects, Encapsulation, Constructors
    Data Structures: Arrays
    Exception Handling: try-catch blocks
    Custom Exception: SeatNotAvailableException
    User Interface: Menu-driven console using switch-case

--------------------------------------------------------------------------------------------------------------------------
Outcomes:
---------
    Strong understanding of OOP principles
    Experience in array-based data management
    Ability to create and handle custom exceptions
    Knowledge of designing modular Java applications
    Confidence in building real-world console applications
