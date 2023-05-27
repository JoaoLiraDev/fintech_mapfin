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
<link rel="stylesheet" type="text/css" href="./css/movimentacao.css" />
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
		<div class="wrapper">
			<form class="wrapper__form" action="Movimentacoes" method="post">
				<c:set var="type" value="${param.type}" />
				<input type="hidden" value="${type}" name="type">
				<div class="mb-3">
					<img src="./assets/calculator.svg" alt="icone de calculadora">
					<input type="number" min="0.00" max="10000.00" step="0.01"
						class="form-control" name="valor_mov">
				</div>
				<div class="mb-3">
					<img src="./assets/categoria.svg" alt="icone de categoria"> <select
						class="form-select" name="categoria">
						<option selected>Selecione uma opção</option>
						<c:forEach var="n" items="${applicationScope.categ}">
							<option value="${n.getID_CATEGORIA()}">${n.getNM_CATEGORIA()}</option>
						</c:forEach>
					</select>
				</div>
				<div class="mb-3">
					<img src="./assets/calendar-blank.svg"> <input type="date"
						class="form-control" name="dt_vigencia" placeholder="Vigência">
				</div>
				<div class="mb-3">
					<img src="./assets/text-box-multiple-outline.svg"> <input
						type="text" class="form-control" name="descricao"
						placeholder="Descrição">
				</div>
				<div class="submit-btn">
					<button type="submit">
						<img src="./assets/plus.svg">
					</button>
				</div>
			</form>
		</div>
	</main>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
	crossorigin="anonymous"></script>

</html>