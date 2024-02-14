package EvenPrime;

public class MultithreadedNumberPrinter {
public static void main(String[] args) {
	NumberPrinter n=new NumberPrinter();
	Thread t1=new Thread() {
		public void run()
		{
			try {
				n.printPrime();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	t1.start();
	Thread t2=new Thread() {
		public void run()
		{
			try {
				n.printEven();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};
	t2.start();
	//System.out.println("hell0");
}
}
