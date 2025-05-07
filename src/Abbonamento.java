package model;

import java.time.LocalDate;

public abstract class Abbonamento {
    protected LocalDate dataInizio;
    protected LocalDate dataFine;

    public Abbonamento(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
    }

    public abstract void calcolaDataFine();

    public LocalDate getDataInizio() { return dataInizio; }
    public LocalDate getDataFine() { return dataFine; }

    public String getTipo() {
        return this instanceof AbbonamentoMensile ? "Mensile" : "Annuale";
    }
}
