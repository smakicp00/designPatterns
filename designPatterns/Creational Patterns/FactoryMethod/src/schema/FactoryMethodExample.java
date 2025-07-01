package schema;

public class FactoryMethodExample {

    public static void main(String[] args) {
        Factory factoryA = new ConcereteFactoryA();
        Product productA = factoryA.factoryMethod();
        productA.display();

        Factory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.factoryMethod();
        productB.display();
    }

}
