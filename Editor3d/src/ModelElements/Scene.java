package ModelElements;

import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras; //--добавлено, после просмотра второго семинара.

    // public Scene(List<PoligonalModel> models, List<Flash> flashes) {
    //     this.models = models;
    //     this.flashes = flashes;
    // }

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        if (models.size() > 0) {
            this.models = models;
        } else {
            throw new Exception("Должна быть одна модель");
        }       
        
        this.flashes = flashes;
        if (cameras.size() > 0) {
            this.cameras = cameras;
        } else {
            throw new Exception("Должна быть одна камера");
        }            

    } // --конструктор исправлен, после просмотра второго семинара.



    public <T> T method1(T flash) {
        return flash;
    } // --метод исправлен, после просмотра второго семинара.

    public <T, E> T method2(T model, T flash) {
        return model;
    } // --метод исправлен, после просмотра второго семинара.

}
