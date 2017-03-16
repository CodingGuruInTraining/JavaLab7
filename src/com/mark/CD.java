package com.mark;

/**
 * Created by hl4350hb on 3/15/2017.
 */
public class CD extends Album{

    public CD(String artist, String title, double price) {
        super(artist, title, price);
    }

    @Override
    public String toString() {
        return "Format = CD, Artist = " + artist + ", Title = " + title + ", Price $" + price;
    }
}
