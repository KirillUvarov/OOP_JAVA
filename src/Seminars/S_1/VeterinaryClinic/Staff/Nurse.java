package Seminars.S_1.VeterinaryClinic.Staff;

public class Nurse extends BaseStaff{

    public Nurse(Integer serviceNumber, String name, String title) {
        super(serviceNumber, name, title);
    }

    public void injection(String patient){
        System.out.printf("Медсестра сделала укол пациенту: %s %n", patient);
    }


}
