package com.mark;

/**
 * This Class is a subclass of the Insect Class.
 */
public class Butterfly extends Insect {
    // Defines unique Class variables.
    protected String wingColor;
    protected String favoriteFlower;

    // Getters and Setters.
    public String getWingColor() {
        return wingColor;
    }
    public void setWingColor(String wingColor) {
        this.wingColor = wingColor;
    }
    public String getFavoriteFlower() {
        return favoriteFlower;
    }
    public void setFavoriteFlower(String favoriteFlower) {
        this.favoriteFlower = favoriteFlower;
    }

    // Constructor.
    public Butterfly(String name, int numberOfWings, String wingColor, String favoriteFlower) {
        super(name, numberOfWings);
        this.wingColor = wingColor;
        this.favoriteFlower = favoriteFlower;
    }

    // Custom print method.
    public void printSpeciesData() {
        System.out.println("Insect = Butterfly, \nName = " + getName() + ", \nNumber of Legs = " + getLegs() +
                "\nNumber of Wings = " +
                getNumberOFWings() + ", \nWing Color = " + wingColor + ", \nFavorite Flower = " +
                favoriteFlower);
    }
}
