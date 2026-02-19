package com.example.refactoring.chainOfResponsability;

public class Tenente extends Handler {
    public Tenente() {
        this.stipendio = 1000;
        this.next = new Maggiore();
    }
}
