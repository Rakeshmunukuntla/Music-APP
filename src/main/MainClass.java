package main;

import model.Album;
import model.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args)
    {
        List<Song> songList1=new ArrayList<>();
        Song song1=new Song("chenna mereya","3.25min");
        Song song2=new Song("chemma chekka","4.25min");
        Song song3=new Song("me rajaha","3.55min");

        songList1.add(song1);
        songList1.add(song2);
        songList1.add(song3);

        Album album=new Album("jalsa","DSP",songList1);
        System.out.println(album);

        System.out.println("finding the songs");
        Scanner sc=new Scanner(System.in);
        String titleOfSong=sc.nextLine();
       boolean songPresent= album.fingSongsInAlbum(titleOfSong);
       if(songPresent)
       {
           System.out.println("song "+titleOfSong+"is playing..........");
       }
       else
       {
           System.out.println("song "+titleOfSong+" is not found");
       }

        System.out.println("do you want play previous or next");
        int preOrNext=sc.nextInt();
        if(preOrNext==1)
        {
            playNext(album,titleOfSong);
        }
        else if(preOrNext==-1)
        {
            playPrevious(album,titleOfSong);
        }
        else
        {
            System.out.println("playing the same song");
        }
    }
    public static void playPrevious(Album album,String titleOfSong)
    {
        List<Song> songList=album.getSongsList();
        for(int i=0;i<songList.size();i++)
        {
            if((songList.get(i).getTitle().equals(titleOfSong)))
            {
                System.out.println("playing previous song :"+songList.get(i-1).getTitle());
            }
        }
    }
    public static void playNext(Album album,String titleOfSong)
    {
        List<Song> songList=album.getSongsList();
        for(int i=0;i<songList.size();i++)
        {
            if((songList.get(i).getTitle().equals(titleOfSong)))
            {
                System.out.println("playing previous song :"+songList.get(i+1).getTitle());
            }
        }
    }
}
