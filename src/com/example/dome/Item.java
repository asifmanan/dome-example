package com.example.dome;

public class Item {
    protected String title;
    protected int playingTime;
    private boolean gotIt;
    private String comment;

    /**
     * Initialize the Item.
     * @param title The title of the Item.
     * @param playingTime The artist of the Item.
     */
    public Item(String title, int playingTime) {
        this.title = title;
        this.playingTime = playingTime;
        this.gotIt = false;
        this.comment = "<no comment>";
    }

    /**
     * @return The comment for this Item.
     */
    public String getComment() {
        return comment;
    }

    /**
     * Enter a comment for this Item.
     * @param comment The comment to be entered.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return true if we own a copy of this Item.
     */
    public boolean getOwn() {
        return gotIt;
    }

    /**
     * Set the flag indicating whether we own this Item.
     * @param gotIt true if we own the Item, false otherwise.
     */
    public void setOwn(boolean gotIt) {
        this.gotIt = gotIt;
    }

//  $A more robust and user-friendly way of implementing the setOwn()
//  function would be to just set gotIt = true;
    public void setOwn() {
        this.gotIt = true;
    }

    public void unSetOwn() {
        this.gotIt = false;
    }
}
