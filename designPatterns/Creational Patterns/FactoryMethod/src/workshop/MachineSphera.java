package workshop;

import objects.Sphera;
import objects.Object;

/**
 * 
 */
public class MachineSphera extends Machine {

    /**
     * Default constructor
     */
    public MachineSphera() {
    }

    /**
     * 
     */
    private double r;

    /**
     * @param spTez 
     * @param r
     */
    public MachineSphera(double spTez, double r) {
        // TODO implement here
    }

    /**
     * @return
     */
    public double r() {
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
    public Sphera make() {
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