import schema.Component;
import schema.Composite;
import schema.Leaf;

public class MainComposite {

    public static void testSchema(){
        Composite root = new Composite(new Component[]{new Leaf(1), new Leaf(2)});
        Composite child = new Composite(new Component[]{new Leaf(3), new Leaf(4)});
        root.addComponent(child);
        root.execute();
    }

    public static void main(String[] args) {
        testSchema();
    }
}
