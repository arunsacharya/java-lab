/* 3. Consider a scenario in which I like to go on a business tour from Chennai to Delhi for attending some board meeting at Indore on the way. The business tour is finalized by my Secretary and put into an interface. The interface tells from where to where to go but not how to go – by plane, by bus or by train. The interface "TourPlan" is given with dates to a travel agent to book tickets. Now the travel agent writes a Java class implementing the interface and overriding all methods of interface. He knows very well, if any abstract method is not overridden, I cannot go to Delhi. It is a must to override or implement with the mode of travel. (hint: use INTERFACE)
a. Identify abstract methods in the interface.
b. Calculate the travel expenses for a trip. */

package lab_programs;

interface TourPlan
{
	public abstract void chennaiToHyd(String mode,double fare);
	public abstract void hydToIndore(String mode,double fare);
	public abstract void indoreToDelhi(String mode,double fare);
}

class TravelAgent implements TourPlan
{
	double totalFare=0;
	public void chennaiToHyd(String mode,double fare)
	{
	System.out.println("Travel Chennai to Hyderabad by "+mode+"Travel Fare is "+fare);
		totalFare+=fare;
	}
	public void hydToIndore(String mode,double fare)
	{
	System.out.println("Travel Hyderabad to Indore by "+mode+"Travel Fare is "+fare);
		totalFare+=fare;
	}
public void indoreToDelhi(String mode,double fare)
	{
System.out.println("Travel Indore to Delhi by "+mode+"Travel Fare is "+fare);
		totalFare+=fare;
	}

void totalTravelExpenditure(){
System.out.println("Total Travell Expenditure to reach from chennai to Delhi is "+totalFare);
	}
}

public class pgm3 {
	public static void main(String args[])
	{
		TravelAgent ta = new TravelAgent();
		ta.chennaiToHyd("Plane",10000);
		ta.hydToIndore("Plane",7000);
		ta.indoreToDelhi("Plane",6000);
		ta.totalTravelExpenditure();
	}
}
