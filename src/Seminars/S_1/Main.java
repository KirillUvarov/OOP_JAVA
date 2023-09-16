package Seminars.S_1;

import Seminars.S_1.Animals.Cat;
import Seminars.S_1.Animals.Dog;
import Seminars.S_1.Animals.SeaSnake;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner alex = new Owner("Alexey");
        Vaccination chumka = new Vaccination("chumka", LocalDate.of(2010, 12, 5));

        Animal barsik = new Cat("barsik", 10.0, alex, LocalDate.now(), List.of(chumka), Colour.BLACK, "siamskiy");
//        System.out.println(barsik.getName());
//        System.out.println(barsik.getVaccinations());
        barsik.setVaccinations(List.of(chumka, new Vaccination("столбняк", LocalDate.now())));
//        System.out.println(barsik.getVaccinations());
        Dog barbos = new Dog("barbos", 10.0, alex, LocalDate.now(), List.of(chumka), Colour.WHITE);
        SeaSnake snake = new SeaSnake("snake");


        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(barbos);
        animals.add(snake);

        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                System.out.println(((Cat) animal).getBreed());
            }
            if (animal instanceof Cat) {
                System.out.println(((Cat) animal).getBreed());
            }
            System.out.println(animal.getName());
        }

        //((Cat) barsik).getBreed();

        barsik.lifeCycleRun();
        barbos.lifeCycleRun();
        snake.lifeCycleRun();


    }
}
