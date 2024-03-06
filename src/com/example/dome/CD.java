package com.example.dome;

public class CD {

    private String title;
    private String artist; //  artist is unique to CD

    private int numberOfTracks; //  numberOfTracks is only on CD class
    private int playingTime;
    private boolean gotIt;
    private String comment;

    /**
     * Initialize the CD.
     * @param theTitle The title of the CD.
     * @param theArtist The artist of the CD.
     * @param tracks The number of tracks on the CD.
     * @param time The playing time of the CD.
     */
    public CD(String theTitle, String theArtist, int tracks, int time)
    {
        title = theTitle;
        artist = theArtist;
        numberOfTracks = tracks;
        playingTime = time;
        gotIt = false;
        comment = "<no comment>";
    }

    /**
     * Enter a comment for this CD.
     * @param comment The comment to be entered.
     */
//  Common Method
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * @return The comment for this CD.
     */
//  Common Method
    public String getComment()
    {
        return comment;
    }

    /**
     * Set the flag indicating whether we own this CD.
     * @param ownIt true if we own the CD, false otherwise.
     */

//  $A more robust and user-friendly way of implementing the setOwn()
//  function would be to just set gotIt = true;

//  Common method
    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }
//  Common method
    public void setOwn(){
        this.gotIt = true;
    }
//  Common method
    public void unSetOwn(){
        this.gotIt = false;
    }

    /**
     * @return true if we own a copy of this CD.
     */
//  Common method
    public boolean getOwn()
    {
        return gotIt;
    }

    /**
     * @return the artist
     */
//  Unique method
    public String getArtist()
    {
        return artist;
    }

    /**
     * sets a new artist
     * @dir the new artist
     */
//  Unique method
    public void setArtist(String dir)
    {
        artist = dir;
    }

    /**
     * @return the number of tracks
     */
//  Unique Method
    public int getTracks()
    {
        return numberOfTracks;
    }

    /**
     * sets number of tracks
     * @trks number of tracks
     */
//  Unique Method
    public void setTracks(int trks)
    {
        numberOfTracks = trks;
    }


    /**
     * Print details about this CD to the text terminal.
     */
//    public void print()
//    {
//        System.out.print("CD: " + title + " (" + playingTime + " mins)");
//        if(gotIt)
//        {
//            System.out.println("*");
//        }
//        else
//        {
//            System.out.println();
//        }
//        System.out.println("    " + artist);
//        System.out.println("    tracks: " + numberOfTracks);
//        System.out.println("    " + comment);
//    }


}
