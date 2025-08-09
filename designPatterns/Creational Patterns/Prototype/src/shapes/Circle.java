package shapes;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return this.radius;
    }

    @Override
    public Circle clone() {
        return new Circle(this.x, this.y, this.color, this.radius);
    }

    @Override
    public void print() {
        System.out.println("X,Y: " + this.x + "," + this.y + " Color: " + this.color + " Radius: " + this.radius);
    }

    @Override
    public void equals(Shape shape){
        if(!(shape instanceof Circle)){
            System.out.println("Not equals");
            return;
        }
        if(this.radius == ((Circle)shape).radius &&
           this.color == ((Circle)shape).color &&
           this.x == ((Circle)shape).x &&
           this.y == ((Circle)shape).y){
            System.out.println("Equals");
        }
        else{
            System.out.println("The circles are not equal");
        }
    }

}
