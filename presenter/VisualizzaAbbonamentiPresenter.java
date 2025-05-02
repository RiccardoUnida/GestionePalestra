package presenter;

import view.VisualizzaAbbonamentiView;
import model.Iscritto;
import model.IscrittiManager;
import model.Abbonamento;
import java.util.List;

public class VisualizzaAbbonamentiPresenter {
    private VisualizzaAbbonamentiView view;

    public VisualizzaAbbonamentiPresenter(VisualizzaAbbonamentiView view) {
        this.view = view;
    }

    public void loadAbbonamenti(String codice) {
        Iscritto i = IscrittiManager.getInstance().cercaPerCodice(codice);
        if (i == null) {
            view.mostraErrore("Iscritto non trovato");
        } else {
            List<Abbonamento> list = i.getAbbonamentiAttivi();
            view.mostraAbbonamenti(list);
        }
    }
}
