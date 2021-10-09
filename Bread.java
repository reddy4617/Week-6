
public class Bread {
	
	BreadState receive_order;
	BreadState confirm_order;
	BreadState process_order;
	BreadState bake_order;
	BreadState ready_order;
	BreadState deliver_order;
	
	BreadState state;
	
	public Bread()
	{
		receive_order = new RecieveOrder(this);
		confirm_order = new ConfirmOrder(this);
		process_order = new ProcessOrder(this);
		bake_order = new BakeOrder(this);
		ready_order = new ReadyOrder(this);
		deliver_order = new DeliverOrder(this);
		
		state = ready_order;
	}
	
	public BreadState getReceiveOrder()
	{
		return receive_order;
	}
	
	public BreadState getConfirmOrder()
	{
		return confirm_order;
	}
	
	public BreadState getProcessOrder()
	{
		return process_order;
	}
	
	public BreadState getBakeOrder()
	{
		return bake_order;
	}
	
	public BreadState getReadyOrder()
	{
		return ready_order;
	}
	
	public BreadState getDeliverOrder()
	{
		return deliver_order;
	}
	
	public void setReceiveOrder(BreadState receive_order)
	{
		this.receive_order = receive_order;
	}
	
	public void setConfirmOrder(BreadState confirm_order)
	{
		this.confirm_order = confirm_order;
	}
	
	public void setProcessOrder(BreadState process_order)
	{
		this.process_order = process_order;
	}
	
	public void setBakeOrder(BreadState bake_order)
	{
		this.bake_order = bake_order;
	}
	
	public void setReadyOrder(BreadState ready_order)
	{
		this.ready_order = ready_order;
	}
	
	public void setDeliverOrder(BreadState deliver_order)
	{
		this.deliver_order = deliver_order;
	}
	
	public BreadState getState()
	{
		return state;
	}
	public void setState(BreadState state)
	{
		this.state = state;
	}
	
	
	
	public void receiveOrder()
	{
		state.receiveOrder();
	}
	
	public void confirmOrder()
	{
		state.confirmOrder();
	}
	
	public void processOrder()
	{
		state.processOrder();
	}
	
	public void bakeOrder()
	{
		state.bakeOrder();
	}
	
	public void readyOrder()
	{
		state.readyOrder();
	}
	
	public void deliverOrder()
	{
		state.deliverOrder();
	}
	
	
	
	

}
