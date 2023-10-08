import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;
import Fabric.SilverGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        
        List <ItemGenerator> listGenerator = new ArrayList<>();

        listGenerator.add(new GoldGenerator());
        listGenerator.add(new GemGenerator());
        listGenerator.add(new SilverGenerator());


        Random ran = new Random();
        for(int i = 0; i < 10; i++) {
            int index = ran.nextInt(3);
            listGenerator.get(index).openReward();
        }

    }
}
