package Seminars.S_1.Animals;

import Seminars.S_1.Colour;
import Seminars.S_1.Interfaces.Runable;
import Seminars.S_1.Owner;
import Seminars.S_1.Vaccination;

import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal implements Runable {
    private double speed;
    public Dog(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinationDate, Colour colour) {
        super(name, weight, owner, birthDay, vaccinationDate, colour);
    }

    public Dog(String name, double speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public double getRunSpeed() {
        return 10.00;
    }
}
