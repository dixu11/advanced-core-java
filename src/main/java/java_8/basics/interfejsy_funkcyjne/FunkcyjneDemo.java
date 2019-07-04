package java_8.basics.interfejsy_funkcyjne;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
/*
Zad 2 Zaimplementuj metodę, która przyjmuje jako argument tablicę
        napisów oraz dwa interfejsy Predicate<String> o nazwach p1
        oraz p2 i zwraca wartość typu int. Wartość zwracana określa,
        ile elementów przeszło test implementowany w interfejsach.
        Interfejs p1 sprawdza elementy na pozycjach parzystych.
        Interfejs p2 sprawdza elementy na pozycjach nieparzystych. W
        metodzie głównej programu przygotuj tablicę napisów oraz
        wywołaj opisaną wcześniej metodę stosując dwie implementacje
        interfejsów Predicate. Implementacja p1 zwraca true, kiedy
        napis składa się z samych dużych liter o łącznej sumie kodów
        ASCII przekraczającej stukrotność długości napisu.
        Implementacja p2 zwraca true, kiedy napis zawiera w sobie
        więcej samogłosek niż spółgłosek.*/


public class FunkcyjneDemo {

    Object o1 = new Object();
    String string = new String("df");
    String ldfddf = "sdsd";
    String[] strings = new String[4];
    String[] strings2 = {"sdsd","sdsd"};
    Predicate<String> stringPredicate = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return true;
        }
    };
    Predicate<String> stringPredicate2 = x -> true;





    public static void main(String[] args) {
        System.out.println("test polskich liter: łńąż");
        List<Double> lista = Arrays.asList(5.0, 6.0, 7.0);
        double conter = lista.stream()
                .mapToDouble(liczba -> liczba)
                .average()
                .orElse(0.0);
        System.out.println(conter);


        String string = "Daniel";
        TesterParzystych p1 = slowo -> {
            int sumaAsci = 0;
            System.out.println(new String(slowo));
            for (char character : slowo) {
                if (Character.isLowerCase(character)) {
                    System.out.println("nie wszystkie duże");
                    return false;
                }
                sumaAsci += character;
            }
            System.out.println("suma asci to: " + sumaAsci
            + " dlugosc slowa * 100 to: " + (slowo.length*100));
            return sumaAsci > slowo.length * 100;
        };

        System.out.println((int)'g');
        System.out.println(p1.test("SDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSDSD".toCharArray()));

    TesterNieparzystych p2 = x->true;
        String[] slowa = {"SDSDSD","dfsSg","234edcin","asdfin","FDCS","Mcvbcin","ertcin","werin","sdfin","carcin4",
                "NIBJHBJHBJHBDJBDCBHDCBHWEJHBJHBJHBDEHBCJHEBCJEHCBJBDFVJHDFBJHCBDJBJFBDJFBEJBFJHCBEDBJHEC","A","B","Z"};
        System.out.println((testSlow(slowa,p1,p2)));


    }

    public static int testSlow(String[] napisy, Predicate<char[]> testujParzyste, Predicate<char[]> testujNiemarzyste) {
        int test1 = (int) IntStream.range(0, napisy.length)
                .filter(number -> number % 2 == 0)
                .mapToObj(number -> napisy[number])
                .map(napis -> napis.toCharArray())
                .filter(testujParzyste)
                .map(chary -> new String(chary))
                .count();
        return test1;
    }
}
