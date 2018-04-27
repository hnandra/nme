<%-- 
    Document   : artistCount
    Created on : 16-Mar-2018, 12:21:41
    Author     : Harmeet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" />
    <body>
        <h1>Artist Count</h1>
        <p>NME has 
            <%
                int artistCount = (Integer) request.getAttribute("artistCount");
                out.println(artistCount + " artists.");
            %>
        </p>
    </body>
    <jsp:include page="footer.jsp" />
</html>

