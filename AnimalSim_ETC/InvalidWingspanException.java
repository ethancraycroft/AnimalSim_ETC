//********************************************************************
//InvalidWingspanException.java       Java Foundations
//
/* Class that creates an exception. This exception is thrown if the wingspan is not between 5.0-11.0
* @author Ethan Craycroft
* @version 1.0
* Final Exam/Programming Project - Using Inheritance, Polymorphism, Generics and Exception Handling
* CS-131-ON Fall 2021
//********************************************************************
*/
@SuppressWarnings("serial")
public class InvalidWingspanException extends RuntimeException
{
	public InvalidWingspanException(String message)
	{
		super(message);
	}
}
