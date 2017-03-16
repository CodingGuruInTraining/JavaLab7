package com.mark;

/**
 * This Class is a subclass of the Insect Class.
 */
public class Bee extends Insect{
    // Defines unique Class variables.
    protected String bodyColor;
    protected String favoriteFlower;
    protected boolean makesHoney;

    // Constructor.
    public Bee(String name, int numberOFWings, String bodyColor, String favoriteFlower, boolean makesHoney) {
        super(name, numberOFWings);
        this.bodyColor = bodyColor;
        this.favoriteFlower = favoriteFlower;
        this.makesHoney = makesHoney;
    }

    // Custom print method.
    public void printSpeciesData() {
        System.out.println("Insect = Butterfly, \nName = " + getName() + ", \nNumber of Legs = " + getLegs() +
                "\nNumber of Wings = " + getNumberOFWings() + ", \nBody Color = " + bodyColor +
                ", \nFavorite Flower = " + favoriteFlower);
        // Prints certain message depending on boolean state.
        if (makesHoney) {
            System.out.println("This bee does make honey");
        }
        else {
            System.out.println("This bee does not make honey");
        }
    }
}
