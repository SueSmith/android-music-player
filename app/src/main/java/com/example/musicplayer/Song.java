package com.example.musicplayer;

/*
 * This is demo code to accompany the Mobiletuts+ series:
 * Android SDK: Creating a Music Player
 * 
 * Sue Smith - February 2014
 */

public class Song {
	
	private long id;
	private String title;
	private String artist;
	
	public Song(long songID, String songTitle, String songArtist){
		id=songID;
		title=songTitle;
		artist=songArtist;
	}
	
	public long getID(){return id;}
	public String getTitle(){return title;}
	public String getArtist(){return artist;}

}
