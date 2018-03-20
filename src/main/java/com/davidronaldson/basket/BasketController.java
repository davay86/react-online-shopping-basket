package com.davidronaldson.basket;

import com.davidronaldson.requestBean.Item;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BasketController {

    List<Item> availableItems;
    List<Item> items;

    @RequestMapping(value="/availableItems", method = RequestMethod.GET)
    public List<Item> getAvailableItems(){
        availableItems = new ArrayList<>();
        availableItems.add(new Item("Apple",new BigDecimal(.99)));
        availableItems.add(new Item("Bread", new BigDecimal(1.49)));
        availableItems.add(new Item("Milk", new BigDecimal(0.89)));
        availableItems.add(new Item("Soup", new BigDecimal(1.25)));
        return availableItems;
    }

    @RequestMapping(value="/items", method = RequestMethod.GET)
    public List<Item> getBasketItems(){
        items = new ArrayList<>();
        return items;
    }

    @PostMapping(value="/addItems")
    public void addItem(List<Item> items){
        for (Item item : items) {
            this.items.add(item);
        }
    }

    @PostMapping(value="/removeItems")
    public void removeItem(List<Item> items){
        for (Item item : items) {
            this.items.remove(item);
        }
    }


}
