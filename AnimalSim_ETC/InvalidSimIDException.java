//********************************************************************
//InvalidSimIDException.java       Java Foundations
//
/* Class that creates an exception. This exception is thrown if the sim ID is not set as a positive integer
* @author Ethan Craycroft
* @version 1.0
* Final Exam/Programming Project - Using Inheritance, Polymorphism, Generics and Exception Handling
* CS-131-ON Fall 2021
//********************************************************************
*/
@SuppressWarnings("serial")
public class InvalidSimIDException extends RuntimeException
{
	public InvalidSimIDException(String message)
	{
		super(message);
	}
}
