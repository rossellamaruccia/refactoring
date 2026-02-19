package com.example.refactoring.chainOfResponsability;

public class Colonnello extends Handler {
    public Colonnello() {
        this.stipendio = 4000;
        this.next = new Generale();
    }
}
