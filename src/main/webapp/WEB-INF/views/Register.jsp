<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
	<td>
		                  <h3>Email New Message</h3>
<form:form action="get" method="POST" modelAttribute="email" enctype="multipart/form-data">
<pre>

    TO	 <form:input path="to"/>							Cc <form:input path="cc"/>		
		        			
  Suject  <form:input path="subject"/> 				Bcc <form:input path="bcc"/>
                	
   Text  <form:input path="text"/>

   File   <input type="file" name="fob"/>
   
           <input type="submit" value="Send"/>
</pre>
</form:form>
</td>
 </tr>
   
</table>
 ${msg}
</body>
</html>

</body>
</html>