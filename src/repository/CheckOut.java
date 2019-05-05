/**
 * 
 */
package repository;

import entity.ItemEntity;

/**
 * @author amitk
 * ChekOut class to calculate the total cost shopping cart 
 */
public class CheckOut {
	Cart cart;
	Items items;

	public CheckOut(Cart cartIn, Items itemsIn) {
		cart = cartIn;
		items = itemsIn;
	}
	
	
	/**
	 * calculate the cost of shopping cart
	 * @return totalCost of shoping cart
	 */
	public double getTotalCost() {
		double totalCost = 0;
		for(String itemName: cart.getScannedItems()) {
			ItemEntity item = items.getItem(itemName);
			if(item != null) {
				totalCost += item.getPrice();
			}
		}
		return totalCost;
	}
}
