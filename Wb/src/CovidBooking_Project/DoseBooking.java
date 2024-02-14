package CovidBooking_Project;

@SuppressWarnings("serial")
public class DoseBooking extends Exception{
  private boolean booked;
  public void bookDose()
  {
	  try
	  {
		  if(booked)
		  {
			throw new DoseBooking("Dose already booked.");  
		  } 
		  else
		  {
			  System.out.println("Dose Booked Succesfully");
			  booked=true;
		  }
	  }
	  catch(Exception e)
	  {
		  System.err.println(e.getMessage());
	  }
  }
  public DoseBooking(String msg)
  {
	  super(msg);
  }
  public DoseBooking(boolean booked)
  {
	  this.booked=booked;
  }
  public boolean isDoseBooked()
  {
	  return booked;
  }
  
}
