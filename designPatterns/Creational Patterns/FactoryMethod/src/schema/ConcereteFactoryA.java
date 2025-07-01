package schema;

public class ConcereteFactoryA implements Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
