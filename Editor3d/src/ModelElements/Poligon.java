package ModelElements;

import java.util.ArrayList;
import java.util.List;
import Stuff.Point3d;

public class Poligon {
    public List<Point3d> points = new ArrayList<Point3d>();

    // = new ArrayList<Point3d>(); --добавлено, после просмотра второго семинара.

    /**
    * конструктор
    *
    * @param point
    */
    public Poligon(Point3d point) {
        points.add(point);
    }
    

}
