package schema;

public class ConcretePrototype implements Prototype {
    private String state;

    public ConcretePrototype(String state) {
        this.state = state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}
