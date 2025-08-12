package schema;

public class ConcreteAggregate extends Aggregate<String>{

    private String[] items = {"Pavle","Smakic","ETF"};


    @Override
    public Iterator<String> createIterator() {
        return new ConcreteIterator(items);
    }
}
