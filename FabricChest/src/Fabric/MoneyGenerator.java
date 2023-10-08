package Fabric;

import Interfaces.iGameItem;
import Product.Money;

public class MoneyGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        
        return new Money();
    }
    
}
