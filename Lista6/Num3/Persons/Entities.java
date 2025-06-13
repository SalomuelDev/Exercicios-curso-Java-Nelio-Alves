package Persons;

public class Entities {
    private String Name;
    private int Years;
    private double Height;

    public Entities(String name, int years, double height) {
        Name = name;
        Years = years;
        Height = height;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getYears() {
        return Years;
    }

    public void setYears(int years) {
        Years = years;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }
}