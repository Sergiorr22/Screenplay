@login @E2E
Feature: Login

  Scenario: Ingreso con usuario correcto
    Given ingreso al ambiente "https://www.saucedemo.com/v1/index.html"
    When ingreso usuario "standard_user" y contraseña "secret_sauce" correcto
    Then permite ingresar

    @loginerror
  Scenario: Ingreso con usuario incorrecto
    Given ingreso al ambiente "https://www.saucedemo.com/v1/index.html"
    When ingreso usuario "locked_out_user" y contraseña "secret_sauce" correcto
    Then no permite ingresar