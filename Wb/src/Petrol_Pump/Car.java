package Petrol_Pump;

public class Car implements Runnable {
	private String name;
	PetrolPump petrolPump;
	public Car(String name,PetrolPump petrolPump)
	{
		this.name=name;
		this.petrolPump=petrolPump;
	}
	
public void run()
{
	petrolPump.refillCar(name);
}
}
