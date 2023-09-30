package Seminars.S_1;

import Seminars.S_1.Animals.*;
import Seminars.S_1.VeterinaryClinic.Staff.Doctor;
import Seminars.S_1.VeterinaryClinic.Staff.Nurse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String ... args) {
        Owner alex = new Owner("Alexey");
        Vaccination chumka = new Vaccination("chumka", LocalDate.of(2010, 12, 5));

        Animal barsik = new Cat("barsik", 10.0, alex, LocalDate.now(), List.of(chumka), Colour.BLACK, "siamskiy");
//        System.out.println(barsik.getName());
//        System.out.println(barsik.getVaccinations());
        barsik.setVaccinations(List.of(chumka, new Vaccination("столбняк", LocalDate.now())));
//        System.out.println(barsik.getVaccinations());
        Animal barbos = new Dog("barbos", 10.0, alex, LocalDate.now(), List.of(chumka), Colour.WHITE);
        SeaSnake snake = new SeaSnake("snake");


        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(barbos);
        animals.add(snake);
//
//        barsik.lifeCycleRun();
//        barbos.lifeCycleRun();
//        snake.lifeCycleRun();

        Nurse nurse1 = new Nurse(2,"Julia","Nurse");
        Doctor doctor1 = new Doctor(1, "Tom", "Veterinarian", nurse1, barbos);

        System.out.println("Доктор: " + doctor1.getName());
        System.out.println("Медсестра: " + nurse1.getName());
        doctor1.prescribedMedicine(barbos.getName());
        doctor1.nurseToInjection(doctor1.getNurse(), barbos.getName()); //Не получилось нормально распечатать имя медсестры
        nurse1.injection(barbos.getName());

        System.out.println();

//        Fish fish = new Fish("Dory", 0.5, alex, LocalDate.now(), List.of(chumka), Colour.WHITE);
//        fish.swim();
//        System.out.println("Скорость рыбки "+ fish.getTYPE() + " " + fish.getName() + " " + fish.swimingSpeed());


//        for (Animal animal : animals.getPacients()) {
//            animal.heal();
//
//        }



    }
}
