package workshop;

import objects.Sphera;
import objects.Object;

public class MachineSphera extends Machine {

    private double r;

    public MachineSphera() {}
    public MachineSphera(double spTez, double r) {

    }

    public double r() {
        return this.r;
    }

    public char type() {
        return 'S';
    }

    public Sphera make() {

        return new Sphera(this.spTez,this.r);
    }

}