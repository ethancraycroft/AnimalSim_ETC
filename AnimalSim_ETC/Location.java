//********************************************************************
//Location.java       Java Foundations
//
/* Class that creates a location of 2 coordinates, x and y, that can be used by other objects to retain their location in space.
* @author Ethan Craycroft
* @version 1.0
* Final Exam/Programming Project - Using Inheritance, Polymorphism, Generics and Exception Handling
* CS-131-ON Fall 2021
//********************************************************************
*/

import java.util.*;
public class Location 
{
	public int xCoord;
	public int yCoord;
	
	public Location()
	{
		xCoord = 0;
		yCoord = 0;
	}//end empty-argument constructor
	
	public Location(int x, int y)
	{
		try
		{
			if(x < 0 || y < 0)
			{
				throw new InvalidCoordinateException("ERROR: No cooordinate can be less than 0");
			}
			else
			{
				this.xCoord = x;
				this.yCoord = y;
			}

		}
		catch(InvalidCoordinateException e)
		{
			System.out.println(e.getMessage());
		}
	}//end preferred constructor
	

	/**
	 * @param x to update 
	 * @param y to update yCoord
	 */
	public void update(int x, int y)
	{

		try
		{
			if(x < 0 || y < 0)
			{
				throw new InvalidCoordinateException("ERROR: No cooordinate can be less than 0");
			}
			else
			{
				this.xCoord = x;
				this.yCoord = y;
			}

		}
		catch(InvalidCoordinateException e)
		{
			System.out.println(e.getMessage());
		}
	}//end update
	
	/**
	 * @return int array of coordinates x and y
	 */
	public int[] getCoordinates()
	{
		int[] theseCoordinates = new int[2];
		theseCoordinates[0] = this.xCoord;
		theseCoordinates[1] = this.yCoord;
		System.out.println(Arrays.toString(theseCoordinates));
		return theseCoordinates;
	}//end getCoordinates
	
}//end class