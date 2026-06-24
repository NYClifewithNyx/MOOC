/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jae
 */
public class Book {

    private String name;
    private int page;
    private int year;

    public Book(String bookTitle, int bookPage, int bookYear) {

        this.name = bookTitle;
        this.page = bookPage;
        this.year = bookYear;

    }

    public String getName() {

        return this.name;

    }

    public int getPage() {

        return this.page;

    }

    public int getYear() {

        return this.year;

    }
    
    @Override
    public String toString() {
        return this.name + ", " + this.page + " pages, " + this.year;
    }

}
