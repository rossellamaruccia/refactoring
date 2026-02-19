package com.example.refactoring.chainOfResponsability;

public abstract class Handler {
    protected int stipendio;
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handle(int incomeToBeCompared) {
        if (canHandle(incomeToBeCompared)) {
            System.out.println("Lo stipendio coincide");
        } else if (next != null) {
            next.handle(incomeToBeCompared);
        }
    }

    private boolean canHandle(int incomeToBeCompared) {
        if (stipendio == incomeToBeCompared) {
            return true;
        }
        System.out.println("Passo al prossimo livello");
        return false;
    }
}
