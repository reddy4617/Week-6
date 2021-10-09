
public class BakeOrder implements BreadState{
	
	Bread bread;
	
	public BakeOrder(Bread bread)
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
		System.out.println("Order is baking............");
		bread.setState(bread.getState());
	}
	public void readyOrder()
	{
		System.out.println("Not ready... It is baking");
	}
	public void deliverOrder()
	{
		System.out.println("cannot be delivered right now....it is baking");
	}
	
	public String toString()
	{
		return " State ==> Bake Order ";
	}

}

