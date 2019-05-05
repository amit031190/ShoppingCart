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
		for(Map.Entry<String, Integer> scannedItem: cart.getScannedItems().entrySet()) {
			ItemEntity item = items.getItem(scannedItem.getKey());
			
			if(item != null) {
				OfferEntity offer = offers.getOffer(item.getName());
				if(offer != null) {
					int offerTotal =  (offer.getBuyQuantity() + offer.getFreeQuantity());
					int quot = scannedItem.getValue()/ offerTotal;
					int rem = scannedItem.getValue() % offerTotal;
					int itemsToBePriced = (quot * offer.getBuyQuantity()) + rem;
					totalCost += itemsToBePriced * item.getPrice();
				}
				else {
					totalCost += scannedItem.getValue() * item.getPrice();
				}
			}
		}
		return totalCost;
	}
}
