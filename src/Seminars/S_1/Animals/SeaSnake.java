package Seminars.S_1.Animals;

import Seminars.S_1.Colour;
import Seminars.S_1.Interfaces.Swimable;
import Seminars.S_1.Owner;
import Seminars.S_1.Vaccination;

import java.time.LocalDate;
import java.util.List;

public class SeaSnake extends Animal implements Swimable {
    public SeaSnake(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Colour colour) {
        super(name, weight, owner, birthDay, vaccinations, colour);
    }

    public SeaSnake(String name, double weight, Owner owner, LocalDate birthDay, Colour colour) {
        super(name, weight, owner, birthDay, colour);
    }

    public SeaSnake(String name) {
        super(name);
    }

//    SeaSnake seaSnake = new SeaSnake().

}
