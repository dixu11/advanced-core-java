package advanced_syntax.inner_classes.practise.robot.anonimy;

public class Main2 {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Marcin");
        Person p3 = new Person("Marcin", "Chyla");
        Person p4 = new Person("Marcin", "Chyla",18);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println();

    }
}
