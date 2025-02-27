package ro.cts.seminar1.clase;

import ro.cts.seminar1.interfete.iPredabil;

public class Profesor extends Persoana implements iPredabil {
    public int idProfesor;
    public double salariul;
    public double sporVechime;

    public Profesor(String nume, int varsta, int idProfesor, double salariul, double sporVechime) {
        super(nume, varsta);
        this.idProfesor = idProfesor;
        this.salariul = salariul;
        this.sporVechime = sporVechime;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public double getSalariul() {
        return salariul;
    }

    public void setSalariul(int salariul) {
        this.salariul = salariul;
    }

    public double getSporVechime() {
        return sporVechime;
    }

    public void setSporVechime(int sporVechime) {
        this.sporVechime = sporVechime;
    }

    @Override
    public double calculareVenit() {
        return 12 * salariul * sporVechime;
    }

    @Override
    public void preda() {

        StringBuilder sb = new StringBuilder("Profesorul ");
        sb.append(this.nume + " in vasta de " + this.varsta);
    }
}
