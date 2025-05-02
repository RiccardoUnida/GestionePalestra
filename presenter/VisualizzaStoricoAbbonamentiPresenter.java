package presenter;

import view.VisualizzaStoricoAbbonamentiView;
import model.Iscritto;
import model.IscrittiManager;
import model.Abbonamento;
import java.util.List;

public class VisualizzaStoricoAbbonamentiPresenter {
    private VisualizzaStoricoAbbonamentiView view;

    public VisualizzaStoricoAbbonamentiPresenter(VisualizzaStoricoAbbonamentiView view) {
        this.view = view;
    }

    public void loadStorico(String codice) {
        Iscritto i = IscrittiManager.getInstance().cercaPerCodice(codice);
        if (i != null) {
            List<Abbonamento> list = i.getStoricoAbbonamenti();
            view.mostraStorico(list);
        }
    }
}
