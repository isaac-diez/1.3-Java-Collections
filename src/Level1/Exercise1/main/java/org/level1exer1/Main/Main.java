package org.level1exer1.Main;

import org.level1exer1.Model.Month;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Month> monthArrayList = new ArrayList<>();

        Month January = new Month("January");
        Month February = new Month("February");
        Month March = new Month("March");
        Month April = new Month("April");
        Month May = new Month("May");
        Month June = new Month("June");
        Month July = new Month("July");
        Month August = new Month("August");
        Month September = new Month("September");
        Month October = new Month("October");
        Month November = new Month("November");
        Month December = new Month("December");

        monthArrayList.add(January);
        monthArrayList.add(February);
        monthArrayList.add(March);
        monthArrayList.add(April);
        monthArrayList.add(May);
        monthArrayList.add(June);
        monthArrayList.add(July);
        monthArrayList.add(September);
        monthArrayList.add(October);
        monthArrayList.add(November);
        monthArrayList.add(December);

        System.out.println("List before adding \"August\"");

        int i = 0;
        for (Month month : monthArrayList) {
            System.out.println(i + " - " + month.getName());
            i++;
        }

        System.out.print("\n");

        monthArrayList.add(7,August);

        System.out.println("List adding adding \"August\"");

        i = 0;
        Iterator<Month> iterator = monthArrayList.iterator();
            while (iterator.hasNext()) {
                System.out.println(i + " - " + iterator.next().getName());
                i++;
            }


        System.out.print("\n");
        System.out.println("Month in position 6 before August: " + monthArrayList.get(6).getName());
        System.out.println("Month in position 8 after August: " + monthArrayList.get(8).getName());

        System.out.print("\n");

        HashSet<Month> monthHashSet = new HashSet<>();

        System.out.print("Creating HashSet from ArrayList...");


        for (Month month : monthArrayList) {
            monthHashSet.add(month);
        }

        if (monthHashSet.size() == 12){
            System.out.println("DONE");
        } else {
            System.out.println("FAILED");
        }

        System.out.println("Iterating through the new HashSet:");
        Iterator<Month> iteratorHS = monthHashSet.iterator();

        i = 0;
        while (iteratorHS.hasNext()) {
            System.out.println(i + " - " + iteratorHS.next().getName());
            i++;
        }

        System.out.print("\n");
        System.out.println("Trying to add AUGUST again: " + monthHashSet.add(August));

    }
}