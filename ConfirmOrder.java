
public class ConfirmOrder implements BreadState{
	
	Bread bread;
	
	public ConfirmOrder(Bread bread)
	{
		this.bread = bread;
	}
	
	public void receiveOrder()
	{
		System.out.println("Order has been recieved ");
		
	}
	public void confirmOrder()
	{
		System.out.println("Order is confirming ... ");
		bread.setState(bread.getState());
	}
	
	public void processOrder()
	{
		System.out.println("Order is not processing because it is is in confirming state");
	}
	public void bakeOrder()
	{
		System.out.println("Order is not processed yet... It is in confirming state");
	}
	public void readyOrder()
	{
		System.out.println("Not ready... It is in confirming state");
	}
	public void deliverOrder()
	{
		System.out.println("Not ready yet... It is still in confirming state");
	}
	
	public String toString()
	{
		return " State ==> Confirm Order ";
	}

}
