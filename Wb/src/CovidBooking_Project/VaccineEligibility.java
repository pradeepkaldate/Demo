package CovidBooking_Project;

public class VaccineEligibility {
     private int age;
     private boolean hasHealthCondition;
	public VaccineEligibility(int age, boolean hasHealthCondition) {
		super();
		this.age = age;
		this.hasHealthCondition = hasHealthCondition;
	}
     public boolean isEligible()
     {
    	 if((age>=18 && age<60)&& hasHealthCondition)
    	 {
    		 System.out.println("You are  Eligible for Dose");
    		 return true;
    	 }
    	 return false;
     }
     
}
