#language: en
  Feature: busqueda desde el home de mercado libre
    Scenario: busqueda de cinco productos al azar
      Given que estoy en el home de mercado libre
      When selecciono un producto de la categoria
      Then valido que corresponda el nombre del producto y regreso a la pagina principal