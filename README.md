# Java Library Simulator
A simple project that demonstrates OOP concepts by simulating a small library system.
The project contains two main Java files:


## 1. LibrarySimulator.java

This file contains the main menu and the overall program flow.  
It uses:
- Functions for each operation  
- A while-loop for continuous interaction  
- Options for admin and regular users  
- Exit option to end the loop safely  


## 2. Member.java

This file represents each user as an object using OOP principles such as:
- Attributes (ID, name, borrowed books count, returned books count)
- Methods for borrowing and returning books.
- Tracking each user's statistics.

Additional features:
- The admin can view total sales 0.5 SAR per borrowed book.
- The admin can also see which operation borrow/return is the most used.
- You can enter each user, perform actions, and exit back to the main menu easily.


## How to Run

1. Compile both files:
javac LibrarySimulator.java Member.java
2.Run the main file
java LibrarySimulator
