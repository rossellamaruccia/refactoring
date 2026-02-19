package com.example.refactoring.adapter;

import java.time.LocalDate;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        int birthYear = info.getDataDiNascita().getYear();

        int todayYear = LocalDate.now().getYear();

        return todayYear - birthYear;
    }
}
