package shapes;

public abstract class Shape {
    protected int x;
    protected int y;
    protected String color;

    public Shape(int x, int y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public abstract Shape clone();
    public abstract void print();
    public abstract void equals(Shape shape);
}
