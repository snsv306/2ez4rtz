package com.example.thinkpad.ez300k;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by ThinkPad on 31.10.2015.
 */
public class Song {
    private long id;
    private String songName;
    private String authorName;
    private String audioURL;
    private String imageURL;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Song getSong() {
        return this;
    }

    public void setSong(String name,String author,String auURL,String imURL) {
        this.songName = name;
        this.authorName = author;
        this.audioURL = auURL;
        this.imageURL = imURL;
    }

    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString(){
       StringBuilder str = new StringBuilder();
        str.append("songName : " + songName);
        str.append("songAuthor : " + authorName);
        str.append("audioURL : " + audioURL);
        str.append("imageURL : " + imageURL);
        return str.toString();
    }
}