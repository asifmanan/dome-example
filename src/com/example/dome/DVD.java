package com.example.dome;

/**
 * The DVD class represents a DVD object. Information about the
 * DVD is stored and can be retrieved. We assume that we only deal
 * with movie DVDs at this stage.
 *
 */
public class DVD
{
//  $All these attributes are the same as CD, so these can be shared
    private String title;
//  Director is Unique to DVD
    private String director;
    private int playingTime; // playing time of the main feature
    private boolean gotIt;
    private String comment;

    /**
     * Constructor for objects of class DVD
     * @param theTitle The title of this DVD.
     * @param theDirector The director of this DVD.
     * @param time The running time of the main feature.
     */
    public DVD(String theTitle, String theDirector, int time)
    {
        title = theTitle;
        director = theDirector;
        playingTime = time;
        gotIt = false;
        comment = "<no comment>";
    }

    /**
     * Enter a comment for this DVD.
     * @param comment The comment to be entered.
     */
//  Common method
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * @return The comment for this DVD.
     */
//  Common Method
    public String getComment()
    {
        return comment;
    }

    /**
     * Set the flag indicating whether we own this DVD.
     * @param ownIt true if we own the DVD, false otherwise.
     */
//  Common Method
    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }
//  Common Method
    public void setOwn(){
        this.gotIt = true;
    }
//  Common Method
    public void unSetOwn(){
        this.gotIt = false;
    }

    /**
     * @return true if we own a copy of this DVD.
     */
//  Common Method
    public boolean getOwn()
    {
        return gotIt;
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
     * @dir the new director
     */
//  Unique Method
    public void setDirector(String dir)
    {
        director = dir;
    }

    /**
     * Print details about this DVD to the text terminal.
     */
//    public void print()
//    {
//        System.out.print("DVD: " + title + " (" + playingTime + " mins)");
//        if(gotIt)
//        {
//            System.out.println("*");
//        }
//        else
//        {
//            System.out.println();
//        }
//        System.out.println("    " + director);
//        System.out.println("    " + comment);
//    }
}
