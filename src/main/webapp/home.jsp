<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" type="text/css" href="./css/main.css" />
  <link rel="stylesheet" type="text/css" href="./css/home.css" />
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous" />
  <title>Mapfin</title>
</head>

<body>
  <div class="offcanvas offcanvas-start w-25" tabindex="-1" id="offcanvas" data-bs-keyboard="false"
    data-bs-backdrop="false">
    <div class="offcanvas-header">
      <h6 class="offcanvas-title d-none d-sm-block" id="offcanvas">Menu</h6>
      <button type="button" class="btn-close text-reset" data-bs-dismiss="offcanvas" aria-label="Close"></button>
    </div>
    <div class="offcanvas-body px-0">
      <ul class="nav nav-pills flex-column mb-sm-auto mb-0 align-items-start" id="menu">
        <li class="nav-item">
          <a href="#" class="nav-link text-truncate">
            <i class="fs-5"><img src="./assets/house.svg" alt="icone home"></i><span
              class="ms-1 d-none d-sm-inline">Home</span>
          </a>
        </li>
        <li>
          <a href="#submenu1" data-bs-toggle="collapse" class="nav-link text-truncate">
            <i class="fs-5"><img src="./assets/graph-up-arrow.svg" alt="icone dashboard"></i><span
              class="ms-1 d-none d-sm-inline">Dashboard</span> </a>
        </li>
        <li>
          <a href="#" class="nav-link text-truncate">
            <i class="fs-5"><img src="./assets/gear.svg" alt="icone engrenagem"></i><span
              class="ms-1 d-none d-sm-inline">Configurações</span>
          </a>
        </li>
      </ul>
    </div>
  </div>
    <header>
      <button class="btn float-start" data-bs-toggle="offcanvas" data-bs-target="#offcanvas" role="button">
        <i class="fs-3" data-bs-toggle="offcanvas" data-bs-target="#offcanvas">
          <img src="./assets/menu.svg" alt="icone menu">
        </i>
      </button>
      <div class="logo">
        <img src="./assets/LogoMapFin-blue.svg" alt="Logo MapFin">
      </div>
    </header>
    <main>
      <div class="total">
        <p class="total__title">Saldo atual em conta</p>
        <h3 class="total__currency">R$ <span class="total__amount">3.340,67</span></h3>
      </div>
      <div class="content">
        <div class="actions">
            <div class="actions__tab">
              <span>Despesas</span>
              <span>Receitas</span>
            </div>
            <div class="actions__month-selector">
              <img src="./assets/menu-left.svg" alt="seta esquerda">
              <p>Janeiro</p>
              <img src="./assets/menu-right.svg" alt="seta direita">
            </div>
        </div>
        <span>${ request.getAttribute("cliente"); }</span>
        <div class="graph">
          <img src="./assets/chart.svg" class="pie-chart" alt="Grafico de gastos">
        </div>
        <div class="detailed-list">
          <div class="detailed-list__item">
            <div class="detailed-list__type">
              <div class="detailed-list__icon icon--blue">
                <img src="./assets/home.svg" alt="icone casa">
              </div>
              <p class="detailed-list__title">Casa</p>
            </div>
            <p class="detailed-list__total">R$ 2.360,20</p>
          </div>
          <div class="detailed-list__item">
            <div class="detailed-list__type">
              <div class="detailed-list__icon icon--purple">
                <img src="./assets/airplane.svg" alt="icone avião">
              </div>
              <p class="detailed-list__title">Viagem</p>
            </div>
            <p class="detailed-list__total">R$ 1.150,26</p>
          </div>
          <div class="detailed-list__item">
            <div class="detailed-list__type">
              <div class="detailed-list__icon icon--aqua">
                <img src="./assets/school.svg" alt="icone capelo">
              </div>
              <p class="detailed-list__title">Educação</p>
            </div>
            <p class="detailed-list__total">R$ 890,50</p>
          </div>
          <div class="detailed-list__item">
            <div class="detailed-list__type">
              <div class="detailed-list__icon icon--red">
                <img src="./assets/food-drumstick.svg" alt="icone comida">
              </div>
              <p class="detailed-list__title">Alimentação</p>
            </div>
            <p class="detailed-list__total">R$ 1.563,28</p>
          </div>
        </div>
      </div>
    </main>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
  integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

</html>