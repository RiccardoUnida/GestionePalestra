package model;

import java.util.ArrayList;
import java.util.List;

public class Iscritto {
    private String nome;
    private String cognome;
    private String codice;
    private List<Abbonamento> abbonamentiAttivi;
    private List<Abbonamento> storicoAbbonamenti;

    public Iscritto(String nome, String cognome, String codice) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.abbonamentiAttivi = new ArrayList<>();
        this.storicoAbbonamenti = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public String getCognome() { return cognome; }
    public String getCodice() { return codice; }

    public List<Abbonamento> getAbbonamentiAttivi() { return abbonamentiAttivi; }
    public List<Abbonamento> getStoricoAbbonamenti() { return storicoAbbonamenti; }

    public void aggiungiAbbonamentoAttivo(Abbonamento a) {
        abbonamentiAttivi.add(a);
    }

    public void terminaAbbonamento(Abbonamento a) {
        abbonamentiAttivi.remove(a);
        storicoAbbonamenti.add(a);
    }
}
