package com.example.dome;

public class CD extends Item {

    private String artist; //  artist is unique to CD
    private int numberOfTracks; //  numberOfTracks is only on CD class

    /**
     * Initialize the CD.
     * @param theTitle The title of the CD.
     * @param theArtist The artist of the CD.
     * @param tracks The number of tracks on the CD.
     * @param time The playing time of the CD.
     */
    public CD(String theTitle, String theArtist, int tracks, int time)
    {
//  To set fields on the super class, constructed be called
//  or set() methods, which is the best approach?
        super(theTitle, time);
        artist = theArtist;
        numberOfTracks = tracks;
        super.setOwn(false);
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
     * @artist the new artist
     */
//  Unique method
    public void setArtist(String artist)
    {
        this.artist = artist;
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
     * @param tracks number of tracks
     */
//  Unique Method
    public void setTracks(int tracks)
    {
        numberOfTracks = tracks;
    }


    /**
     * Print details about this CD to the text terminal.
     */
    public void print()
    {
        System.out.print("CD: " + title + " (" + playingTime + " mins)");
        if(super.getOwn())
        {
            System.out.println("*");
        }
        else
        {
            System.out.println();
        }
        System.out.println("    " + artist);
        System.out.println("    tracks: " + numberOfTracks);
        System.out.println("    " + getComment());
    }


}
