#**PROJECT**

#**Year of Birth**

Submitted by: Hema Sri Shalini.N

Teacher: Jakob Forsbacka

Course: Programming for Testers(TTK23G)

School: Jensen YH

**Introduction**

The Calculator program is a Java application designed to 
interactively calculate a user's birth year based on their
inputted age and name. Through a console-based interface, 
it prompts users to enter their name and age, utilizes a
method to compute the birth year, and generates personalized messages.

**Class**

The Calculator class calculates a person's year of birth based
on users input. It takes input for name and age.It validates the 
age, calculates the birth year, and provides
a greeting message displaying the name and calculated birth year.
I have used Do while because it runs the program till the user 
gives the right age.

**Methods**

**main(String[] args)**

In this method, I have created an instance "test" and
used scanner (scanner) to get the input from the user.
I have used do while control statement. 

1. Enters the loop and gets the age through the console.

2. Calls the getYearOfBirth method to calculate the BirthYear
"result = test.getYearOfBirth(name, age);"

3. Prints the result obtained from the "getYearOfBirth"
using "System.out.println(result)".


**getYearOfBirth(String name,String age)**

In this method, I have used try and catch method to
calculate the birthyear based on the age given by the user.

1.I have taken 2 parameters name and age as String.

2.I have used Calendar class to retrieve the currentYear.

3."int birthYear = currentYear - Integer.parseInt(age);"- Here I am calculating 
birthYear 

4.Again I am parsing the "age" as an Integer to Proceed with Validation.

5."if (ageCheck >= 0)". Here I have used if condition to check whether user 
has given the right input or not.

6.If the validation is satisfied then it returns "greetings method"


**greetings(String name,String age)**

This method prints a personalized greeting message based on the user's
name, calculated birthYear and age. when the age is non-negative. 
In case of a negative age it returns an "Invalid error" message.

1.I have used 3 Parameters. Name, age and BirthYear

2." if (age >= 0)"I have used if condition to check the age.If it is other than a number 


3.If the condition is true it returns the Greetings else an
"Invalid error" message.

**Test Cases**

**testgetYearOfBirth Method (Unit Test)**
The testgetYearOfBirth method is a unit test designed to validate 
the functionality of the getYearOfBirth method within the Calculator
class. It verifies various scenarios of age input and ensures that the
getYearOfBirth method correctly handles these inputs to produce the 
expected output or error messages. 

1.**Valid Age Input (Normal Case)**:Checks if the method correctly 
calculates the birth year based on a valid age input(e.g., "36") and
generates the expected greeting message.
Expected result: "Hi Hema, your year of birth is 1987."

2.**Age Input as Zero**:Verifies the behavior when the age provided 
as zero ("0"). Expected result to be "Hi Hema, your year of birth is 2023."

3.**Invalid Age Input - Non-Numeric Characters**:Tests the method's 
response when non-numeric characters are provided as the age input 
("abc").Expected result to be "Invalid age."

4.**Invalid Age Input - Negative Value**:Validates the handling of 
negative age input ("-31").Expected result to be "Invalid age."

5.**Invalid Age Input - Decimal Value**:Tests the method's response 
when a decimal value ("31.5") is provided as the age input.
Expected result to be "Invalid age."

6.**Invalid Age Input - Empty String**:Verifies the method's 
behavior when an empty string (" ") is provided as the age input.
Expected result to be "Invalid age."

**Testgreeting Message**:

1.**Valid Greeting Message**:Tests the greetings method when
provided with a valid name,calculated birth year, and age.
Expects the result to be "Hi Vidyuth, your year of birth is 2010."

2.**Invalid Age Input**:Validates the greetings method's behavior when a 
negative age is provided, which is considered an invalid scenario.
Expects the result to be "Invalid error."

**Conclusion**:
The Calculator application efficiently computes a user's birth year 
from their provided age and name. It excels in user engagement 
through seamless interactions, precise birth year calculations,
and personalized message generation. However, to bolster its 
resilience, future iterations could focus on fortifying error
handling mechanisms and expanding test scenarios. 