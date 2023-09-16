package Seminars.S_1.Animals;

import Seminars.S_1.Animal;
import Seminars.S_1.Colour;
import Seminars.S_1.Owner;
import Seminars.S_1.Vaccination;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal {

    private String breed;

    public Cat(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinationDate, Colour colour, String siamskiy) {
        super(name, weight, owner, birthDay, vaccinationDate, colour);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
