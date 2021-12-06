//********************************************************************
//GoldFinch.java       Java Foundations
//
/* Class that creates a Gold Finch object. This is an extension of the animal class.
* @author Ethan Craycroft
* @version 1.0
* Final Exam/Programming Project - Using Inheritance, Polymorphism, Generics and Exception Handling
* CS-131-ON Fall 2021
//********************************************************************
*/
public class Goldfinch extends Animal implements Walkable, Flyable
{
	private double wingSpan;
	
	public Goldfinch()
	{
		simID = 0;
		l = new Location(0, 0);
		full = false;
		rested = true; 
		wingSpan = 9.0;
	}//end empty-argument constructor
	
	public Goldfinch(int simID, Location l, double ws)
	{
		setSimID(simID);
		setLocation(l);
		setWingSpan(ws);
		setFull(false);
		setRested(true);
	}//end preferred constructor

	/**
	 * @return the wingSpan
	 */
	public double getWingSpan() 
	{
		return wingSpan;
	}//end getWingSpan

	/**
	 * @param wingSpan the wingSpan to set
	 */
	public void setWingSpan(double wingSpan) 
	{
		try
		{
			if(wingSpan >= 5.0 && wingSpan <= 11.0)
			{
				this.wingSpan = wingSpan;
			}
			else 
			{
				throw new InvalidWingspanException("ERROR: Wingspan must be between 5.0-11.0");
			}
		}
		catch(InvalidWingspanException e)
		{
			System.out.println(e.getMessage());
		}
	}//end setWingSpan

	@Override
	public String toString() 
	{
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", location=[" + l.xCoord + "," + l.yCoord + "], full=" + full + ", rested=" + rested + "]";
	}//end toString

	@Override
	public void fly(Location location) 
	{
		l.xCoord = location.xCoord;
		l.yCoord = location.yCoord;
		l.update(location.xCoord, location.yCoord);
		// TODO Auto-generated method stub	
	}//end fly

	@Override
	public void walk(int direction) 
	{
		if(direction == 1)
		{
			l.update((l.xCoord + 1), l.yCoord);
		}
		else if(direction == 2)
		{
			l.update(l.xCoord, (l.yCoord + 1));
		}
		else if(direction == -1)
		{
			if((l.xCoord - 1) < 0)
			{
				l.xCoord = 0;
			}
			else 
			{
				l.update((l.xCoord -1), l.yCoord);
			}
		}
		else if(direction == -2)
		{
			if((l.yCoord - 1) < 0)
			{
				l.yCoord = 0;
			}
			else 
			{
				l.update(l.xCoord, (l.yCoord - 1));
			}
		}
		// TODO Auto-generated method stub
	}//end walk
	
	
}//end class