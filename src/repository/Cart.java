/**
 * 
 */
package repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author amitk
 * Cart class to store the Scanned items and its count in map 
 */
public class Cart {
	private Map<String,Integer> scannedItems;
	
	public Cart() {
		scannedItems = new HashMap<>();
	}
	
	/**
	 * @return scannedItems 
	 */
	public Map<String,Integer> getScannedItems() {
		return scannedItems;
	}
	
	
	/**
	 * @param item
	 * add/update the count of scanned item to cart 
	 */
	public void addItem(String item) {
		item = item.toLowerCase();
		if(!scannedItems.containsKey(item)) {
			scannedItems.put(item, 1);	
		}
		else {
			scannedItems.put(item, scannedItems.get(item) + 1);
		}
		
	}
	
	
	/**
	 * @param items
	 * add the list of items to cart
	 */
	public void addAllItems(List<String> items) {
		for(String item: items) {
			addItem(item);
		}
	}
}
