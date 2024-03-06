package com.example.dome;

public class Item {
    private String title;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    public Item(String title, int playingTime, boolean gotIt) {
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
}
