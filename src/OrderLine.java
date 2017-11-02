
public class OrderLine {
private int quantity;
private double price;
private Product item;

public OrderLine( Product newProduct, int newQuantity, double newPrice) {
	item = newProduct;
	quantity = newQuantity;
	price = newPrice;
}
public Product getProduct() {
	return item;
}
public int getQuantity() {
	return quantity;
}
public double getPrice() {
	return price;
}

public void setQuantity(int num){
    quantity=num;
}

}
