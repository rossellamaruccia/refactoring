package com.example.refactoring.chainOfResponsability;

public class Maggiore extends Handler {
    public Maggiore() {
        this.stipendio = 2000;
        this.next = new Capitano();
    }
}