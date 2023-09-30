package S4.list;

public class Main {
    public static void main(String[] args) {
        GB<Integer> list = new GBArrayList<>();
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(3);
        System.out.println(list.get(1));
        list.update(1, 9);
        list.update(3, 9);
        list.update(0, 6);
        System.out.println(list);


    }
}
