<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This my first page in JSP</title>
<spring:url value="/resources" var="urlPublic"></spring:url>

<link href="${urlPublic}/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${urlPublic}/css/style.css" rel="stylesheet">

</head>
<body>

	<jsp:include page="_includes/navbar.jsp"></jsp:include>
	<div class="container main-container">
		<h1 class="animated fadeIn fast">Lista de Heroes</h1>
	</div>

	<div class="container main-container">

		<jsp:include page="heroeTarjeta.jsp"></jsp:include>

	</div>




	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="${urlPublic}/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>