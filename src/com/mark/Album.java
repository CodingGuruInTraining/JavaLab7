package com.mark;

/**
 * Created by hl4350hb on 3/15/2017.
 */
public class Album {
    protected String artist;
    protected String title;
    protected double price;

    public Album(String artist, String title, double price) {
        this.artist = artist;
        this.title = title;
        this.price = price;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
