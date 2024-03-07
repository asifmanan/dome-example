package com.example.dome;

/**
 * The DVD class represents a DVD object. Information about the
 * DVD is stored and can be retrieved. We assume that we only deal
 * with movie DVDs at this stage.
 *
 */
public class DVD extends Item
{
//  Director is Unique to DVD
    private String director;
    private int playingTime; // playing time of the main feature

    /**
     * Constructor for objects of class DVD
     * @param title The title of this DVD.
     * @param theDirector The director of this DVD.
     * @param playingTime The running time of the main feature.
     */
    public DVD(String title, String theDirector, int playingTime)
    {
        super(title, playingTime);
        director = theDirector;
    }

    /**
     * @return the director
     */
//  Unique Method
    public String getDirector()
    {
        return director;
    }

    /**
     * sets a new director
     * @param dir the new director
     */
//  Unique Method
    public void setDirector(String dir)
    {
        director = dir;
    }

    /**
     * Print details about this DVD to the text terminal.
     */
    public void print()
    {
        System.out.print("DVD: " + title + " (" + playingTime + " mins)");
        if(super.getOwn())
        {
            System.out.println("*");
        }
        else
        {
            System.out.println();
        }
        System.out.println("    " + director);
        System.out.println("    " + getComment());
    }
}
