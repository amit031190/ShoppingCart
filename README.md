# Shopping Cart
Check out system for shopping cart 

Language used: Java

Code structure:
 
default package:

1. Driver.java: This is starting main class which has main method. It creates Items object and then reads the input from console for scanned  Items to put in cart (Input example: 'apple,orange,apple,apple'). For every read it creates new Cart and then checkout object to get total cost of cart to display the output formated total cost on console    
 
entity package (Hold schema):

2. ItemEntity.java: This holds the schema for Item object (like apple, orange)

3. OfferEntity.java: This hold the schema for Offer object (like buy one apple get one apple offer will have OfferId:1, ItemBought: 'apple', BuyQuantity: 1, FreeQuantity: 1).

repository package (Hold Business logic):

4. Items.java: This class fetch and stores the Items a store has in HashMap (to store unique items)

5. Offers.java: This class fetch and stores the offer on the items in HashMap (to have unique offer on item)

6. Cart.java: This class adds and stores the List of items scanned in HashMap (if same item repeated it count is increased)

7. CheckOut.java: This class takes Items and Cart in constructor and creates offer object, there is getTotalcost method which calculates the total cost of Cart with offers (if any)
