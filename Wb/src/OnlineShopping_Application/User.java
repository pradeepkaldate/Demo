package OnlineShopping_Application;

public class User {
private String name;
private ShoppingCart cart;
public User(String name, ShoppingCart cart) {
	super();
	this.name = name;
	this.cart = cart;
}
public void addToCart(Product product)
{
	cart.addItem(product);
}
public void viewCart()
{
	System.out.println(name+" Shopping Cart");
	cart.displayCartItems();
}
public void placeOrder()
{
	
	cart.display();
	cart.clearCart();
}
}
