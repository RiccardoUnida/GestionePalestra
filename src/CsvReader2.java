import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader2{

    public static void main(String[] args) {
        String csvFile = "Abbonamenti.csv"; // Nome del file CSV

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            // Leggi l'intestazione
            if ((line = br.readLine()) != null) {
                String[] header = line.split(","); // Dividi l'intestazione in base alla virgola
                System.out.println(String.join(" | ", header)); // Stampa l'intestazione
            }

            // Leggi i dati
            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); // Dividi la riga in base alla virgola
                System.out.println(String.join(" | ", data)); // Stampa i dati
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}