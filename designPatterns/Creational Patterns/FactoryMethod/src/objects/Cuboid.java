package objects;

public class Cuboid extends Object {

    private char vr = 'C';

    private double a;

    private double b;

    private double c;

    public Cuboid() {}
    public Cuboid(double spTez, double a, double b, double c) {
        this.spTez = spTez;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double V() {
        return a*b*c;
    }
    @Override
    public char vr() {
        return this.vr;
    }

    public String toString() {
        return this.Q()+"a: " + a + " b: " + b + " c: " + c + vr();
    }


}