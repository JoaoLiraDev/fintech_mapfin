<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" type="text/css" href="./css/main.css" />
<link rel="stylesheet" type="text/css" href="./css/home.css" />
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
		<div class="total">
			<p class="total__title">Saldo atual em conta</p>
			<h3 class="total__currency">
				<span class="total__amount"><fmt:formatNumber
						value="${conta.getSALDO()}" type="currency" /></span>
			</h3>
		</div>
		<div class="content">
			<div class="actions">
				<div class="actions__tab">
					<a href="movimentacao.jsp?type=Despesa"> <span>Despesas</span>
					</a> <a href="movimentacao.jsp?type=Receita"> <span>Receitas</span>
					</a>
				</div>
			</div>
			<div class="detailed-list">
				<c:forEach var="n" items="${movs}">
					<div class="detailed-list__item" id="${n.getID_MOV()}">
						<div class="detailed-list__type">
							<div class="detailed-list__icon icon--red">
								<img src="./assets/money_bag_savings_cash_icon.svg"
									alt="icone comida">
							</div>
							<p class="detailed-list__title">${n.getDS_DESCRICAO()}
								-
								<fmt:formatDate pattern="dd/MM/yyyy"
									value="${n.getDT_VIGENCIA()}" />
							</p>
						</div>
						<p class="detailed-list__total">
							<fmt:formatNumber value="${n.getVL_MOVIMENTACAO()}"
								type="currency" />
						</p>
					</div>
				</c:forEach>
			</div>
		</div>
	</main>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
	crossorigin="anonymous"></script>

</html>