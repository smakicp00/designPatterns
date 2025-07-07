package workshop;

public class NoMachine extends Throwable {

    public NoMachine() {}

    private String name;

    private int id;

    public NoMachine(String name, int i) {
        this.name = name;
        this.id = i;
    }

    public String name() {
        return this.name;
    }

    public int id() {
        return this.id;
    }

    public String toString() {
        if ( this.id == 1){
            return "No machine";
        } else if (this.id == 2) {
            return "Machine not available";
        }
        return "Error";
    }

}