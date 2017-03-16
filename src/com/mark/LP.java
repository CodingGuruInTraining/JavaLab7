package com.mark;

/**
 * Created by hl4350hb on 3/15/2017.
 */
public class LP extends Album{
    private int condition;      // 1 = barely playable, 5 = mint

    public LP(String artist, String title, int condition, double price) {
        super(artist, title, price);
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Format = LP, Artist = " + artist + ", Title = " + title + ", " +
                "Condition = " + condition + ", Price $" + price;
    }
}
