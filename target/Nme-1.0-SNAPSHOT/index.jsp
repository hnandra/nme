<%-- 
    Document   : index
    Created on : 16-Mar-2018, 11:38:18
    Author     : Harmeet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
    <body>
        <h1>Links</h1>
        <p><a href="albumList.html">All albums</a></p>
        <p><a href="artistCount.html">Album Count</a></p>
        <p><a href="tracksByAlbum.jsp">Find Tracks in Album</a></p>
        <p><a href="addArtist.jsp">Add Artist</a></p>
        <p><a href="removeAlbum.jsp">Remove Album</a></p>
    </body>
    <jsp:include page="footer.jsp" />
</html>
