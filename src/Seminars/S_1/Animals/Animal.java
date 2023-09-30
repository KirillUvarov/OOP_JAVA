package Seminars.S_1.Animals;

import Seminars.S_1.Colour;
import Seminars.S_1.Owner;
import Seminars.S_1.Vaccination;

import java.time.LocalDate;
import java.util.List;

public class Animal {
    protected String name;
    protected double weight;
    protected Owner owner;
    protected LocalDate birthDay;
    protected List<Vaccination> vaccinations;
    protected Colour colour;
    protected final String TYPE = this.getClass().getSimpleName();

    public Animal(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Colour colour) {
        this.name = name;
        this.weight = weight;
        this.owner = owner;
        this.birthDay = birthDay;
        this.vaccinations = vaccinations;
        this.colour = colour;
    }
    public Animal(String name, double weight, Owner owner, LocalDate birthDay, Colour colour) {
        this(name,
                weight,
                owner,
                birthDay,
                null,
                colour);
    }
    public Animal(String name) {
        this.name = name;
    }

    public void lifeCycleFly() {
        wakeUp();
//        goFly();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }

    public void lifeCycleRun() {
        wakeUp();
        goGo();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }
    public void lifeCycleSwim() {
        wakeUp();
        goSwim();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }


    private void wakeUp(){
        System.out.println(this.TYPE + " проснулся ");
    }
    private void findFood(){
        System.out.println(this.TYPE + " ищет еду ");
    }
    private void eat(){
        System.out.println(this.TYPE + " кушает ");
    }
    private void toPlay(){System.out.println(this.TYPE + " играет ");    }
    private void sound(){
        System.out.println(this.TYPE + " издаёт звук ");
    }
    private void goToSleep() {System.out.println(this.TYPE + " ложится спать ");}

    public void goGo() {
        if (!(this.TYPE.equals(Bird.class.getSimpleName()) || this.TYPE.equals(Bat.class.getSimpleName()))) {
            System.out.println(this.TYPE + " не бегает, потому что не умеет");
        } else {
            System.out.println(this.TYPE + " бегает ");
        }
    }



    public void goSwim() {
        if (!(this.TYPE.equals(SeaSnake.class.getSimpleName()) || this.TYPE.equals(Fish.class.getSimpleName()))) {
            System.out.println(this.TYPE + " не плавает, потому что не умеет");
        } else {
            System.out.println(this.TYPE + " плавает ");
        }
    }


    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public Owner getOwner() {
        return owner;
    }
    public LocalDate getBirthDay() {
        return birthDay;
    }
    public List<Vaccination> getVaccinations() {
        return vaccinations;
    }
    public void setVaccinations(List<Vaccination> vaccinations) {
        this.vaccinations = vaccinations;
    }
    public Colour getColour() {
        return colour;
    }
    public String getTYPE() {
        return TYPE;
    }

}


