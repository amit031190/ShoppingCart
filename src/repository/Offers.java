package repository;

import java.util.HashMap;
import java.util.Map;

import entity.OfferEntity;

/**
 * @author amitk
 * Offers Class to create/store the offers on items
 */
public class Offers {
	Map<String,OfferEntity> offers;
	
	public Offers() {
		offers = new HashMap<>();
		fetchOffers();
	}
	
	
	/**
	 * @param offer
	 * add offer to the memory
	 */
	public void add(OfferEntity offer) {
		offers.put(offer.getItemBought(),offer);
	}
	
	/**
	 * @param item
	 * @return offer if available otherwise null  
	 */
	public OfferEntity getOffer(String item) {
		return offers.get(item);
	}
	
	
	/**
	 * create/store offers in Memory or (we can update this fetch offers from database) 
	 */
	private void fetchOffers() {
		add(new OfferEntity(1,"apple",1,1));
		add(new OfferEntity(2,"orange",1,1));
	}
}
