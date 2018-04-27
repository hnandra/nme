<%-- 
    Document   : albumList
    Created on : 16-Mar-2018, 12:07:52
    Author     : Harmeet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="uk.ac.city.acwf602.nme.domain.Album" %>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
    <body>
        <h1>All Albums</h1>
        
        <table>
            
            <%
                List<Album> albums = (List<Album>) request.getAttribute("albums");
                
                for (Album album : albums){
                    out.println("<tr><td>" + album + "</tr></td>");
                }
            %>
            
        </table>
        
    </body>
    <jsp:include page="footer.jsp" />
</html>
