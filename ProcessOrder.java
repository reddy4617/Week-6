
public class ProcessOrder implements BreadState{
	
	Bread bread;
	
	public ProcessOrder(Bread bread)
	{
		this.bread = bread;
	}
	
	public void receiveOrder()
	{
		System.out.println("Order has been received and moved to next next step.... ");
		
	}
	public void confirmOrder()
	{
		System.out.println("Order is confirmed and move forward");
	}
	
	public void processOrder()
	{
		System.out.println("Order is in process state...........");
		bread.setState(bread.getState());
	}
	public void bakeOrder()
	{
		System.out.println("Order is in processing state... soon it will bake");
	}
	public void readyOrder()
	{
		System.out.println("Order is Not ready because it is not baked yet ");
	}
	public void deliverOrder()
	{
		System.out.println("Cannot be delivered because it is not ready yet");
	}
	
	public String toString()
	{
		return " State ==> Process Order ";
	}

}
