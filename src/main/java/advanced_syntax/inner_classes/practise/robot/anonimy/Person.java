package advanced_syntax.inner_classes.practise.robot.anonimy;

public class Person {
    String imie;
    String nazwisko;
    int wiek = 7;

    public Person(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Person(String imie, String nazwisko) {
        this(imie, nazwisko,5);
    }

    public Person(String imie) {
        this(imie, "Kowalski",5);
    }

    public Person() {
        this("Adam", "Kowalski", 5);

    }

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
