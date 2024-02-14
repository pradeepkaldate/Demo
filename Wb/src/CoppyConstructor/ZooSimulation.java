package CoppyConstructor;

public class ZooSimulation {
public static void main(String[] args) {
	Animal an=new Animal("Dog","Bull Dog",5);
	Enclosure e=new Enclosure("XYZ",55,an);
	
	Enclosure e1=new Enclosure(e);
	System.out.println(an+"\n"+e+"\n"+e1);
	an.setName("Cat");
	//e.setName("Abc");
	System.out.println(an+"\n"+e+"\n"+e1);
	
}
}
