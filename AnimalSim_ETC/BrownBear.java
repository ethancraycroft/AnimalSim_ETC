//********************************************************************
//BrownBear.java       Java Foundations
//
/* Class that creates a Brown Bear object. This is an extension of the animal class.
* @author Ethan Craycroft
* @version 1.0
* Final Exam/Programming Project - Using Inheritance, Polymorphism, Generics and Exception Handling
* CS-131-ON Fall 2021
//********************************************************************
*/
public class BrownBear extends Animal implements Walkable, Swimmable
{
	private String subspecies;
	
	public BrownBear()
	{
		simID = 0;
		l = new Location(0, 0);
		full = false;
		rested = true;
		subspecies = "Alaskan";
	}//end empty-argument constructor
	
	public BrownBear(int simID, Location l, String subspecies)
	{
		setSimID(simID);
		setLocation(l);
		setSubspecies(subspecies);
		setFull(false);
		setRested(true);
	}//end preferred constructor

	/**
	 * @return the subspecies
	 */
	public String getSubspecies() 
	{
		return subspecies;
	}//end getSubspecies

	/**
	 * @param subspecies the subspecies to set
	 */
	public void setSubspecies(String subspecies) 
	{
		try
		{
			switch(subspecies)
			{	
				case "Alaskan":
					this.subspecies = subspecies;
					break;
				case "Asiatic":
					this.subspecies = subspecies;				
					break;			
				case "European":
					this.subspecies = subspecies;				
					break;			
				case "Grizzly":
					this.subspecies = subspecies;				
					break;			
				case "Kodiak":
					this.subspecies = subspecies;				
					break;			
				case "Siberian":
					this.subspecies = subspecies;				
					break;	
				default:
					throw new InvalidSubspeciesException("ERROR: Enter valid subspecies (Alaskan, Asiatic, European, Grizzly, Kodiak, Siberian)");
			}
		}
		catch(InvalidSubspeciesException e)
		{
			System.out.println(e.getMessage());
		}
	}//end setSubspecies

	@Override
	public String toString() 
	{
		return "BrownBear [subspecies=" + subspecies + ", simID=" + simID + ", location=[" + l.xCoord + "," + l.yCoord + "], full=" + full + ", rested=" + rested + "]";
	}//end toString

	@Override
	public void walk(int direction) 
	{
		if(direction == 1)
		{
			l.update((l.xCoord + 3), l.yCoord);
		}
		else if(direction == 2)
		{
			l.update(l.xCoord, (l.yCoord + 3));
		}
		else if(direction == -1)
		{
			if((l.xCoord - 3) < 0)
			{
				l.xCoord = 0;
			}
			else 
			{
				l.update((l.xCoord -3), l.yCoord);
			}
		}
		else if(direction == -2)
		{
			if((l.yCoord - 3) < 0)
			{
				l.yCoord = 0;
			}
			else 
			{
				l.update(l.xCoord, (l.yCoord - 3));
			}
		}
	}//end walk
	
	@Override
	public void swim(int direction)
	{
		if(direction == 1)
		{
			l.update((l.xCoord + 2), l.yCoord);
		}
		else if(direction == 2)
		{
			l.update(l.xCoord, (l.yCoord + 2));
		}
		else if(direction == -1)
		{
			if((l.xCoord - 2) < 0)
			{
				l.xCoord = 0;
			}
			else 
			{
				l.update((l.xCoord -2), l.yCoord);
			}
		}
		else if(direction == -2)
		{
			if((l.yCoord - 2) < 0)
			{
				l.yCoord = 0;
			}
			else 
			{
				l.update(l.xCoord, (l.yCoord - 2));
			}
		}
	}//end swim
	
}//end class