//********************************************************************
//Animal.java       Java Foundations
//
/* Class that creates an animal object. This class is abstract and can be extended by subclasses.
* @author Ethan Craycroft
* @version 1.0
* Final Exam/Programming Project - Using Inheritance, Polymorphism, Generics and Exception Handling
* CS-131-ON Fall 2021
//********************************************************************
*/

import java.util.*;

public abstract class Animal 
{

	protected int simID;
	protected Location l;
	protected boolean full;
	protected boolean rested;
	
	Random random = new Random(1);

	public Animal()
	{
		simID = 0;
		l = new Location(0, 0);
		full = false;
		rested = true;
	}//end empty-argument constructor
	
	public Animal(int simID, Location l)
	{
		setSimID(simID);
		setLocation(l);
		setFull(false);
		setRested(true);
	}//end preferred constructor
	
	public boolean eat()
	{
		double eating = random.nextDouble();
		if(eating <= 0.5)
		{
			setFull(false);
		}
		else
		{
			setFull(true);
		}
		return this.full;
	}//end eat method
	
	public boolean sleep()
	{
		double sleeping = random.nextDouble();
		if(sleeping <= 0.5)
		{
			setRested(false);
		}
		else
		{
			setRested(true);
		}
		return rested;
	}//end sleep method

	/**
	 * @return the simID
	 */
	public int getSimID() 
	{
		return simID;
	}//end getSimID

	/**
	 * @param simID the simID to set
	 */
	public void setSimID(int simID) 
	{
		try
		{
			if(simID > 0)
			{
				this.simID = simID;
			}
			else
			{
				throw new InvalidSimIDException("ERROR: Sim ID must be greater than 0");
			}
		}
		catch(InvalidSimIDException e)
		{
			System.out.println(e.getMessage());
		}
	}//end setSimID

	/**
	 * @return the location
	 */
	public Location getLocation() 
	{
		l.getCoordinates();
		return l;
	}//end getLocation

	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) 
	{
		this.l= location;
	}//end setLocation

	/**
	 * @return the full
	 */
	public boolean isFull() 
	{
		return full;
	}//end isFull

	/**
	 * @param full the full to set
	 */
	public void setFull(boolean full) 
	{
		this.full = full;
	}//end setFull

	/**
	 * @return the rested
	 */
	public boolean isRested() 
	{
		return rested;
	}//end isRested

	/**
	 * @param rested the rested to set
	 */
	public void setRested(boolean rested) 
	{
		this.rested = rested;
	}//end setRested
	
}//end class
