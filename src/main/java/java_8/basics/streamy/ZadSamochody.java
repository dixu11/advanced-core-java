package java_8.basics.streamy;

import java.util.*;
import java.util.stream.Collectors;

public class ZadSamochody {
        /*Sporządź listę obiektów klasy Samochód. Każdy samochód ma pole4 marka,
        cena, pojemność. Klasę należy zaopatrzyć w niezbędne metody potrzebne
        do jej prawidłowego działania i zarządzania nią. Stosując strumienie
        zwróć średnią arytmetyczną cen samochodów w strumieniu oraz w stosując
        drugi strumień posortowaną listę samochodów malejąco według
        pojemności.
        */


    public static void main(String[] args) {

        List<Samochod> lisaAut = new ArrayList<>();

        Samochod samochod1 = new Samochod("audi", 200000, 14);
        Samochod samochod2 = new Samochod("bmw", 3430000, 6.7);
        Samochod samochod3 = new Samochod("ford", 5630000, 9.6);
        Samochod samochod4 = new Samochod("fiat", 630000, 7.6);

        lisaAut.add(samochod1);
        lisaAut.add(samochod2);
        lisaAut.add(samochod3);
        lisaAut.add(samochod4);
        Comparator<Samochod> samochodComperator = (s1, s2) -> -Double.compare(s1.getPojemnosc(), s2.getPojemnosc());

        List<Samochod> posortowaneWgPojemnosci2 =
                lisaAut.stream().
                      sorted(samochodComperator)
                        .collect(Collectors.toList());


        System.out.println("wersja krotsza:");
        for (Samochod samochod : posortowaneWgPojemnosci2) {
            System.out.println(samochod);
        }

        System.out.println("wersja dluzsza:");




        Comparator<Double> doubleComparator = (double1, double2) -> -(double1.compareTo(double2));



        Double average = lisaAut.stream()
                .mapToDouble(Samochod::getCena).average()
                .orElse(0.0);

        List<Samochod> posortowaneWgPojemnosci =
                lisaAut.stream().
                map(samochod -> samochod.getPojemnosc())
                .sorted(doubleComparator)
                .map(pojemnosc ->
                        lisaAut.stream()
                        .filter(samochod -> samochod.getPojemnosc() == pojemnosc)
                        .findFirst().orElse(null))
                .collect(Collectors.toList());

        for (Samochod samochod : posortowaneWgPojemnosci) {
            System.out.println(samochod);
        }


        Map<Double, Samochod> mapka = lisaAut.stream().
                collect(Collectors.toMap(samochod -> samochod.getPojemnosc(), samochod -> samochod));

        Map<Double, Samochod> mapka1 = new LinkedHashMap<>(mapka);
        mapka1.keySet().stream()
                .sorted(doubleComparator);


    }
}

