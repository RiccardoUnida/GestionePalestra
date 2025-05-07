import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWriter2 {

    public static void main(String[] args) {
        String csvFile = "Abbonamenti.csv"; // Nome del file CSV
        String[] header = {"Data Inizio", "Data Fine", "Tipo", "ID"}; // Intestazione del CSV
        String[][] data = {
            {"23.05.24", "23.06.24", "Mensile","13"},
            {"23.05.24", "23.05.25", "Annuale","14"},
            {"23.06.24", "23.07.26", "Mensile","15"},
        };

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile))) {
            // Scrivi l'intestazione
            writer.write(String.join(" - ", header));
            writer.newLine();

            // Scrivi i dati
            for (String[] row : data) {
                writer.write(String.join(" - ", row));
                writer.newLine();
            }

            System.out.println("Dati scritti con successo nel file " + csvFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}