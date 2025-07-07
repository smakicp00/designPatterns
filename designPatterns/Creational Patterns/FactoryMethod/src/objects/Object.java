package objects;

public abstract class Object {

    double spTez;

    public Object() {}


    protected Object(double spTez) {}

    public abstract char vr();

    public abstract double V();

    public double Q() {
        return spTez;
    }

    public String toString() {
        return "spTez: " + spTez + " ";
    }

}