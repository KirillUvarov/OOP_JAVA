package Seminars.S_1.Animals;

import Seminars.S_1.Colour;
import Seminars.S_1.Interfaces.Runable;
import Seminars.S_1.Owner;
import Seminars.S_1.Vaccination;

import java.time.LocalDate;
import java.util.List;

public class Wolf extends Animal implements Runable {
    private double speed;
    public Wolf(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Colour colour) {
        super(name, weight, owner, birthDay, vaccinations, colour);
    }

    public Wolf(String name, double weight, Owner owner, LocalDate birthDay, Colour colour) {
        super(name, weight, owner, birthDay, colour);
    }

    public Wolf(String name) {
        super(name);
    }

    public Wolf(String name, double speed) {
        super(name);
        this.speed = speed;
    }


    @Override
    public double getRunSpeed() {
        return 25;
    }
}
