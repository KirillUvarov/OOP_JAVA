package Seminars.S_1.Animals;

import Seminars.S_1.Colour;
import Seminars.S_1.Interfaces.Swimable;
import Seminars.S_1.Owner;
import Seminars.S_1.Vaccination;

import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal implements Swimable {
    private double speed;
    public Fish(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Colour colour) {
        super(name, weight, owner, birthDay, vaccinations, colour);
    }

    public Fish(String name, double weight, Owner owner, LocalDate birthDay, Colour colour) {
        super(name, weight, owner, birthDay, colour);
    }

    public Fish(String name) {
        super(name);
    }

    public Fish(String name, double speed) {
        super(name);
        this.speed = speed;
    }


    @Override
    public double getSwimSpeed() {
        return 13.00;
    }

}
