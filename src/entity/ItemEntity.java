package entity;


/**
 * @author amitk
 * Item Entity class to create new item
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
