package Seminars.S_1;

import java.time.LocalDate;

public class Vaccination {
    public Vaccination(LocalDate vaccinationDate) {
        this.vaccinationDate = vaccinationDate;
    }

    public LocalDate vaccinationDate;

    public Vaccination(String title) {
        this.title = title;
    }

    private String title;
}
