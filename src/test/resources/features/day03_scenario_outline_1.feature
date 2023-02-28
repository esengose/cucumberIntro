@scenario_outline_1
Feature: arama_feature_2

  Background: Google_sayfasina_git
    Given kullanici google gider

    Scenario Outline: arama_testi

      When kullanici "<product>" için arama yapar
      Then sonuclarda "<product>" oldugunu dogrular
      Then close the application

    Examples: data
      | product |
      | iphone  |
      | tesla   |
      | tv      |
      | flower  |
      | cat     |
      | dog     |







  #Scenario-> Scenario Outline
  # "veri" -> "<veri>"
  # Example key word, Scenario Outline dan sonra kullanılmalı
  # Example verilerin kullanılacağı yerdir