/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.acwf602.nme.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import uk.ac.city.acwf602.nme.domain.Album;
import uk.ac.city.acwf602.nme.domain.Artist;
import uk.ac.city.acwf602.nme.domain.Track;

/**
 *
 * @author Harmeet
 */
@Stateless
public class NmeRepositoryJpa implements NmeRepository {
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Artist> findAllArtists() {
        TypedQuery<Artist> query = em.createQuery(
                "SELECT a FROM Artist a", Artist.class);
        return query.getResultList();
    }

    @Override
    public List<Track> findAllTracks() {
        TypedQuery<Track> query = em.createQuery(
                "SELECT t FROM Track t", Track.class);
        return query.getResultList();
    }

    @Override
    public List<Album> findAllAlbums() {
        TypedQuery<Album> query = em.createQuery(
                "SELECT al FROM Album al", Album.class);
        return query.getResultList();
    }
    
    @Override
    public List<Track> findTracksOnAlbum(int albumId) {
        TypedQuery<Track> query = em.createQuery(
                "SELECT t FROM Track t JOIN t.album i WHERE i.albumId=:i", Track.class);
        query.setParameter("i", albumId);
        return query.getResultList();
    }

    @Override
    public int artistCount() {
        Query query = em.createQuery(
                "SELECT COUNT(a) FROM Artist a");
        Long result = (long) query.getSingleResult();   
        return result.intValue();
    }

    @Override
    public void addArtist(int artistId, String artistName, String genre, int sales) {
        Artist artist = new Artist();
        artist.setArtistId(artistId);
        artist.setArtistName(artistName);
        artist.setGenre(genre);
        artist.setSales(sales);
        em.persist(artist);
    }

    @Override
    public void removeAlbum(int albumId) {
       Album album = em.find(Album.class, albumId);
       em.remove(album);
    }
    
    
}
