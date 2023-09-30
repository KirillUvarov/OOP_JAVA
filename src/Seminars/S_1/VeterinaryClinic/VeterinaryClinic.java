package Seminars.S_1.VeterinaryClinic;

import Seminars.S_1.Animals.Animal;

import java.util.List;

public final class VeterinaryClinic {
    private List<Animal> pacients;

    public VeterinaryClinic(List<Animal> pacients) {
        this.pacients = pacients;
    }

    public void addAnimal(Animal animal){
        pacients.add(animal);
    }

    public List<Animal> getPacients() {
        return pacients;
    }
}
