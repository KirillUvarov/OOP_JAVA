package Seminars.S_1;

import java.time.LocalDate;

public class Animal {
    private String name;
    public double weight;
    private Owner owner;
    private LocalDate birthDay;
    private List<Vaccination> vaccinationDate;
    private Colour colour;
    private final String TYPE = this.getClass().getSimpleName();

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

    public List<Vaccination> getVaccinationDate() {
        return vaccinationDate;
    }

    public Colour getColour() {
        return colour;
    }

    public String getTYPE() {
        return TYPE;
    }

    public Animal(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinationDate, Colour colour) {
        this.name = name;
        this.weight = weight;
        this.owner = owner;
        this.birthDay = birthDay;
        this.vaccinationDate = vaccinationDate;
        this.colour = colour;
    }
}
