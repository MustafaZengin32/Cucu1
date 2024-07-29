@paralelTest01
Feature: Paralel Test
  Scenario: Paralel Test 01
    Given "pazarama" sitesine gidilir
    When search box ina "jenga" yazılır
    Then goruntulenen sonuclarda "jenga" yazdigi dogrulanir

#surefire-plugin
  #failsafe-plugin kurulur
  #birden fazla runner kur
  #mvn clean verify ile calistir