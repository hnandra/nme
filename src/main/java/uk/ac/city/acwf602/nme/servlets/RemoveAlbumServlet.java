/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.city.acwf602.nme.servlets;

import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uk.ac.city.acwf602.nme.dao.NmeRepository;
import uk.ac.city.acwf602.nme.domain.Album;

/**
 *
 * @author Harmeet
 */
@WebServlet("/removeAlbum.html")
public class RemoveAlbumServlet extends HttpServlet{
   
    private NmeRepository nr;
    @Inject
    public RemoveAlbumServlet(NmeRepository nr){
        this.nr = nr;
    }
   
    public void doGet(HttpServletRequest request,
                HttpServletResponse response)
            throws IOException, ServletException{
       
        int albumId = Integer.parseInt(request.getParameter("albumId"));
        nr.removeAlbum(albumId);
        List<Album> albums = nr.findAllAlbums();
        request.setAttribute("albums", albums);
       
        ServletContext servletContext = getServletContext();
            RequestDispatcher requestDispatcher =
                    servletContext.getRequestDispatcher("/removedAlbum.jsp");
            requestDispatcher.forward(request, response);
           
    }
}