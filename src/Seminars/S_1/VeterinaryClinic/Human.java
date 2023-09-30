package Seminars.S_1.VeterinaryClinic;

import Seminars.S_1.Animals.Animal;

public class Human extends Animal {


    public Human(String name) {
        super(name);
    }

    @Override
    public void heal() {
        System.out.println("Доктор лечит " + this.TYPE + " " + this.name);
    }
}
