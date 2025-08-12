package schema;

public interface Iterator<T> {
    boolean hasNext();
    T next();
    boolean isLast();
    T current();
    void reset();
}
