/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Abdallah Fawzi
 */
public class Book {

    private String title;
    private int pages, publicatonYear;

    public Book(String title, int pages, int publicatonYear) {
        this.title = title;
        this.pages = pages;
        this.publicatonYear = publicatonYear;
    }

    public String getTitle() {
        return title;
    }

    
    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicatonYear;
    }
}
