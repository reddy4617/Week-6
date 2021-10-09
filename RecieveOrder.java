
public class RecieveOrder implements BreadState{
	
	Bread bread;
	
	public RecieveOrder(Bread bread)
	{
		this.bread = bread;
	}
	
	public void receiveOrder()
	{
		System.out.println("Order is receiving .................. ");
		bread.setState(bread.getState());
		
	}
	public void confirmOrder()
	{
		System.out.println("Order is not confirmed yet");
	}
	
	public void processOrder()
	{
		System.out.println("Order is not processing because it is not confirmed yet");
	}
	public void bakeOrder()
	{
		System.out.println("Order is not processed yet");
	}
	public void readyOrder()
	{
		System.out.println("Not ready");
	}
	public void deliverOrder()
	{
		System.out.println("Not ready yet. So can't be delivered");
	}
	
	public String toString()
	{
		return " State ==> Receive Order ";
	}

}
