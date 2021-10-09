
public class ReadyOrder implements BreadState{
	
	Bread bread;
	
	public ReadyOrder(Bread bread)
	{
		this.bread = bread;
	}
	
	public void receiveOrder()
	{
		System.out.println("Order has been received already");
		
	}
	public void confirmOrder()
	{
		System.out.println("Order is confirmed");
	}
	
	public void processOrder()
	{
		System.out.println("Order has been processed");
	}
	public void bakeOrder()
	{
		System.out.println("Order has been baked");
	}
	public void readyOrder()
	{
		System.out.println("It is ready and doing packaging...............");
		bread.setState(bread.getState());
	}
	public void deliverOrder()
	{
		System.out.println("Order is not delivered yet because packaging needs to be done");
	}
	
	public String toString()
	{
		return " State ==> Ready Order ";
	}
	

}