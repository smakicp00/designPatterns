package workshop;

public class Worker {

    private int lastId;

    private int id = ++lastId;

    private String name;

    public int maked;
    private Machine machine;

    public Worker() {}

    public Worker(String name) {
        this.name = name;
    }

    public int id() {
        return this.id;
    }

    public String name() {
        return this.name;
    }

    public Machine getMachine() {
        return this.machine;
    }

    public Worker distribute(Machine m) {
        this.machine = m;
        return null;
    }

    public int maked() throws NoMachine{
        return new NoMachine().id();
    }

    public Object make() throws NoMachine{
        return new NoMachine();
    }

    public String toString() {
        return "Name: " + this.name + " id: " + this.id + " maked: " + this.maked+ " machine: " + this.machine;
    }

}