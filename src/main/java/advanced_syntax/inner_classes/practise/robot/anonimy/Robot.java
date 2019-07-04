package advanced_syntax.inner_classes.practise.robot.anonimy;

public class Robot {
    static String imie = "IRK5";
    Akumulator akumulator = new Akumulator(10);

    public void podajDaneRobota() {
        System.out.println(imie);

    }
    class Akumulator {
        public int naladowanie;

        public Akumulator(int naladowanie) {
            this.naladowanie = naladowanie;
        }

        void podajDane() {
            System.out.println(naladowanie);
            System.out.println("Jest czescia: " + imie);
        }

    }
}
