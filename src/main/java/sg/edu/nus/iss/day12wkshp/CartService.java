package sg.edu.nus.iss.day12wkshp;

import java.util.ArrayList;
import java.util.List;

public class CartService {

    public List<Item> getShoppingItems() {

        List<Item> lstItems = new ArrayList<>();

        Item itm = new Item();
        itm.setItemName("Prada Bag");
        itm.setQuantity(5);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("Chanel Wallet");
        itm.setQuantity(2);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("MacBook Pro");
        itm.setQuantity(10);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("LV Tot Bag");
        itm.setQuantity(8);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("LV Wallet");
        itm.setQuantity(8);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("LV Top");
        itm.setQuantity(8);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("LV Pants");
        itm.setQuantity(8);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("LV Shoe");
        itm.setQuantity(8);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("LV Backpack");
        itm.setQuantity(8);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("LV Luggage");
        itm.setQuantity(8);
        lstItems.add(itm);

        return lstItems;
    }
}
