package S4.list;

import java.util.Arrays;
import java.util.Iterator;

public class GBArrayList<O> implements GB<O> {

    private O[] values;

    public GBArrayList() {
        this.values = (O[]) new Object[10];
    }

    @Override
    @SuppressWarnings("unchacked")
    public boolean add(O o) {

        try {
            O[] temp = values;
            values = (O[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[temp.length] = o;
            return true;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return false;
    }
    @SuppressWarnings("unchacked")
    @Override
    public boolean remove(int index) {
        try {
            O[] temp = values;
            values = (O[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElementsAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amountElementsAfterIndex);
//            values[temp.length] = o;
            return true;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public O get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, O t) {
        values[index] = t;
    }

    @Override
    public Iterator<O> iterator() {
        return new ArrayIterator<>(values);
    }

    @Override
    public String toString() {
        return "GBArrayList{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
