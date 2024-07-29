Feature: Hooks Testi
  Background: Hooks Testi
    Given "trendyol" sitesine gidilir
    And    arama kutusuna "ekose gömlek" yazılır
    Then   arama sonuclarinin goruntulendigi dogrulanir
  @Hooks
  Scenario: Hooks Testi Pozitif
    Then sonuc sayfasinda "ekose gömlek" oldugu dogrulanir
    When sonuc sayfasindaki arama sonuc sayisi alinir
    Then 20 den fazla urunun ekranda goruntulendigi dogrulanir

  Scenario: Hooks Testi Negatif
    Then sonuc sayfasinda "ekose gömlek" oldugu dogrulanir
    When sonuc sayfasindaki arama sonuc sayisi alinir
    Then sonuc sayisindaki kadar urunun ekranda goruntulendigi dogrulanir