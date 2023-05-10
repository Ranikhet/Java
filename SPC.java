// solution to producer consumer problem

class Shop
{
	boolean item_present=false;
	int item;
	synchronized public void produce(int x)
	{
		if(item_present)
		{

			try {
				System.out.println("Producer will wait for the consumer to consume...");
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		item=x;
		System.out.println(item +" has been produced...");
		item_present=true;
		notify();
	}

	synchronized public void consume()
	{
		if(!item_present)
		{
			try {
				System.out.println("Consumer is waiting for the producer to produce...");
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}	
		System.out.println(item +" consumed by consumer...");
		item_present=false;
		notify();
	}
}
class Producer extends Thread
{
	Shop s;
	public void run()
	{
		for(int i=1;i<=10;i++)
			s.produce(i);
	}
	Producer(Shop s)
	{
		this.s=s;
	}
}

class Consumer extends Thread
{ 
	Shop s;
	public void run()
	{
		for(int i=1;i<=10;i++)
		s.consume();
	}
	Consumer(Shop s)
	{
		this.s=s;
	}
}
public class SPC {
	public static void main(String[] args) {
		Shop so= new Shop();
		Producer pr= new Producer(so);
		Consumer cr=new Consumer(so);
		pr.start();
		cr.start();
	}
}
