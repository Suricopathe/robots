import java.awt.*;

public class Robot {

    private static int GLOBAL_ID = 0;

    int id;
    Point location;
    Item item = Item.NONE;


    public Robot(Point location) {
        this.location = location;
        this.id = GLOBAL_ID++;
    }

    public Robot(int id, Point location, Item item) {
        this.id = id;
        this.location = location;
        this.item = item;
    }

    public void move(Point p) {

    }

    public void dig(Point p) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
