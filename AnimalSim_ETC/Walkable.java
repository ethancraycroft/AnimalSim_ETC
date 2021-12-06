//********************************************************************
//Walkable.java       Java Foundations
//
/* Interface that creates a walkable action that can be used by some animals
* @author Ethan Craycroft
* @version 1.0
* Final Exam/Programming Project - Using Inheritance, Polymorphism, Generics and Exception Handling
* CS-131-ON Fall 2021
//********************************************************************
*/
public interface Walkable 
{
	
	public void walk(int direction);
	//for direction integer: +1 = move forward on X axis; +2 = move forward on Y axis; -1 = move backward on X axis; -2 = move backward on Y axis
	
}//end interface
