package schema;

public class ConcreteIterator implements Iterator<String>{

    private String[] items;
    private int index = 0;

    public ConcreteIterator(String[] items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return index < items.length;
    }

    @Override
    public String next() {
        if(hasNext()){
            return items[index++];
        }
        throw new IndexOutOfBoundsException("No more items");
    }

    @Override
    public boolean isLast() {
        return index == items.length;
    }

    @Override
    public String current() {
        if (index >= 0 && index < items.length) {
            return items[index];
        }
        throw new IndexOutOfBoundsException("No current element");
    }

    @Override
    public void reset() {
        index = 0;
    }
}
