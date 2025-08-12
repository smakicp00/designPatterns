package schema;

public abstract class Aggregate<T> {
    public abstract Iterator<T> createIterator();
}
