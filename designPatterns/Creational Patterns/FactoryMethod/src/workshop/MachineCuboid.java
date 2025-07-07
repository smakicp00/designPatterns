package workshop;

import objects.Cuboid;
import objects.Object;

/**
 * 
 */
public class MachineCuboid extends Machine {


    private double a;

    private double b;

    private double c;

    public MachineCuboid() {}

    public MachineCuboid(double spTez, double a, double b, double c) {

    }
    public double a() {
        return this.a;
    }

    public double b() {
        return this.b;
    }

    public double c() {
        return this.c;
    }

    public char type() {
        return 'C';
    }

    public Cuboid make() {
       return new Cuboid(this.spTez,this.a,this.b,this.c);
    }
}