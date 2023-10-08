package Fabric;

import Interfaces.iGameItem;
import Product.Food;

public class FoodGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Food();
    }
    
}
