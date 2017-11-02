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

public void delete(int index){
    line[index].setQuantity(0);
    System.out.println(line[index].getProduct().getName()+" is deleted");
}

public void changeQuantity(int index,int num){     //change the quantity for a certain orderline
	line[index].setQuantity(line[index].getQuantity()+num);     //apply the change
    if(line[index].getQuantity()<0){                  //if the quantity is less than 0, set the quantity to 0
        line[index].setQuantity(0);
    }
    System.out.println(line[index].getProduct().getName()+"'s quantity has changed with "+num);
}
}
