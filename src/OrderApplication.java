
public class OrderApplication {
	public static boolean createOrder()
	{		
		Order newOrder = new Order();
		double price;
		price = newOrder.calculatePrice();		
		if(price != 0 )
		{
			System.out.print("The price of this order is: " + price + "\n");
			return true;
		}
		return false;
		
		
	}
	public static void main(String[] args) {
		if(createOrder())
		{
			System.out.print("Finish \n ");
		}
		else
		{
			System.out.print("Order read in failed \n");
		}

	}

}
