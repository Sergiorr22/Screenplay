@login @E2E
Feature: Login

  Scenario: Ingreso con usuario correcto
    Given ingreso al ambiente "https://www.saucedemo.com/v1/index.html"
    When ingreso usuario "standard_user" y contraseña "secret_sauce" correcto
    Then permite ingresar