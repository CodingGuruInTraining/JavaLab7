package com.mark;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by hl4350hb on 3/15/2017.
 */
public class RecordStore {

    static Scanner stringScanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<CD> cdInventory = new ArrayList<CD>();
        CD testCD1 = new CD("Beyonce", "Lemonade", 9.99);
        CD testCD2 = new CD("Bob Dylan", "Basement Tapes", 6.99);

        cdInventory.add(testCD1);
        cdInventory.add(testCD2);

        ArrayList<LP> lpInventory = new ArrayList<LP>();
        LP testLP1 = new LP("Michael Jackson", "Thriller", 4, 9.99);
        LP testLP2 = new LP("Replacements", "Hootenanny", 3, 7.99);

        lpInventory.add(testLP1);
        lpInventory.add(testLP2);

        System.out.println("All LPs in the inventory:");
        for (LP lp : lpInventory) {
            System.out.println(lp);
        }

        System.out.println("All CDs in the inventory:");
        for (CD cd : cdInventory) {
            System.out.println(cd);
        }

        ArrayList<Album> allInventory = new ArrayList<Album>();
        allInventory.addAll(lpInventory);
        allInventory.addAll(cdInventory);

        System.out.println("Enter artist or title to search for. Works for partial artists/titles.");
        String searchString = stringScanner.nextLine();
        searchForAlbum(allInventory, searchString);
    }

    public static void searchForAlbum(ArrayList<Album> albums, String searchTerm) {
        searchTerm = searchTerm.toLowerCase();
        boolean found = false;
        for (Album a : albums) {
            if (a.getTitle().toLowerCase().contains(searchTerm) || a.getArtist().toLowerCase().contains(searchTerm)) {
                found = true;
                System.out.println(a);
            }
        }
        if (!found) {
            System.out.println("No matching albums found that match " + searchTerm);
        }
    }
}
