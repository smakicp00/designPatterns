import schema.ConcretePrototype;
import schema.Prototype;
import shapes.Circle;
import shapes.Rectangle;

public class MainPrototype {

    public static void testShapes() {
        Circle c1 = new Circle(10,10,"black",20);
        Rectangle r1 = new Rectangle(10,10,"black",20,20);
        Circle c2 = c1.clone();
        Rectangle r2 = r1.clone();
        c2.setRadius(10);
        c1.equals(c2);
        r1.equals(r2);
        c1.equals(r1);
    }

    public static void testSchema() throws CloneNotSupportedException {
        Prototype p1 = new ConcretePrototype("Initial state");
        Prototype clone = p1.clone();
        clone.setState("New state");
        System.out.println("Original: " + p1.getState());
        System.out.println("Clone: " + clone.getState());
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        //testSchema();
        testShapes();
    }

}
