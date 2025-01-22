package org.level3exer1.Model;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class Reader {

    private HashMap<String,String> countries;

    public Reader() {
        this.countries = new HashMap<>();

    }

    public HashMap readFromFile(String filename) {

        try (
                Scanner scanner = new Scanner(Paths.get(filename))) {

            while (scanner.hasNextLine()) {

                String row = scanner.nextLine();
                String[] parts = row.split(";");
                countries.put(parts[0], parts[1]);

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return this.countries;
    }

}
