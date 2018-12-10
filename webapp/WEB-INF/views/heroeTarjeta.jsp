<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<spring:url value="/resources" var="urlPublic"></spring:url>

<div class="card-columns">

	<c:forEach var="heroe" items="${lista}">
	
		<div class="card animated fadeIn fast">

			<img class="card-img-top" src="${urlPublic}/${heroe.img}"
				alt="spiderman">
			<div class="card-body">
				<h5 class="card-title">${heroe.nombre}</h5>
				<p class="card-text">${heroe.bio}</p>
				<p class="card-text">
					<small class="text-muted">${heroe.aparicion}</small>
				</p>

				<button type="button" class="btn btn-outline-primary btn-block">
					Ver más</button>

				<!-- <a [routerLink]="['/heroe',i]" class="btn btn-outline-primary">Ver más</a>
    -->
			</div>
		</div>

	</c:forEach>

</div>