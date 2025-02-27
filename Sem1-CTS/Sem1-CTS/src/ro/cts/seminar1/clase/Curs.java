package ro.cts.seminar1.clase;

import ro.cts.seminar1.interfete.iPredabil;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private int numarCredite;
    private iPredabil profesor;
    private List<Student> listaStudenti;

    public Curs() {
        numeCurs = "CTS";
        numarCredite = 5;
        listaStudenti = new ArrayList<>();
    }

    public Curs(String numeCurs, int numarCredite, iPredabil profesor, List<Student> listaStudenti) {
        this.numeCurs = numeCurs;
        this.numarCredite = numarCredite;
        this.profesor = profesor;
        this.listaStudenti = listaStudenti;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public int getNumarCredite() {
        return numarCredite;
    }

    public void setNumarCredite(int numarCredite) {
        this.numarCredite = numarCredite;
    }

    public iPredabil getProfesor() {
        return profesor;
    }

    public void setProfesor(iPredabil profesor) {
        this.profesor = profesor;
    }

    public List<Student> getListaStudenti() {
        return listaStudenti;
    }

    public void setListaStudenti(List<Student> listaStudenti) {
        this.listaStudenti = listaStudenti;
    }

    public void afisareDetalii() {
        StringBuilder sb = new StringBuilder("La cusrsul ")
                .append(this.numeCurs)
                .append(" cu ")
                .append(this.numarCredite)
                .append(" credite ")
                .append(" predat de ")
                .append(((Persoana)this.profesor).getNume())
                .append(" are")
                .append(listaStudenti.size()).append(" de studenti");
    }
    public void sustinereExamen(String data) {
        StringBuilder sb = new StringBuilder(("Pe data "))
                .append(data).append("profsorul ").append(((Persoana)this.profesor).getNume())
                .append(" sustine examen cu urmatorii studenti: ");
        System.out.println(sb.toString());
        listaStudenti.forEach(s -> System.out.println(s.getNume()));
    }
}
