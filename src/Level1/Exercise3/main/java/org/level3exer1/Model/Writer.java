package org.level3exer1.Model;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    private FileWriter myWriter;

    public Writer(String filename) {
        try {
            this.myWriter = new FileWriter(filename, true);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public void writeToFile(String name, int points ) {

        try{
            this.myWriter.write(name + " - " + points + "\n");
            this.myWriter.close();
            System.out.println("Successfully saved to file");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());

        }

    }

}
