
Feature: Herokuapp Excell Login
  @excell
  Scenario: TC01_Positive_Login_Testi
    Given "herokuapp" sitesine gidilir
    And    kullanici exceldeki "pozitive" sayfasindaki kullanici bilgileri ile login olur
    Then   kullanici login oldugunu dogrular



  @excell1
  Scenario: TC02_Negative_Login_Testi
    Given "herokuapp" sitesine gidilir
    Then  kullanici exceldeki "negative" sayfasindaki kullanici bilgileri ile login olamadigini dogrular