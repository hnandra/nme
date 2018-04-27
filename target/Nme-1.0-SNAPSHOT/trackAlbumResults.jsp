<%-- 
    Document   : trackAlbumResults
    Created on : 16-Mar-2018, 13:13:27
    Author     : Harmeet
--%>

<%@page import="uk.ac.city.acwf602.nme.domain.Track"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
    <body>
        <h1>Tracks By Album</h1>
        
        <p>Tracks per Album <% out.print((request.getParameter("albumId"))); %></p>
        
        <table>
            
            <%
                List<Track> tracks = (List<Track>) request.getAttribute("tracks");
                
                for (Track track : tracks){
                    out.println("<tr><td>" + tracks + "</tr></td>");
                }
            %>
            
        </table>
    </body>
    <jsp:include page="footer.jsp" />
</html>
