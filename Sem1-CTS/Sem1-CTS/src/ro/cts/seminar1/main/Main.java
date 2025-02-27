package ro.cts.seminar1.main;

import ro.cts.seminar1.clase.*;
import ro.cts.seminar1.interfete.iPredabil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Andrei", 20, 1));
        studenti.add(new Student("Vlad", 21, 2));

        Curs curs = new Curs("CTS", 5,
                new Profesor("Alex", 33, 1, 10000, 0.3),
                studenti);

        System.out.println(((Persoana)curs.getProfesor()).calculareVenit());
        curs.sustinereExamen("12/02/2025");
        Asistent asistent = new Asistent("Florin", 32, 1, 5000);
        Curs curs2 = new Curs("CTS", 5,
                (iPredabil) new Asistent("Florin", 32, 1, 5000),
                studenti);
    }
}
