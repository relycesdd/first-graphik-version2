package model;

public class Cat implements SpeakBehavior {
    private String name;

    public Cat(String Name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
@Override
    public String speak() {
        return "мяу";
    }
}
