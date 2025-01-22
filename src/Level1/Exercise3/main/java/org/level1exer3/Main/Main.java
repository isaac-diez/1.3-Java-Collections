package org.level1exer3.Main;

import org.level3exer1.Model.Writer;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HashMap<String,String> countries = new HashMap<>();

        readFromFile(countries,"src/Level1/Exercise3/countries.txt");

        ArrayList<String> keysAsArray = new ArrayList<>();
        for (String countryName : countries.keySet()) {
            keysAsArray.add(countryName);
        }


        System.out.print("Input your name: ");
        String name = input.nextLine();

        int points = getPoints(keysAsArray, input, countries);

        Writer resultsWriter = new Writer("src/Level1/Exercise3/stats.txt");
        resultsWriter.writeToFile(name,points);




    }

    private static int getPoints(ArrayList<String> keysAsArray, Scanner input, HashMap<String, String> countries) {
        int points = 0;
        ArrayList<String> countriesPicked = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            boolean checker = false;
            String countryName="";

            while (!checker) {
                Random randomPick = new Random();
                countryName = keysAsArray.get(randomPick.nextInt(keysAsArray.size()));

                if (!countriesPicked.contains(countryName)){
                    checker = true;
                }

                countriesPicked.add(countryName);

            }

            System.out.print("Capital of " + countryName + "? ");
            String capital = input.nextLine();

            if (countries.get(countryName).equals(capital)) {
                points++;
            }
        }

        System.out.println("You guessed right " + points + " times");
        return points;
    }

    private static void readFromFile(HashMap<String, String> countries, String filename) {
        try (Scanner scanner = new Scanner(Paths.get(filename))){

            while(scanner.hasNextLine()){

                String row = scanner.nextLine();
                String[] parts = row.split(";");
                countries.put(parts[0],parts[1]);

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}