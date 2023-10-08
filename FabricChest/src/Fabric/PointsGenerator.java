package Fabric;

import Interfaces.iGameItem;
import Product.Points;

public class PointsGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Points();
    }
    
}
