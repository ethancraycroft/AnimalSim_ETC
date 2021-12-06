//********************************************************************
//Application.java       Java Foundations
//
/* Class that tests all methods for the Animal, Location, GoldFinch, and BrownBear classes. Tests all exceptions and interfaces used as well.
* @author Ethan Craycroft
* @version 1.0
* Final Exam/Programming Project - Using Inheritance, Polymorphism, Generics and Exception Handling
* CS-131-ON Fall 2021
//********************************************************************
 */
import java.util.*;

public class Application
{

	public static void main(String[] args)
	{
		/*********************************************************************************************
		  								Location Tests
		 *********************************************************************************************/

		System.out.println("Testing Location class below:");
		Location empty = new Location();
		System.out.print("Empty Argument: ");
		empty.getCoordinates();
		System.out.println();
		Location location = new Location(1, 0);
		location.getCoordinates();
		location.update(3, 2);
		location.getCoordinates();
		System.out.println("Testing Location EXCEPTIONS:");
		location.update(-3, 4);
		location.update(3, -4);
		System.out.println();
		System.out.println();
		System.out.println();

		
		/*********************************************************************************************
		  								Animal Tests
		 *********************************************************************************************/

		//Animal animal = new Animal(3443, new Location(0,0));
		// Cannot instantiate the type Animal because it is an abstract class

		/*********************************************************************************************
		  										GoldFinch Tests
		 *********************************************************************************************/
		
		System.out.println("Testing GoldFinch Class:");
		
		System.out.println();
		Goldfinch emptyGF = new Goldfinch();
		
		System.out.println("Empty Argument: "+ emptyGF.toString());
		
		Goldfinch gf = new Goldfinch (1234, new Location(0, 0), 7.5);
		
		System.out.println();

		System.out.print("Goldfinch location: ");
		gf.getLocation();
		gf.setLocation(new Location(5, 5));
		System.out.print("Goldfinch location: ");
		gf.getLocation();
		
		System.out.println();

		System.out.println("Goldfinch sim ID: " + gf.getSimID());
		gf.setSimID(4321);
		System.out.println("Goldfinch sim ID: " + gf.getSimID());
		
		System.out.println();

		System.out.println("Goldfinch wingspan: " + gf.getWingSpan());
		gf.setWingSpan(10.8);
		System.out.println("Goldfinch wingspan: " + gf.getWingSpan());
		
		System.out.println();
		
		System.out.println("Goldfinch rested status: " + gf.isRested());
		gf.setRested(false);
		System.out.println("Goldfinch rested status: " + gf.isRested());
		gf.sleep();
		System.out.println("Goldfinch rested status after sleeping: " + gf.isRested());
		
		System.out.println();
		
		System.out.println("Goldfinch full status: " + gf.isFull());
		gf.setFull(true);
		System.out.println("Goldfinch full status: " + gf.isFull());
		gf.eat();
		System.out.println("Goldfinch full status after eating: " + gf.isFull());

		System.out.println();
		
		System.out.println("Testing Goldfinch INTERFACES:");
		System.out.print("Initial Goldfinch location: ");
		gf.getLocation();
		gf.walk(1);
		System.out.print("Goldfinch location: ");
		gf.getLocation();
		gf.walk(2);
		System.out.print("Goldfinch location: ");
		gf.getLocation();
		gf.walk(-1);
		System.out.print("Goldfinch location: ");
		gf.getLocation();
		gf.walk(-2);
		System.out.print("Goldfinch location: ");
		gf.getLocation();
		gf.fly(new Location (25, 30));
		System.out.print("Goldfinch location: ");
		gf.getLocation();
		
		System.out.println();

		System.out.println("Testing Goldfinch EXCEPTIONS:");
		
		gf.setSimID(3349);
		gf.getLocation().update(-3, 0);
		gf.getLocation().update(0, -3);
		gf.setWingSpan(3.45);
		
		System.out.println();

		System.out.println(gf.toString());
		
		System.out.println();
		System.out.println();
		System.out.println();

		/*********************************************************************************************
		  									BrownBear Tests
		 *********************************************************************************************/
		
		System.out.println("Testing BrownBear class below:");
		
		System.out.println();
		
		BrownBear emptyBB = new BrownBear();
		System.out.println("Empty Argument: " + emptyBB.toString());
		
		BrownBear bb = new BrownBear(1234, new Location (0,0), "Alaskan");
		
		System.out.println();

		System.out.print("Brown Bear location: ");
		bb.getLocation();
		bb.setLocation(new Location(5, 5));
		System.out.print("Brown Bear location: ");
		bb.getLocation();
		
		System.out.println();

		System.out.println("Brown Bear sim ID: " + bb.getSimID());
		bb.setSimID(4321);
		System.out.println("Brown Bear sim ID: " + bb.getSimID());
		
		System.out.println();

		System.out.println("Brown Bear subspecies: " + bb.getSubspecies());
		bb.setSubspecies("Asiatic");
		System.out.println("Brown Bear subspecies: " + bb.getSubspecies());
		
		System.out.println();
		
		System.out.println("Brown Bear rested status: " + bb.isRested());
		bb.setRested(false);		
		System.out.println("Brown Bear rested status: " + bb.isRested());
		bb.sleep();
		System.out.println("Brown Bear rested status after sleeping: " + bb.isRested());
		
		System.out.println();
		
		System.out.println("Brown Bear full status: " + bb.isFull());
		bb.setFull(true);
		System.out.println("Brown Bear full status: " + bb.isFull());
		bb.eat();
		System.out.println("Brown Bear full status after eating: " + bb.isFull());

		System.out.println();
		
		System.out.println("Testing BrownBear INTERFACES:");
		System.out.print("Initial Brown Bear location: ");		
		bb.getLocation();
		bb.walk(1);
		System.out.print("Brown Bear location: ");
		bb.getLocation();
		bb.walk(2);
		System.out.print("Brown Bear location: ");
		bb.getLocation();
		bb.walk(-1);
		System.out.print("Brown Bear location: ");
		bb.getLocation();
		bb.walk(-2);
		System.out.print("Brown Bear location: ");
		bb.getLocation();
		bb.swim(1);
		System.out.print("Brown Bear location: ");
		bb.getLocation();
		bb.swim(2);
		System.out.print("Brown Bear location: ");
		bb.getLocation();
		bb.swim(-1);
		System.out.print("Brown Bear location: ");
		bb.getLocation();
		bb.swim(-2);
		System.out.print("Brown Bear location: ");
		bb.getLocation();
		
		System.out.println();

		System.out.println("Testing BrownBear EXCEPTIONS:");
		
		bb.setSimID(-3349);
		bb.getLocation().update(-2, 1);
		bb.getLocation().update(1, -2);
		bb.setSubspecies("Asian");
		
		System.out.println();

		System.out.println(bb.toString());
		
		System.out.println();
		System.out.println();
		System.out.println();

		/*********************************************************************************************
			  							Generics Tests
		 *********************************************************************************************/
		ArrayList <Animal> animalsList = new ArrayList<Animal>();
		animalsList.add(gf);
		animalsList.add(bb);
		BrownBear bb2 = new BrownBear(4138, new Location (0,0), "Kodiak");
		animalsList.add(bb2);
		Goldfinch gf2 = new Goldfinch(3249, new Location (0,0), 8.3);
		animalsList.add(gf2);
		animalsList.add(emptyGF);
		animalsList.add(emptyBB);
		StringBuilder build = new StringBuilder("Animals in the ArrayList: ");
		for(int count = 0; count < animalsList.size(); count++)
		{
			build.append(animalsList.get(count).toString() + " - - ");		
		} 
		String result = build.toString();
		System.out.println(result);
		
	}//end main
}//end class
