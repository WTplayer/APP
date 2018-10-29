<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<html>
<head>
<title>Hello World</title>
</head>
<body>
	<h1>
		<bean:write name="TestStrutsActionForm" property="message" />
	</h1>
</body>
</html>