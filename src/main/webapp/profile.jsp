<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" type="text/css" href="./css/main.css" />
<link rel="stylesheet" type="text/css" href="./css/home.css" />
<link rel="stylesheet" type="text/css" href="./css/profile.css" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous" />
<title>Mapfin</title>
</head>

<body>
	<%@ include file="./components/menu.jsp"%>
	<main>
		<div class="user-icon">
			<img src="./assets/Defaultuser.png" alt="Default user icon">
		</div>
		<div class="content">
			<form action="Profile" method="post">
			<c:set var="cliente" value="${applicationScope.cliente}" />
				<div class="row">
		          	<div class="col-md-12">
					  <input type="text" class="form-control" value="${cliente.getNM_CLIENTE()}" name="NM_CLIENTE" id="NM_CLIENTE" placeholder="Nome Completo">
		        	</div>
		        </div>
		        <div class="row">
		          	<div class="col-md-12">
					  <input type="date" class="form-control" value="${cliente.getDT_NASCIMENTO()}" id="DT_NASCIMENTO" name="DT_NASCIMENTO">
					  
					</div>
				</div>
				<div class="row">
		          	<div class="col-md-12">
		         		  <input type="tel" class="form-control" value="${cliente.getNR_TELEFONE()}" id="NR_TELEFONE" name="NR_TELEFONE" placeholder="(11) 94668-4131">
					</div>
		         </div>
		         <div class="row">
		          	<div class="col-md-12">
					  <input type="email" class="form-control" value="${cliente.getDS_EMAIL()}" id="DS_EMAIL" name="DS_EMAIL" placeholder="name@example.com">
		        	</div>
		        </div>
		        <div class="row">
		          	<div class="col-md-12">
					  <input type="password" class="form-control" id="DS_PASSWORD" name="DS_PASSWORD" placeholder="Senha">
			       	</div>  
		         </div>
				
				<div class="row">
					<button type="submit" class="btn btn-primary">
						<img src="./assets/account-edit.svg">
						Salvar Alterações
					</button>
				</div>
			</form>
			<c:if test="${not empty success }">	
        	<div class="alert alert-success" role="alert" style="margin-top: 10px;">
			  	${success}
			</div>
		   </c:if>
		   <c:if test="${not empty erro }">	
        	<div class="alert alert-danger" role="alert" style="margin-top: 10px;">
			  	${erro}
			</div>
		   </c:if>
		</div>
	</main>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
	crossorigin="anonymous"></script>

</html>