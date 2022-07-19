package sg.edu.nus.iss.day12wkshp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = { "/cart" })
public class CartController {

    @GetMapping(produces = { "text/html" })
    public String displayCart(Model model) {
        CartService newCart = new CartService();
        List<Item> cartItems = newCart.getShoppingItems();
        model.addAttribute("cart", cartItems);

        return "cart";
    }

    @GetMapping("{itemname}")
    public String filteredCart(
            @PathVariable(name = "itemname", required = true) String itemName,
            Model model) {
        CartService newCart = new CartService();
        List<Item> cartItems = newCart.getShoppingItems();

        List<Item> filteredItems = new ArrayList<>();
        for (Item item : cartItems) {
            if (item.getItemName().contains(itemName)) {
                filteredItems.add(item);
            }
        }

        model.addAttribute("cart", filteredItems);
        return "cart";
    }
}
