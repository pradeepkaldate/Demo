package Petrol_Pump;

public class PetrolPump {
public synchronized void refillCar(String carName)
{
	System.out.println(carName+" Started refilling...");
    try
    {
    	Thread.sleep(3000);
    }
    catch(InterruptedException e)
    {
    	System.out.println(e);
    }
    System.out.println(carName+" Completed refilling");
}

}
