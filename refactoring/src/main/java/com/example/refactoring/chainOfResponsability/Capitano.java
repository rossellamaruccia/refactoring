package com.example.refactoring.chainOfResponsability;

public class Capitano extends Handler {
    public Capitano() {
        this.stipendio = 3000;
        this.next = new Colonnello();
    }
}