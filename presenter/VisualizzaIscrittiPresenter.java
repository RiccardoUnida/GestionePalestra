package presenter;

import view.VisualizzaIscrittiView;
import model.IscrittiManager;
import model.Iscritto;
import java.util.List;

public class VisualizzaIscrittiPresenter {
    private VisualizzaIscrittiView view;

    public VisualizzaIscrittiPresenter(VisualizzaIscrittiView view) {
        this.view = view;
    }

    public void loadIscritti() {
        List<Iscritto> list = IscrittiManager.getInstance().getIscritti();
        view.mostraIscritti(list);
    }
}
