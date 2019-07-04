package reflection.practise.sda;

public class Student {
//    utwórz klasę student z polamni imie nazwisko rok + geterty setery tustring
//    wpisz metodę która metodą refleksji będzie wyświetlała w przyjazny sposób zawartość tej klasy
//    stwórz adnotację @Label w której pola klasy będą miały przyjazną nazwę
//    stwórz adnoitację @Writable
//    zaznacz adnotacją @Writable settery klasy stident
//    Program na podstaiwe adnotacji ma umożliwaić użytkownikowi ustawienie pól tej klasy

    private String imie;
    private String nazwisko;
    private int rokStudiow;
    private double srednia;
    private Promotor promotor;

    @Label(value = "średnia ocen", order = 1)
    public double getSrednia() {
        return srednia;
    }
    @Writable("ustawiam średnią")
    public Student setSrednia(double srednia) {
        this.srednia = srednia;
        return this;
    }
    @Label(value = "imie", order = 1)
    public String getImie() {
        return imie;
    }

    @Label(value = "nazwisko", order = 1)
      public String getNazwisko() {
        return nazwisko;
    }
    @Label(value = "rok studiów", order = 1)
    public int getRokStudiow() {
        return rokStudiow;
    }
    @Writable("ustawiam imie")
    public Student setImie(String imie) {
        this.imie = imie;
        return this;
    }
    @Writable("ustawiam nazwisko")
    public Student setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        return this;
    }
    @Writable("ustawiam rok studiów")
    public Student setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
        return this;
    }
    @Label(value = "promotor", order = 1)
    public Promotor getPromotor() {
        return promotor;
    }
    @Writable("ustawiam promotra")
    public Student setPromotor(Promotor promotor) {
        this.promotor = promotor;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", rokStudiow=" + rokStudiow +
                '}';
    }
}
