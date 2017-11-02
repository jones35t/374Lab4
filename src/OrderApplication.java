import java.util.*;
import java.io.*;
public class OrderApplication {
	
	 public void importCatalogue(Product[] prod)throws FileNotFoundException{
	        Scanner scanner=new Scanner(new File("Product.csv"));       //read file
	        scanner.useDelimiter(",");
	        for(int i =0;i<10;i++){
	            String newName=scanner.next();
	            int newID=scanner.nextInt();
	            Double newPrice = scanner.nextDouble();
	            prod[i]=new Product(newName,newPrice,newID);                
	            scanner.nextLine();
	        }
	    }
	
	public static boolean createOrder() throws FileNotFoundException
	{	
		OrderApplication oa= new OrderApplication();
		Product[] prod = new Product[10];
		oa.importCatalogue(prod); //Loads products from file into a catalogue
		
		Order newOrder = new Order();
		newOrder.CreateLine(prod);
		
		double price;
		price = newOrder.calculatePrice();		
		
		newOrder.changeQuantity(2,3);
		
		if(price != 0 )
		{
			System.out.print("The price of this order is: " + price + "\n");
			return true;
		}
		return false;
		
		
	}
	public static void main(String[] args) throws FileNotFoundException{
		
		if(createOrder())
		{
			System.out.print("End of Order \n ");
		}
		else
		{
			System.out.print("Order fail \n");
		}

	}

}
