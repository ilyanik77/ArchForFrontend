package ModelElements;

import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;


    public Scene(List<PoligonalModel> models, List<Flash> flashes) {
        this.models = models;
        this.flashes = flashes;
    }

    public <Type> Type method1(Type obj) {
        return obj;
    }

    public <Type> Type method2(Type obj1, Type obj2) {
        return obj1;
    }

}
