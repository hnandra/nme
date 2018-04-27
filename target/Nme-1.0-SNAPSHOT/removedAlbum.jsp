<%-- 
    Document   : removedAlbum
    Created on : 16-Mar-2018, 15:23:22
    Author     : Harmeet
--%>

<%@page import="uk.ac.city.acwf602.nme.domain.Album" %>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp"/>
   
   
        <h1>All Albums</h1>
       
        <table>
            <%
           
            List<Album> albums= (List<Album>) request.getAttribute("albums");
           
            for ( Album album: albums){
                out.println("<tr><td>"+album+"</td></tr>");
            }
            %>
        </table>
       
        <jsp:include page="footer.jsp"/>
</html>
