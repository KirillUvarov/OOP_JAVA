package Seminars.S_1.VeterinaryClinic;

import Seminars.S_1.Animals.Animal;
import Seminars.S_1.Animals.Bat;
import Seminars.S_1.Animals.Cat;
import Seminars.S_1.Animals.Dog;
import Seminars.S_1.Colour;
import Seminars.S_1.Interfaces.Flyable;
import Seminars.S_1.Interfaces.Runable;
import Seminars.S_1.Owner;
import Seminars.S_1.Vaccination;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic(new ArrayList<>());
        clinic.addAnimal(new Cat("vasia", 10.0, new Owner("Liza"), LocalDate.now(), List.of((new Vaccination("chumka", LocalDate.now()))), Colour.BLACK, "siamskiy"));
        clinic.addAnimal(new Dog("bobik", 10.0, new Owner("Liza"), LocalDate.now(), List.of((new Vaccination("chumka", LocalDate.now()))), Colour.BLACK));
        clinic.addAnimal(new Bat("lobik", 30.00));

        for (Animal animal : clinic.getPacients()) {
            if (animal instanceof Flyable){
                System.out.println(animal.getName() + " Летает со скоростью: " + ((Flyable) animal).getFlySpeed());
            }
//            animal.heal();

        }

        for (Animal animal : clinic.getPacients()) {
            if (animal instanceof Runable){
                System.out.println(animal.getName() + " Бегает со скоростью: " + ((Runable) animal).getRunSpeed());

            }


        }

    }
}
