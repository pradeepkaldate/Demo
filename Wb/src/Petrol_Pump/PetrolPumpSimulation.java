package Petrol_Pump;

public class PetrolPumpSimulation {

	public static void main(String[] args) {
		PetrolPump p=new PetrolPump();
		Car c=new Car("Audi", p);
		Car c1=new Car("BMW",p);
		
		Car car[]= {c,c1,new Car("Honda",p)};
		
		
//		Thread thread=new Thread(c1);
//		Thread t=new Thread(c);
//Thread tha[]= new Thread[car.length];
/*
 * for(int i=0;i<tha.length;i++)
 * {
 * 			tha[i]=new Thread(car[i]);
		tha[i].start();
 * }
 * */
		for(int i=0;i<car.length;i++)
		{

			new Thread(car[i]).start();
		}
		

	}

}
