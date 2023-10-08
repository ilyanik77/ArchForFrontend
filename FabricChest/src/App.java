import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Fabric.FoodGenerator;
import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;
import Fabric.LifeGenerator;
import Fabric.MoneyGenerator;
import Fabric.PointsGenerator;
import Fabric.SilverGenerator;
import Fabric.StarGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        
        List <ItemGenerator> listGenerator = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            listGenerator.add(new GoldGenerator());
        }

        for (int i = 0; i < 10; i++) {
            listGenerator.add(new SilverGenerator());
        }

        for (int i = 0; i < 3; i++) {
            listGenerator.add(new GemGenerator());
        }

        for (int i = 0; i < 23; i++) {
            listGenerator.add(new PointsGenerator());
        }

        for (int i = 0; i < 20; i++) {
            listGenerator.add(new FoodGenerator());
        }

        for (int i = 0; i < 3; i++) {
            listGenerator.add(new StarGenerator());
        }

        for (int i = 0; i < 1; i++) {
            listGenerator.add(new LifeGenerator());
        }

        for (int i = 0; i < 28; i++) {
            listGenerator.add(new MoneyGenerator());
        }
        
        
        Random ran = new Random();
        for(int i = 0; i < 10; i++) {
            int index = ran.nextInt(95);
            listGenerator.get(index).openReward();
        }

    }
}
