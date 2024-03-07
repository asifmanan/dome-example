package com.example.dome;

public class Item {
    private String title;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    public Item(String title, int playingTime) {
        this.title = title;
        this.playingTime = playingTime;
        this.gotIt = false;
        this.comment = "<no comment>";
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    public boolean getOwn() {
        return gotIt;
    }

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
