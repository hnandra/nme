<%-- 
    Document   : tracksByAlbum
    Created on : 16-Mar-2018, 12:55:40
    Author     : Harmeet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
    <body>
        <h1>Find Tracks In Album</h1>
        
        <form action="tracksByAlbum.html" method="GET">
            <label>Enter Album ID: <input type="text" name="albumId" <label/>
            <br />
            <input type="submit" value="Find Tracks" />
        </form>
        
    </body>
    <jsp:include page="footer.jsp" />
</html>
