
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<html>
<body>
	<a href="<%=basePath%>checkemp">hello</a>
	
</body>
</html>
