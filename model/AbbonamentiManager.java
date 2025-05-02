package model;

public class AbbonamentiManager {
    private static AbbonamentiManager instance;

    private AbbonamentiManager() {}

    public static AbbonamentiManager getInstance() {
        if (instance == null) {
            instance = new AbbonamentiManager();
        }
        return instance;
    }

    public void terminaAbbonamento(Iscritto iscritto, Abbonamento abbonamento) {
        iscritto.terminaAbbonamento(abbonamento);
    }
}
