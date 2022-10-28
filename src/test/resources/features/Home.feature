Feature: Se crea un escenario

  @Home
  Scenario Outline: El usuario crea un escenario
      Given el usuario esta logeado
      When El usuario hace click en el boton +
      And  El usuario hace click en el boton de entrada de fecha
      And el usuario ingresa el inicio <horaDeInicio> del trabajo
      And el usuario hace click en el boton End
      And el usuario ingresa el fin <horaDeFin> del trabajo
  Examples:
    |horaDeInicio||horaDeFin|
    |        15        ||      22       |
