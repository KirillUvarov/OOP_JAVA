package Seminars.S_1.Interfaces;

import Seminars.S_1.Animals.Bat;
import Seminars.S_1.Animals.Bird;

public interface Flyable {
    public default void goFly() {
        System.out.println(" летает ");
    }
}
