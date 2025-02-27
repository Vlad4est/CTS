package ro.cts.seminar1.clase;

public class Student extends Persoana {
    private int idStud;

    public Student() {
        super("Student", 18);
        this.idStud = 0;
    }

    public Student(String nume, int varsta, int idStud) {
        super(nume, varsta);
        this.idStud = idStud;
    }

    public int getIdStud() {
        return idStud;
    }

    public void setIdStud(int idStud) {
        this.idStud = idStud;
    }

    @Override
    public double calculareVenit() {
        return 0;
    }
}
