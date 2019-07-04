package iterator;/*Zad. 2 (iterator)
        Zaimplementuj klasę reprezentującą strukturę danych
        – tablicę, z dwoma iteratorami:

        - iteratorem przechodzącym całą tablicę;
        - iteratorem przechodzącym tylko elementy niezerowe w tablicy.
        Zaimplementuj prosty program, który dla przykładowej tablicy wypisze
        elementy przeglądnięte przez obydwa iteratory.*/

import java.util.Iterator;

public class TestIterator {

    public static void main(String[] args) {

        IteratorClass ob1 = new IteratorClass();

        // standardowa iteracja przez for each możliwa dzięki interfejsowi iterable
        System.out.println("Normal iteration iteration:");
        for (String s : ob1) {
            System.out.println(s);
        }

       /*  specjalna iteracja możliwa dzięki specjalnej metodzie tworzącej
         nietypowy iterator*/

        System.out.println("Skip zero iteration:");
        Iterator<String> specialIterator = ob1.getSkipZeroIterator();
        while (specialIterator.hasNext()) {
            System.out.println(specialIterator.next());
        }

    }

}
