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
    <link rel="stylesheet" type="text/css" href="./css/register.css" />
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
    <c:if test="${not empty erro }">	
    	<div class="alert alert-danger" role="alert" style="margin-top: 10px;">
  			${erro}
		</div>
   </c:if>
    <div class="container-fluid content">
    	<h3>Novo Cadastro</h3>
        <form class="login-form" action="Register" method="post">
          <div class="row">
          	<div class="col-md-4">
			  <input type="text" class="form-control" name="NM_CLIENTE" id="NM_CLIENTE" placeholder="Nome Completo">
			        	</div>
          	<div class="col-md-4">
			  <input type="date" class="form-control" id="DT_NASCIMENTO" name="DT_NASCIMENTO">
			  
			</div>
          	<div class="col-md-4">
         		  <input type="tel" class="form-control" id="NR_TELEFONE" name="NR_TELEFONE" placeholder="(11) 94668-4131">
			</div>
          </div>
          <div class="row">
          	<div class="col-md-6">
			  <input type="email" class="form-control" id="DS_EMAIL" name="DS_EMAIL" placeholder="name@example.com">
			        	</div>
          	<div class="col-md-6">
			  <input type="password" class="form-control" id="DS_PASSWORD" name="DS_PASSWORD" placeholder="Senha">
			       	</div>  
          </div>
          <div class="row">
          	<div class="col-md-3">
			    <input type="text" class="form-control" name="CEP" id="CEP" placeholder="CEP">
			</div>
			<div class="col-md-3">
			    <input type="text" class="form-control" name="CIDADE" id="CIDADE" placeholder="Cidade">
			</div>
			<div class="col-md-3">
			    <input type="text" class="form-control" name="ESTADO" id="ESTADO" placeholder="Estado">
			</div>
			<div class="col-md-3">
			    <input type="text" class="form-control" name="BAIRRO" id="BAIRRO" placeholder="Bairro">
			</div>
          </div>
          <div class="row">
          	<div class="col-md-3">
			    <input type="text" class="form-control" name="NUMERO" id="NUMERO" placeholder="Número">
			</div>
			<div class="col-md-3">
			    <input type="text" class="form-control" name="REFERENCIA" id="REFERENCIA" placeholder="Referência">
			</div>
			<div class="col-md-3">
			    <input type="text" class="form-control" name="COMPLEMENTO" id="COMPLEMENTO" placeholder="Complemento">
			</div>
          </div>
          <button class="btn btn-primary btn-login" type="submit">
            Criar conta
          </button>
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