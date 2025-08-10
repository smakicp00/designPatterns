import schema.Component;
import schema.Composite;
import schema.Leaf;
import shapes.Circle;
import shapes.CompoundShape;
import shapes.Dot;
import shapes.ImageEditor;
import shapes.Rectangle;

import java.awt.*;

public class MainComposite {

    public static void testSchema(){
        Composite root = new Composite(new Component[]{new Leaf(1), new Leaf(2)});
        Composite child = new Composite(new Component[]{new Leaf(3), new Leaf(4)});
        root.addComponent(child);
        root.execute();
    }

    public static void testShapes(){
        ImageEditor editor = new ImageEditor();
        editor.loadShapes(
                new Circle(10,10,Color.BLUE,10),
                new CompoundShape(
                        new Circle(110,110,Color.RED, 50),
                        new Dot(160,160,Color.RED)
                ),
                new CompoundShape(
                        new Rectangle(250,250,Color.GREEN,100,100),
                        new Dot(240,240,Color.GREEN),
                        new Dot(240,360,Color.GREEN),
                        new Dot(360,360,Color.GREEN),
                        new Dot(360,240,Color.GREEN)
                )
        );
    }

    public static void main(String[] args) {
        //testSchema();
        testShapes();
    }


}
