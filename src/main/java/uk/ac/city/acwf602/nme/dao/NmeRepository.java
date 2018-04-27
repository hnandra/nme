/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.acwf602.nme.dao;

import java.util.List;
import uk.ac.city.acwf602.nme.domain.Album;
import uk.ac.city.acwf602.nme.domain.Artist;
import uk.ac.city.acwf602.nme.domain.Track;

/**
 *
 * @author Harmeet
 */
public interface NmeRepository {
    List<Artist> findAllArtists();
    List<Track> findAllTracks();
    List<Album> findAllAlbums();
    List<Track> findTracksOnAlbum(int albumId);
    int artistCount();
    void addArtist(int artistId, String artistName, String genre, int sales);
    void removeAlbum(int albumId); 
}
