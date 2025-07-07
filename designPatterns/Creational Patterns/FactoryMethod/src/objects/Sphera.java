package objects;


public class Sphera extends Object {


    public char vr = 'S';

    private double r;

    public Sphera() {}
    public Sphera(double spTez, double r) {
        this.spTez = spTez;
        this.r = r;
    }
    @Override
    public char vr() {
        return this.vr;
    }
    @Override
    public double V() {
        return 4/3*Math.PI*r*r*r;
    }

    public String toString() {
        return this.Q()+"r: " + r + this.vr();
    }

}