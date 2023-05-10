class Shop
{
	int item;
	synchronized public void produce(int x)
	{
		item=x;
		System.out.println(item +" produced by producer");

	}

	synchronized public void consume()
	{
		System.out.println(item +" consumed by consumer");
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
{Shop s;
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
	public class PC {
		public static void main(String[] args) {
			Shop so= new Shop();
			Producer pr= new Producer(so);
			Consumer cr=new Consumer(so);
			pr.start();
			cr.start();
		}
	}
