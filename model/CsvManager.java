package model;

import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CsvManager {
    private static CsvManager instance;
    private final String filePath = "iscritti.csv";
    private final DateTimeFormatter fmt = DateTimeFormatter.ISO_LOCAL_DATE;

    private CsvManager() {}

    public static CsvManager getInstance() {
        if (instance == null) {
            instance = new CsvManager();
        }
        return instance;
    }

    public void salvaIscritti(List<Iscritto> iscritti) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filePath))) {
            for (Iscritto i : iscritti) {
                pw.printf("%s,%s,%s,%s,%s\n", 
                    i.getCodice(), i.getNome(), i.getCognome(),
                    i.getAbbonamentiAttivi().size(),
                    i.getStoricoAbbonamenti().size());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Iscritto> caricaIscritti() {
        List<Iscritto> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                Iscritto i = new Iscritto(parts[1], parts[2], parts[0]);
                list.add(i);
            }
        } catch (IOException e) {
            // File might not exist yet
        }
        return list;
    }
}
