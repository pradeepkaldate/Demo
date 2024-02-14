package OnlineShopping_Application;

public class ShoppingCart {
private Product []cartItem;
private int itemCount;
 static final int MAX_CAPACITY=10;
public ShoppingCart(Product[] cartItem, int itemCount) {
	super();
	this.cartItem = cartItem;
	//this.itemCount = itemCount;
}
public void addItem(Product product)
{
	int cap=itemCount;
	if(cap<MAX_CAPACITY)
	{
		cartItem[itemCount]=product;
		    itemCount++;
	}
	else
	{
		System.out.println(" Not Sufficient sapce or Cart is Full");
	}
	
}
public void displayCartItems()
{
	
  for(int i=0;i<itemCount;i++)
  {
	System.out.println(cartItem[i].getId()+"  "+cartItem[i].getName()+" Price "+cartItem[i].getPrice());
  }
}
public void clearCart()
{
	
	itemCount=0;
}
public void display()
{
	double price=0;
	for(int i=0;i<itemCount;i++)
	{		
	  price+=cartItem[i].getPrice();	
	}
	System.out.println("Order placed successfully! Total cost: "+price);
}
public int getItemCout()
{
	return itemCount;
}
}
