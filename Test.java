
public class Test {

	public static void main(String[] args) {
		
		
		BuildBread BondBread = new BreadBuilder().setCompany("Bond Bread").setMFG("10-06-2021").setEXP("10-12-2021").getBread();
		
		BuildBread BunnyBread = new BreadBuilder().setCompany("Bunny's Bread").setMFG("10-05-2021").setEXP("10-11-2021").getBread();
		
		BuildBread BoudinBread = new BreadBuilder().setCompany("Boudin Bread").setMFG("10-07-2021").setEXP("10-13-2021").getBread();
		
		System.out.println("Get Bond Bread :: "+BondBread);
		System.out.println("Get Bunny's Bread ::  "+BunnyBread);
		System.out.println("Get Boudin Bread :: "+BoudinBread);
		
		System.out.println("\n\n");
		
		Bread bread = new Bread();
	
		bread.bakeOrder();
		bread.readyOrder();
		bread.deliverOrder();
		bread.confirmOrder();
		bread.processOrder();
		bread.receiveOrder();

	}

}
