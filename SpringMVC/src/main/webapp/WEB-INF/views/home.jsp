<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<form>
<input type="submit" name="Login" value="Login" formaction="login"  method="get">
<input type="submit" name="Sign Up" value="SignUp" formaction="signup"  method="get">
</form>
</body>
</html>
