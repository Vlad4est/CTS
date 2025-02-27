package ro.cts.seminar1.clase;

import ro.cts.seminar1.interfete.iPredabil;

public class Asistent extends Persoana implements iPredabil {
    private int idAsistent;
    private double salariul;

    public Asistent() {
        super("ro.cts.seminar1.clase.Asistent", 25);
    }

    public Asistent(String nume, int varsta, int idAsistent, double salariul) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
        this.salariul = salariul;
    }

    public int getIdAsistent() {
        return idAsistent;
    }

    public void setIdAsistent(int idAsistent) {
        this.idAsistent = idAsistent;
    }

    @Override
    public double calculareVenit() {
        return 12 * salariul;
    }

    @Override
    public void preda() {

    }
}
