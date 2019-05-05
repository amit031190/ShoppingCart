/**
 * 
 */
package repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author amitk
 * Cart class to store the Scanned items in list
 */
public class Cart {
	private List<String> scannedItems;
	
	public Cart() {
		scannedItems = new ArrayList<>();
	}
	
	public List<String> getScannedItems() {
		return scannedItems;
	}
	
	public void addAllitems(List<String> items) {
		scannedItems.addAll(items);
	}
}
