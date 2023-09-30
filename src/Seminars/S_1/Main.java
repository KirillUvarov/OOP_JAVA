package Seminars.S_1;

import Seminars.S_1.Animals.Animal;
import Seminars.S_1.Animals.Cat;
import Seminars.S_1.Animals.Dog;
import Seminars.S_1.Animals.SeaSnake;
import Seminars.S_1.Staff.Doctor;
import Seminars.S_1.Staff.Nurse;

import java.time.LocalDate;
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
        Animal barbos = new Dog("barbos", 10.0, alex, LocalDate.now(), List.of(chumka), Colour.WHITE);
        SeaSnake snake = new SeaSnake("snake");


//        List<Animal> animals = new ArrayList<>();
//        animals.add(barsik);
//        animals.add(barbos);
//        animals.add(snake);
//
//        for (Animal animal : animals) {
//            if (animal instanceof Cat) {
//                System.out.println(((Cat) animal).getBreed());
//            }
//            if (animal instanceof Cat) {
//                System.out.println(((Cat) animal).getBreed());
//            }
//            System.out.println(animal.getName());
//        }

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



    }
}
