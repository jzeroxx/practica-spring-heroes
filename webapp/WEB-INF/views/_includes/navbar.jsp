<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/resources" var="urlPublic"></spring:url>
<spring:url value="/" var="urlRoot" />

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">
    <img src="${urlPublic}/assets/img/A-64.png" width="30" height="30" alt="">
  </a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="${urlRoot}">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="${urlRoot}heroes">Heroes</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="${urlRoot}about">About</a>
      </li>

    </ul>
    <div class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Buscar" aria-label="Search">
      <button class="btn btn-outline-primary my-2 my-sm-0" type="button">Buscar</button>
    </div>
  </div>
</nav>
