package workshop;

import objects.Object;

public abstract class Machine {


    protected double spTez;

    protected int maked = 0;

    public Machine() {}

    protected Machine(double s) {
       this.spTez = s;
    }

    public abstract char type();

    public int maked() {
        this.maked++;
        return maked;
    }

    public double getSpTez() {
        return this.spTez;
    }

    public void setSpTez(double s) {
       this.spTez = s;
    }

    public abstract Object make();

}