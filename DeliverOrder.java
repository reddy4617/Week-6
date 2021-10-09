
public class DeliverOrder implements BreadState{
	
	Bread bread;
	
	public DeliverOrder(Bread bread)
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
		System.out.println("It is Ready to deliver");
	}
	public void deliverOrder()
	{
		System.out.println("Order is Delivered ..........");
		bread.setState(bread.getState());
	}
	
	public String toString()
	{
		return " State ==> Deliver Order ";
	}
	
	

}