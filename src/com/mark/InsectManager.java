package com.mark;

import java.util.LinkedList;

/**
 * This program creates multiple Insect objects and then displays
 * their information.
 */
public class InsectManager {
    public static void main(String[] args) {
        // Creates two Butterfly objects.
        Butterfly monarch = new Butterfly("Monarch butterfly", 4, "orange and black", "milkweed");
        Butterfly swallowtail = new Butterfly("Common Yellow Swallowtail butterfly", 4, "yellow and black", "milk parsley");

        // Creates two Bee objects.
        Bee honeyBee = new Bee("Honey bee", 4, "yellow and black", "Jasmine", true);
        Bee bumbleBee = new Bee("Bumble bee", 4, "yellow, black, and white", "clover", false);

        // Creates LinkedList object and adds all
        // Insect objects created above to it.
        LinkedList<Insect> insects = new LinkedList<>();
        insects.add(monarch);
        insects.add(swallowtail);
        insects.add(honeyBee);
        insects.add(bumbleBee);

        // Loops through LinkedList and calls their own
        // print method.
        for (Insect i : insects) {
            i.printSpeciesData();
        }
    }
}
