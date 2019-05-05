package repository;

import java.util.HashMap;
import java.util.Map;

import entity.OfferEntity;

/**
 * @author amitk
 *
 */
public class Offers {
	Map<String,OfferEntity> offers;
	
	public Offers() {
		offers = new HashMap<>();
		fetchOffers();
	}
	
	public void add(OfferEntity offer) {
		offers.put(offer.getItemBought(),offer);
	}
	
	public OfferEntity getOffer(String item) {
		return offers.get(item);
	}
	private void fetchOffers() {
		add(new OfferEntity(1,"apple",1,1));
		add(new OfferEntity(2,"orange",1,1));
	}
}
