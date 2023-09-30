package Seminars.S_1.VeterinaryClinic.Staff;

import Seminars.S_1.Animals.Animal;

public class Doctor extends BaseStaff {

    private Nurse nurse;
    private Animal patient;
    public Doctor(Integer serviceNumber, String name, String title) {
        super(serviceNumber, name, title);
    }

    public Doctor(Integer serviceNumber, String name, String title, Nurse nurse, Animal patient) {
        super(serviceNumber, name, title);
        this.nurse = nurse;
        this.patient = patient;
    }

    public void inspection(Animal patient){
        System.out.printf("Доктор осмотрел пациента: %s %n", patient);
    }

    public void prescribedMedicine(String patient){
        System.out.printf("Доктор выписал лекарство пациенту: %s%n", patient);
    }

    public void nurseToInjection (Nurse nurse, String patient){
        System.out.printf("Доктор просит медсестру %s сделать укол пациенту %s%n", nurse, patient);
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Animal getPatient() {
        return patient;
    }

    public void setPatient(Animal patient) {
        this.patient = patient;
    }
}
