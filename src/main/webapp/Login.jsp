<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" type="text/css" href="./css/main.css" />
    <link rel="stylesheet" type="text/css" href="./css/login.css" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
    <title>Mapfin</title>
  </head>
  <body>
    <div class="container-fluid">
      <header class="container header">
        <img src="./assets/LogoMapFin-white.svg" alt="Logo MapFin">
      </header>
    </div>
    <div class="container-fluid content">
      <div class="content__google">
        <div class="google-btn">
          <img src="./assets/googleLogo.svg" class="img-fluid" alt="Logo do google">
          <button class="btn btn--white">Continuar com Google</button>
        </div>
      </div>
      <div class="separator">ou</div>
        <form class="login-form" action="Login" method="post">
          <div class="user mb-3">
            <img src="./assets/account.svg" alt="icone de usuÃ¡rio">
            <input
              type="email"
              class="form-control"
              id="emailInput"
              name="email" 
              placeholder="Usuário"
            />
          </div>
          <div class="password mb-3">
            <img src="./assets/lock-outline.svg" alt="icone de cadeado">
            <input
              type="password"
              class="form-control"
              id="passwordInput"
              name="password"
              placeholder="Senha"
            />
          </div>
          <button class="btn btn-primary btn-login" type="submit">
            Login
          </button>
          <div class="alert alert-danger" role="alert" style="margin-top: 10px;">
		  	${erro}
		</div>
        </form>
      </div>
    </div>
  </body>
  <script
    src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
    crossorigin="anonymous"
  ></script>
</html>