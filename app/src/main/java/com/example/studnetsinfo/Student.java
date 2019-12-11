package com.example.studnetsinfo;

public class Student {
    private String ime;
    private String prezime;
    private String predmet;

    public Student(String ime, String prezime, String predmet) {
        this.ime = ime;
        this.prezime = prezime;
        this.predmet = predmet;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getPredmet() {
        return predmet;
    }
}
