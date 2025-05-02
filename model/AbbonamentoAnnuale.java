package model;

import java.time.LocalDate;

public class AbbonamentoAnnuale extends Abbonamento {
    public AbbonamentoAnnuale(LocalDate dataInizio) {
        super(dataInizio);
        calcolaDataFine();
    }

    @Override
    public void calcolaDataFine() {
        this.dataFine = dataInizio.plusYears(1);
    }
}
