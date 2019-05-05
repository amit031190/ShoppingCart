package entity;


/**
 * @author amitk
 * Entity class to with item properties Name, Price
 *
 */
public class ItemEntity {
	private String Name;
	private double Price;
	
	public ItemEntity(String name, double price) {
		Name = name.toLowerCase();
		Price = price;
	}
	public String getName() {
		return Name;
	}
	
	public double getPrice() {
		return Price;
	}	
}
