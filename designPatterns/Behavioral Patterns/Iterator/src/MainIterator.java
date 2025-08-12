import schema.Aggregate;
import schema.ConcreteAggregate;
import schema.Iterator;

public class MainIterator {
    public static void testIterator(){
        Aggregate<String> aggregate = new ConcreteAggregate();
        Iterator<String> iterator = aggregate.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
        iterator.reset();
        while(iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
    public static void main(String[] args) {
        testIterator();
    }
}
