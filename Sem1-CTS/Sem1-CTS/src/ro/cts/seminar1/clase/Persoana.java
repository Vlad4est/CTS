package ro.cts.seminar1.clase;

import ro.cts.seminar1.interfete.iPersoana;

public abstract class Persoana implements iPersoana {
    protected String nume;
    protected   int varsta;



    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public abstract double calculareVenit();
}
