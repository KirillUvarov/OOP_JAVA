package S4.list;

public interface GB<Y> extends Iterable<Y> {
    boolean add(Y y);

    boolean remove(int index);

    Y get(int index);

    int size();

    void update(int index, Y t);

}
