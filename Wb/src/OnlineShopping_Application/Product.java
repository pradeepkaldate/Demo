package OnlineShopping_Application;

public class Product {
  private int id;
  private String name;
  private String description;
  private double price;
  public static int count=0;
  public Product(int id,String name,String des,double price)
  {
	 this.id=id;
	 this.name=name;
	 this.description=des;
	 this.price=price;
	 count++;
  }
  public int getId()
  {
	  return id;
  }
  public String getName()
  {
	  return name;
  }
  public String getDescription()
  {
	  return description;
  }
  public double getPrice()
  {
	  return price;
  }
}
