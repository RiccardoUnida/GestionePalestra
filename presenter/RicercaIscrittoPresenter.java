package presenter;

import view.RicercaIscrittoView;
import model.Iscritto;
import model.IscrittiManager;

public class RicercaIscrittoPresenter {
    private RicercaIscrittoView view;

    public RicercaIscrittoPresenter(RicercaIscrittoView view) {
        this.view = view;
    }

    public void cercaIscritto(String codice) {
        Iscritto i = IscrittiManager.getInstance().cercaPerCodice(codice);
        view.mostraRisultato(i);
    }
}
