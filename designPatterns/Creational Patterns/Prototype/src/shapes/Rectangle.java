package shapes;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this.x, this.y, this.color, this.width, this.height);
    }
    @Override
    public void print(){
        System.out.println("X,Y: " + this.x + "," + this.y + " Color: " + this.color + " Width: " + this.width + " Height: " + this.height);
    }

    @Override
    public void equals(Shape shape){
        if(!(shape instanceof Rectangle)){
            System.out.println("Not equals");
            return;
        }
        if(this.width == ((Rectangle)shape).width &&
           this.height == ((Rectangle)shape).height &&
           this.color == ((Rectangle)shape).color &&
           this.x == ((Rectangle)shape).x &&
           this.y == ((Rectangle)shape).y){
            System.out.println("Equals");
        }
        else{
            System.out.println("The rectangles are not equal");
        }
    }

}
