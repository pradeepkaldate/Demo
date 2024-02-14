package OnlineShopping_Application;

import java.util.Scanner;

public class OnlineShoppingApp {
public static void main(String[] args) throws Exception {
	 Scanner s=new Scanner(System.in);
	Product p1=new Product(1, "Mobile", "Electronics", 1000);
	Product p2=new Product(2, "TV", "Electronics", 15250);
	Product p3=new Product(3, "Fan", "Electronics", 1500);
	Product product[]= new Product[10];
	ShoppingCart s1=new ShoppingCart(product, 0);
	User u1=new User("Pradeep", s1);
	User u2=new User("Sanskar", s1);
	//int choice=0;
	
	Runnable r1= new Runnable() {
		public void run() {
			u1.addToCart(p1);
			u1.addToCart(p2);
			u1.addToCart(p3);			
			u1.viewCart();
			u1.placeOrder();
			System.out.println("----------------------");
		}
	};
	Runnable r2= new Runnable() {
		int choice;
		public void run() {
			do
			{
				System.out.println("Enter a choice");
				choice=s.nextInt();
				switch(choice)
				{
				case 1:u2.addToCart(p1);break;
				case 2:u2.addToCart(p3);break;
				case 3:u2.addToCart(p2);break;
				default:u2.addToCart(p1);
				u2.addToCart(p2);
				u2.addToCart(p3);
				}
			System.out.println("you want to add another item plz enter 1 continue 2 to exit");
			choice=s.nextInt();
			}while(choice==1);
			
			
			
			//u2.addToCart(new Product(4,"Shirt","Cloths",950));
			u2.viewCart();
			u2.placeOrder();
			
		}
	};
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	t1.start();
	t1.join();
	t2.start();
	t2.join();
	s.close();
	
	
}
}
