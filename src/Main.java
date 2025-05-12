public class Main {
    public static void main(String[] args) {
        IscrittiManager iscrittiManager = new IscrittiManager();
        AbbonamentiManager abbonamentiManager = new AbbonamentiManager();

        Iscritto iscritto1 = new Iscritto("Mario", "Rossi", "mario.rossi@email.com", "1234567890");
        Iscritto iscritto2 = new Iscritto("Luca", "Bianchi", "luca.bianchi@email.com", "0987654321");

        iscrittiManager.aggiungiIscritto(iscritto1);
        iscrittiManager.aggiungiIscritto(iscritto2);

        Abbonamento abbonamento1 = new AbbonamentoMensile(iscritto1, "2025-05-01");
        Abbonamento abbonamento2 = new AbbonamentoAnnuale(iscritto2, "2025-01-01");

        abbonamentiManager.aggiungiAbbonamento(abbonamento1);
        abbonamentiManager.aggiungiAbbonamento(abbonamento2);

        System.out.println("Iscritti registrati:");
        iscrittiManager.visualizzaIscritti();

        System.out.println("\nAbbonamenti attivi:");
        abbonamentiManager.visualizzaAbbonamenti();
    }
}
