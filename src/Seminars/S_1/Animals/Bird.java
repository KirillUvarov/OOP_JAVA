package Seminars.S_1.Animals;

import Seminars.S_1.Animal;
import Seminars.S_1.Colour;
import Seminars.S_1.Owner;
import Seminars.S_1.Vaccination;

import java.time.LocalDate;
import java.util.List;

public class Bird extends Animal {

    public double wingspan;

    public Bird(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Colour colour) {
        super(name, weight, owner, birthDay, vaccinations, colour);
    }

    public Bird(String name, double weight, Owner owner, LocalDate birthDay, Colour colour) {
        super(name, weight, owner, birthDay, colour);
    }

    public Bird(String name) {
        super(name);
    }

    public void setWingspan(Integer wingspan) {
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }
}
