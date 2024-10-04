package model;

import java.util.List;

public class Album
{
    private String albymName;
    private String artistName;
    private List<Song> songsList;

    public Album(String albymName, String artistName, List<Song> songsList)
    {
        this.albymName = albymName;
        this.artistName = artistName;
        this.songsList = songsList;
    }

    public String getAlbymName() {
        return albymName;
    }

    public void setAlbymName(String albymName) {
        this.albymName = albymName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public List<Song> getSongsList() {
        return songsList;
    }

    public void setSongsList(List<Song> songsList) {
        this.songsList = songsList;
    }

    @Override
    public String toString()
    {
        return "Album{" +
                "albymName='" + albymName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", songsList=" + songsList +
                '}';
    }

    public boolean fingSongsInAlbum(String title)
    {
        for(Song song:songsList)
        {
            if(song.getTitle().equals(title))
            {
                return  true;
            }
        }
        return false;
    }
    public String addSongsIntoAlbum(Song song)
    {
        boolean songAlreadyPresent =fingSongsInAlbum(song.getTitle());
        if(songAlreadyPresent)
        {
            return "song already present";
        }
        else
        {
            songsList.add(song);
            return "song added to the ablum";
        }

    }

}
