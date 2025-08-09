package schema;

public interface Prototype extends Cloneable {
    Prototype clone() throws CloneNotSupportedException;
    void setState(String state);
    String getState();
}
