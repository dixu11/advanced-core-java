package reflection.practise.sda;

public class Promotor {
    private String imie;
    private String nazwisko;

    @Label(value = "imie", order = 1)
    public String getImie() {
        return imie;
    }
    @Writable("wprowadzanie imienia")
    public Promotor setImie(String imie) {
        this.imie = imie;
        return this;
    }
    @Label(value = "nazwisko", order = 1)
    public String getNazwisko() {
        return nazwisko;
    }
    @Writable("wprowadzanie nazwiska")
    public Promotor setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        return this;
    }

    @Override
    public String toString() {
        return "Promotor{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
