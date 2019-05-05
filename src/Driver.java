
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

import repository.Cart;
import repository.CheckOut;
import repository.Items;

/**
 * @author amitk
 * This is main class
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			Items items = new Items();
			scanner = new Scanner(System.in);
			
			// to read input from user iteratively
			while (true) {
				System.out.println("if you want to exit type: exit");
				System.out.println("Otherwise enter items with ',' seperated as: Apple,Apple,Orange,Apple");
				System.out.println();
				
				
				String s = scanner.nextLine().toLowerCase().trim();
				// stop reading if user type exit
				if (s.equals("exit")) {
					break;
				}
				
				String arr[] = s.split(",");
				// for every scanned list new cart is created
				Cart cart = new Cart();
				// add and store the scanned items as List
				cart.addAllitems(Arrays.asList(arr));
				
				// then checkouts the cart
				CheckOut checkOut = new CheckOut(cart, items);
				
				// get total cost from checkout and prints on console
				System.out.println("Total Cost:" + 
				new DecimalFormat("0.00").format(checkOut.getTotalCost()) + "£");
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}

	}

}
