package workshop;

import objects.Cuboid;
import objects.Object;

/**
 * 
 */
public class MachineCuboid extends Machine {

    /**
     * Default constructor
     */
    public MachineCuboid() {
    }

    /**
     * 
     */
    private double a;

    /**
     * 
     */
    private double b;

    /**
     * 
     */
    private double c;

    /**
     * @param spTez 
     * @param a 
     * @param b 
     * @param c
     */
    public MachineCuboid(double spTez, double a, double b, double c) {
        // TODO implement here
    }

    /**
     * @return
     */
    public double a() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @return
     */
    public double b() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @return
     */
    public double c() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @return
     */
    public char type() {
        // TODO implement here
        return "0";
    }

    /**
     * @return
     */
    public Cuboid make() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public abstract char type();

    /**
     * @return
     */
    public abstract Object make();

}