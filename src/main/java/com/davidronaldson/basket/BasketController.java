package com.davidronaldson.basket;

import com.davidronaldson.requestBean.Item;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BasketController {

    List<Item> availableItems;

    @RequestMapping(value="/items", method = RequestMethod.GET)
    public List<Item> greeting(){
        availableItems = new ArrayList<>();
        availableItems.add(new Item("Apple",new BigDecimal(.99)));
        availableItems.add(new Item("Bread", new BigDecimal(1.49)));
        availableItems.add(new Item("Milk", new BigDecimal(0.89)));
        availableItems.add(new Item("Soup", new BigDecimal(1.25)));
        return availableItems;
    }
}
