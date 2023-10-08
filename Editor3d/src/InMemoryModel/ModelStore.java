package InMemoryModel;

import java.util.ArrayList;
import java.util.List;
import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;
import ModelElements.Texture;

public class ModelStore implements iModelChanger {
    
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private iModelChangeObserever[] changeObserevers;

    public ModelStore(iModelChangeObserever[] changeObserevers) {
        this.changeObserevers = changeObserevers;

        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.flashes = new ArrayList<Flash>();
        this.cameras = new ArrayList<Camera>();

        // List<Texture> textures = new ArrayList<>();
        // models.add(new PoligonalModel(textures));
        // flashes.add(new Flash());
        // cameras.add(new Camera());
        // scenes.add(0, new Scene(models, flashes, cameras)); --добавлено, после просмотра второго семинара.

    }

    public Scene getScena(int id) {
        for(int i = 0; i < scenes.size(); i++) {
            if(scenes.get(i).id == id) {
                return scenes.get(id);
            }
            
        }
        return null;
    }

    @Override
    public void NotifyChange(iModelChanger sender) {
        
    }

}
