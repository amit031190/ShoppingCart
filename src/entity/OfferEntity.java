/**
 * 
 */
package entity;

/**
 * @author amitk
 *
 */
public class OfferEntity {
	private int OfferId;
	private String ItemBought;
	private int BuyQuantity;
	private int FreeQuantity;
	
	
	public OfferEntity(Integer offerId, String itemBought, Integer buyQuantity, Integer freeQuantity) {
		OfferId = offerId;
		ItemBought = itemBought;
		BuyQuantity = buyQuantity;
		FreeQuantity = freeQuantity;
	}
	
	public int getOfferId() {
		return OfferId;
	}
	public String getItemBought() {
		return ItemBought;
	}
	public int getBuyQuantity() {
		return BuyQuantity;
	}
	public int getFreeQuantity() {
		return FreeQuantity;
	}
}
