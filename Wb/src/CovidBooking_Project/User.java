package CovidBooking_Project;

public class User {
private String name;
private VaccineEligibility eligibility;
private DoseBooking doseBooking;
public User(String name, VaccineEligibility eligibility, DoseBooking doseBooking) {
	super();
	this.name = name;
	this.eligibility = eligibility;
	this.doseBooking = doseBooking;
}
public void isEligible()
{
	if(eligibility.isEligible())
	{
		
		bookDose();
		if(isDoseBooked())
		{
			System.out.println(name+" you have completed your dose");
		}
	}
	else
	{
		System.out.println(name+" you are not Eligible ");
		
	}
}
public void bookDose()
{
	doseBooking.bookDose();
	//System.out.println(name+" you have booked your dose");
}
public boolean isDoseBooked()
{
	if(doseBooking.isDoseBooked())
	{
		return true;
	}
	else
	{
		
		System.out.println("You are not Booked Your Dose yet");
		return false;
	}
}
}
