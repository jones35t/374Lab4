import java.io.FileNotFoundException;

public class Order {
private String dateReceived;
private double price;
private int orderID;
private OrderLine[] line = new OrderLine[10];

public String getDateReceived() {
	return dateReceived;
}
public void CreateLine(Product[] prods) {
	for(int i =0; i< 10;i++){
        line[i]=new OrderLine(prods[i],i,prods[i].getPrice()); //Creates an order line with 1 of every item in the file
    }
}

public double calculatePrice ()  {
	for (int i = 0; i <10; i++) {
		price+=line[i].getPrice()*line[i].getQuantity();
        System.out.println("Product: "+line[i].getProduct().getName()+" Price: "+line[i].getProduct().getPrice()+" Quantity: "+ line[i].getQuantity());
	}
	return price;
}
}
