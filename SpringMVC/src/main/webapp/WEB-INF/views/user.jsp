<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Home Page</title>
</head>
<body>



<c:choose>
    <c:when test="${param.userText=='signup'}">
       <h3>Great!  </h3>
<h3> ${param.userName} user created</h3>

        <br />
    </c:when>    
   <c:when test="${param.userText=='login'}">
       <h3>Welcome Back!  </h3>
<h3>Hi ${param.userName}! </h3>

        <br />
    </c:when>    
</c:choose>

</body>
</html>