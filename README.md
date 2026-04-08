👨‍💻 Author: Keabetswe Masole

Software used: Apache NetBeans IDE 22

--------------------------------------------------------------------------------------------------------------------

1. PROJECT STRUCTURE
--------------------
The project is contained within the 'com.mycompany.ifelse' 
package and consists of two main files:

* IfElse.java: 
  The entry point of the program. It creates an instance 
  of YearChecker and starts the application.

* YearChecker.java: 
  Contains the application logic, including user input 
  handling via the Scanner class and the conditional 
  if-else logic.

2. FEATURES
-----------
* Interactive console input.
* Mathematical calculation using the modulo (%) operator 
  to check for divisibility by 4.
* Instant feedback to the user on the year type.

3. HOW TO RUN
-------------
1. Compile the source files using a Java compiler:
   javac com/mycompany/ifelse/*.java

2. Run the main class:
   java com.mycompany.ifelse.IfElse

3. Follow the on-screen prompt to enter a year.

4. LOGIC OVERVIEW
-----------------
The program currently uses the following logic:
- If (year % 4 == 0) -> Output: "Leap Year"
- Else -> Output: "Normal Year"

Note: This version uses a simplified leap year rule. 
For full Gregorian accuracy, conditions for century 
years (divisible by 100 and 400) should be considered.
