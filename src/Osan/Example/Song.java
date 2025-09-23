package Osan.Example;

public class Song {
    String title, artist,country;
    int year;

    public Song(){
        title = "";
        artist = "";
        country = "";
        year = 0;
    }
    public Song(String title, String artist, String country, int year){
        this.title = title;
        this.artist = artist;
        this.country = country;
        this.year = year;

    }

    public static void main(String[] args) {
        Song mySong = new Song("뜨거운 여름밤은 가고","잔나비","한국",2022);
        System.out.println(mySong.year +" 년 " + mySong.country +" 국적의 " + mySong.artist +" 가부른 " + mySong.title);
    }

}
