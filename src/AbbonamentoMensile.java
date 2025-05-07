package model;

import java.time.LocalDate;

public class AbbonamentoMensile extends Abbonamento {
    public AbbonamentoMensile(LocalDate dataInizio) {
        super(dataInizio);
        calcolaDataFine();
    }

    @Override
    public void calcolaDataFine() {
        this.dataFine = dataInizio.plusMonths(1);
    }
}
