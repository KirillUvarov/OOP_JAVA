package S4.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GBArrayListTest {
    @Test
    public void addTest() {
        GB<Integer> list = new GBArrayList();
        list.add(5);
        System.out.println(list);
        Assertions.assertEquals(5, list.get(0));
    }
    @Test
    public void addNegativeTest() {
        GB<Integer> list = new GBArrayList();
        list.add(5);
        Assertions.assertNotEquals(7, list.get(0));
    }

}