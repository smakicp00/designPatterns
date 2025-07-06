package workshop;

import objects.Object;

import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Machine {

    /**
     * Default constructor
     */
    public Machine() {
    }

    /**
     * 
     */
    protected double spTez;

    /**
     * 
     */
    protected int maked;


    /**
     * @param s
     */
    protected Machine(double s) {
        // TODO implement here
    }

    /**
     * @return
     */
    public abstract char type();

    /**
     * @return
     */
    public int maked() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public double getSpTez() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param s
     */
    public void setSpTez(double s) {
        // TODO implement here
    }

    /**
     * @return
     */
    public abstract Object make();

}