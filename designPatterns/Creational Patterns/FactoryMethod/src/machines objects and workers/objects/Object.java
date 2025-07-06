package objects;

import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Object {

    /**
     * Default constructor
     */
    public Object() {
    }

    /**
     * 
     */
    private double spTez;

    /**
     * @param spTez
     */
    protected Object(double spTez) {
        // TODO implement here
    }

    /**
     * 
     */
    protected Object() {
        // TODO implement here
    }

    /**
     * @return
     */
    public abstract char vr();

    /**
     * @return
     */
    public abstract double V();

    /**
     * @return
     */
    public double Q() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }

}