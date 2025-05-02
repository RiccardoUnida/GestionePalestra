package presenter;

import model.Iscritto;
import model.IscrittiManager;
import view.AggiuntaIscrittoView;

public class AggiuntaIscrittoPresenter {
    private AggiuntaIscrittoView view;

    public AggiuntaIscrittoPresenter(AggiuntaIscrittoView view) {
        this.view = view;
    }

    public void aggiungiIscritto(String nome, String cognome, String codice) {
        Iscritto i = new Iscritto(nome, cognome, codice);
        IscrittiManager.getInstance().aggiungiIscritto(i);
        view.mostraMessaggio("Iscritto aggiunto!");
    }
}
