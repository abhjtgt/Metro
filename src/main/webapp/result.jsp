<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>
    Metro cities
</h1>
<%
List result= (List) request.getAttribute("cities");
Iterator it = result.iterator();
out.println("<br>We have <br><br>");
while(it.hasNext()){
out.println(it.next()+"<br>");
}
%>
<br>
<a href="http://localhost:8080/Metro/">HOME</a>

</body>
</html>
