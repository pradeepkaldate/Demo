package CovidBooking_Project;

public class CoronaVaccineApp {

	public static void main(String[] args) throws InterruptedException {
		DoseBooking d1=new DoseBooking(false);
		VaccineEligibility v=new VaccineEligibility(45, true);
		User user1=new User("Pradeep", v, d1);
		DoseBooking d2=new DoseBooking(false);
		User rushi=new User("Rushi", new VaccineEligibility(21,true), new DoseBooking(false));
		VaccineEligibility v1=new VaccineEligibility(15, true);
		User user2=new User("Sanskar", v1, d2);
		User uarr[]=new User[] {user1,rushi,user2};
		Thread t1=new Thread()
				{
			     public void run()
			     {
			    	for(int i=0;i<uarr.length;i++)
			    	{
			    		uarr[i].isEligible();
			    	}
			     }
				};	
			t1.start();
		
		
	}

}
