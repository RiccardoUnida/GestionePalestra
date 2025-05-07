import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CsvWriter {

    public static void main(String[] args) {
        String csvFile = "dati.csv"; // Nome del file CSV
        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile))) {
            String[] header = {"ID", "Nome", "Cognome"};
            writer.write(String.join(",", header));
            writer.newLine();
            System.out.println("Inserisci i dati (ID, Nome, Cognome) o digita 'esci' per terminare:");
            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("esci")) {
                    break;
                }
                String[] data = input.trim().split(",");
                if (data.length == 3) {
                    writer.write(String.join(",", data));
                    writer.newLine();
                } else {
                    System.out.println("Inserisci esattamente 3 valori separati da virgola.");
                }
            }

            System.out.println("Dati scritti con successo nel file " + csvFile);
        } catch (IOException e) {
        } finally {
            scanner.close();
        }
    }
}
