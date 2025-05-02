package model;

import java.util.*;

public class IscrittiManager {
    private static IscrittiManager instance;
    private List<Iscritto> iscritti;

    private IscrittiManager() {
        iscritti = new ArrayList<>();
    }

    public static IscrittiManager getInstance() {
        if (instance == null) {
            instance = new IscrittiManager();
        }
        return instance;
    }

    public void aggiungiIscritto(Iscritto iscritto) {
        iscritti.add(iscritto);
    }

    public List<Iscritto> getIscritti() {
        return iscritti;
    }

    public Iscritto cercaPerCodice(String codice) {
        for (Iscritto i : iscritti) {
            if (i.getCodice().equals(codice)) return i;
        }
        return null;
    }
}
