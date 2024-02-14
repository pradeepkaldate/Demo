package EvenPrime;

public class NumberPrinter {
public synchronized void printPrime() throws InterruptedException
{
	for(int i=1;i<100;i++)
	{
		if(isPrime(i))
		{
			System.out.println("Prime:"+i);
			notify();
			wait();
		}
		
	}
}
public synchronized void printEven() throws Exception
{
	for(int i=1;i<100;i++)
	{
		if(i%2==0)
		{
			System.out.println("Even: "+i);
			notify();
			wait();
		}
		
		
	}
}
public boolean isPrime(int n)
{
	if(n==1) return false;
	for(int i=2;i*i<=n;i++)
	{
		if(n%i==0) return false;
	}
	return true;
}
}
