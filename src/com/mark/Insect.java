package com.mark;

/**
 * This Class is a SuperClass for insect qualities.
 */
public abstract class Insect {
    // Defines variables.
    private String name;
    private int numberOFWings;
    public final int legs = 6;

    // Getters and Setters.
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumberOFWings() {
        return numberOFWings;
    }
    public void setNumberOFWings(int numberOFWings) {
        this.numberOFWings = numberOFWings;
    }
    public int getLegs() {
        return this.legs;
    }

    // Constructor.
    public Insect(String name, int numberOFWings) {
        this.name = name;
        this.numberOFWings = numberOFWings;
    }

    // Abstract print method.
    public abstract void printSpeciesData();
}
