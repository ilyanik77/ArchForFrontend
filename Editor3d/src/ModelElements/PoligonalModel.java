package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Poligon> poligons;
    public Texture[] textures;

    public PoligonalModel(Texture[] textures) {
        this.textures = textures;
        this.poligons = new ArrayList<Poligon>();
    }

    
}
