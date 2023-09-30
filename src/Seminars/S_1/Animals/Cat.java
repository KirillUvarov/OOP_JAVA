package Seminars.S_1.Animals;

import Seminars.S_1.Colour;
import Seminars.S_1.Interfaces.Runable;
import Seminars.S_1.Owner;
import Seminars.S_1.Vaccination;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal implements Runable {
    private double speed;
    private String breed;

    public Cat(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinationDate, Colour colour, String siamskiy) {
        super(name, weight, owner, birthDay, vaccinationDate, colour);

    }

    public Cat(String name, double speed) {
        super(name);
        this.speed = speed;
    }


    public String getBreed() {
        return breed;
    }

    @Override
    public double getRunSpeed() {
        return 15;
    }
}

