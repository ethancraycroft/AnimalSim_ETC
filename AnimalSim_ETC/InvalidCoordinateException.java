//********************************************************************
//InvalidCoordinateException.java       Java Foundations
//
/* Class that creates an exception. This exception is thrown if coordinates x or y are set as less than 0.
* @author Ethan Craycroft
* @version 1.0
* Final Exam/Programming Project - Using Inheritance, Polymorphism, Generics and Exception Handling
* CS-131-ON Fall 2021
//********************************************************************
*/
@SuppressWarnings("serial")
public class InvalidCoordinateException extends RuntimeException
{

	public InvalidCoordinateException(String message)
	{
		super(message);
	}
}
