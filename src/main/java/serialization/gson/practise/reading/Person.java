package serialization.gson.practise.reading;

import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private String[] slowa = new String[]{"sdfs", "sdfsdfsdf", "sdfsdfsdfsdfsdfsdfsdf"};

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", slowa=" + Arrays.toString(slowa) +
                '}';
    }
}
