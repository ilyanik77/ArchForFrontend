package ModelElements;

import java.util.ArrayList;
import java.util.List;

import Stuff.Point3d;

public class PoligonalModel {
    public List<Poligon> poligons;
    public Texture[] textures;


    public PoligonalModel(Texture[] textures) {
        this.textures = textures;
        this.poligons = new ArrayList<Poligon>();
        this.poligons.add(new Poligon(new Point3d())); //--добавлено, после просмотра второго семинара.
    }

    
    
}
