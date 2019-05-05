/**
 * 
 */
package repository;

import java.util.Map;

import entity.ItemEntity;
import entity.OfferEntity;

/**
 * @author amitk
 * ChekOut class to calculate the total cost shopping cart 
 */
public class CheckOut {
	Cart cart;
	Items items;
	Offers offers;

	public CheckOut(Cart cartIn, Items itemsIn) {
		cart = cartIn;
		items = itemsIn;
		offers = new Offers();
	}
	
	
	/**
	 * calculate the cost of shopping cart
	 * @return totalCost of shoping cart
	 */
	public double getTotalCost() {
		double totalCost = 0;
		// gets and iterate over the scanned items from cart
		for(Map.Entry<String, Integer> scannedItem: cart.getScannedItems().entrySet()) {
			ItemEntity item = items.getItem(scannedItem.getKey());
			// get/check if scanned item present in store
			if(item != null) {
				
				OfferEntity offer = offers.getOffer(item.getName());
				// gets/check if scanned item has any offer 
				if(offer != null) {
					
					int offerTotal =  (offer.getBuyQuantity() + offer.getFreeQuantity());
					int quot = scannedItem.getValue()/ offerTotal; // to divide item quantity to groups of offer 
					int rem = scannedItem.getValue() % offerTotal; // get remaining quantity which cannot make group
					int itemsToBePriced = (quot * offer.getBuyQuantity()) + rem; // get count of quantity need to priced in cart
					totalCost += itemsToBePriced * item.getPrice(); // calculate the cost and add to total
				}
				else {
					// add cost as it is if no offer availble
					totalCost += scannedItem.getValue() * item.getPrice();
				}
			}
		}
		return totalCost;
	}
}
