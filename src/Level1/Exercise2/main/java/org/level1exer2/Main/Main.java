package org.level1exer2.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(25);
        numbersList.add(42);
        numbersList.add(67);
        numbersList.add(89);

        List<Integer> numbersListInverted = new ArrayList<>();

        ListIterator<Integer> listIterator = numbersList.listIterator();

        listIterator = numbersList.listIterator(numbersList.size());

        while(listIterator.hasPrevious()){
            numbersListInverted.add(listIterator.previous());
        }

        ListIterator<Integer> listIteratorInverted = numbersListInverted.listIterator();

        while(listIteratorInverted.hasNext()){
            System.out.println(listIteratorInverted.next());
        }

    }
}