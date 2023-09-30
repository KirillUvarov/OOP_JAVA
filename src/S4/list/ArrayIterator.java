package S4.list;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {

    private final E[] values;
    private int index;

    public ArrayIterator(E[] values) {
        this.index = 0;
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
//        тоже самое
//        if (index < values.length) return true;
//        else return false;
    }

    @Override
    public E next() {
        return values[index++];
    }
}
