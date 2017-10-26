
public class Product {
private String name;
private double price;
private int productID;

public Product(String newName, double newPrice, int newProductID){
	name = newName;
	price = newPrice;
	productID = newProductID;
	
}

public String getName() {
	return name;
}
public double getPrice() {
	return price;
}
public int productID() {
	return productID;
}

}
