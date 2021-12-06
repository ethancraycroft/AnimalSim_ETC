//********************************************************************
//InvalidSubspeciesException.java       Java Foundations
//
/* Class that creates an exception. This exception is thrown if the subspecies is not set as an acceptable type.
* @author Ethan Craycroft
* @version 1.0
* Final Exam/Programming Project - Using Inheritance, Polymorphism, Generics and Exception Handling
* CS-131-ON Fall 2021
//********************************************************************
*/
@SuppressWarnings("serial")
public class InvalidSubspeciesException extends RuntimeException
{
	public InvalidSubspeciesException(String message)
	{
		super(message);
	}
}
