package CoppyConstructor;

public class Enclosure {
private String name;
private int size;
private Animal animal;
public Enclosure(String name,int size,Animal animal)
{
	this.name=name;
	this.size=size;
	this.animal=animal;
}
  public Enclosure(Enclosure e)
  {
	 name=e.name;
	  animal=e.animal;
	  size=e.size;
  }
  
  
  @Override
public String toString() {
	return "Enclosure [name=" + name + ", size=" + size + ", animal=" + animal + "]";
}
  
}
