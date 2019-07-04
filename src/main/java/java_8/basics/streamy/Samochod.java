package java_8.basics.streamy;

public class Samochod {
    private String marka;
    private double cena;
    private double pojemnosc;

    public Samochod(String marka, double cena, double pojemnosc) {
        this.marka = marka;
        this.cena = cena;
        this.pojemnosc = pojemnosc;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(double pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", cena=" + cena +
                ", pojemnosc=" + pojemnosc +
                '}';
    }
}

