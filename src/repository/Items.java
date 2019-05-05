package repository;

import java.util.HashMap;
import java.util.Map;

import entity.ItemEntity;

/**
 * @author amitk
 * Class to store the items and item's cost  
 *
 */
public class Items {
	
	// map to store unique items
	private Map<String, ItemEntity> itemMap;
	
	public Items() {
		itemMap = new HashMap<>();
		fetchItems();
	}
	
	public void add(ItemEntity item) {
		itemMap.put(item.getName(),item);
	}
	
	// get item if match otherwise return null
	public ItemEntity getItem(String name) {
		return itemMap.get(name);
	}

	public Map<String, ItemEntity> getAllItems() {
		return itemMap;
	}
	
	// fetch items and store in memory (we can change this later to fetch from database too)
	private void fetchItems() {
		add(new ItemEntity("apple", 0.60));
		add(new ItemEntity("orange", 0.25));
	}
}
