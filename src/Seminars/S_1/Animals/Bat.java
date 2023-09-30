package Seminars.S_1.Animals;

import Seminars.S_1.Colour;
import Seminars.S_1.Interfaces.Flyable;
import Seminars.S_1.Owner;
import Seminars.S_1.Vaccination;

import java.time.LocalDate;
import java.util.List;

public class Bat extends Animal implements Flyable {
    public double speed;

    public Bat(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Colour colour) {
        super(name, weight, owner, birthDay, vaccinations, colour);
    }

    public Bat(String name, double weight, Owner owner, LocalDate birthDay, Colour colour) {
        super(name, weight, owner, birthDay, colour);
    }

    public Bat(String name) {
        super(name);
    }

    public Bat(String name, double speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public double getFlySpeed() {
        return 10.00;
    }
}

