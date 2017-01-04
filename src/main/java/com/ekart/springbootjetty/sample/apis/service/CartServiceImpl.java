package com.ekart.springbootjetty.sample.apis.service;

import com.ekart.springbootjetty.sample.apis.model.Item;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by soumith.rk on 30/12/16.
 */
@Component
public class CartServiceImpl implements CartService {

    private Map<Long,Item> cartMap;

    public CartServiceImpl(){
        cartMap = new HashMap<Long,Item>();
    }

    @Override
    public Collection<Item> allItems() {
        return cartMap.values();
    }

    @Override
    public Item addItem(Item item) {
        if(cartMap.get(item.getId())!=null){
            return null;
        }
        cartMap.put(item.getId(),item);
        return cartMap.get(item.getId());
    }

    @Override
    public Item findItem(Long id) {
        if(cartMap.get(id)==null){
            return null;
        }
        return cartMap.get(id);
    }

    @Override
    public void deleteItem(Long id) {
        if(cartMap.get(id)!=null) {
            cartMap.remove(id);
        }
    }
}
