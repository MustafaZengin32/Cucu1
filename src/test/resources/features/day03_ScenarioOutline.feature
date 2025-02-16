
Feature: Negatif Uyelik
  @boyner
  Scenario Outline: Negatif Uyelik Testi
    Given boyner sitesine gidilir
    When  login ikonu ustune gidilir
    And   uye ol linki tiklanir
    Then  uyelik sayfasinda oldugu dogrulanir
    And   uyelik sayfasinda ad bolumune "<ad>" girilir
    And   uyelik sayfasinda email bolumune"<email>" girilir
    And   uyelik sayfasinda password bolumune"<password>" girilir
    And   uyelik sayfasinda cep telefonu bolumune"<cep telefonu>" girilir
    And   uyelik metni icin "<uyelik metni>" checkbox secilir
    And   riza metni icin "<riza metni>" checkbox secilir
    And   uye ol butonu tiklanir
    Then  uye olunamadigi dogrulanir

    Examples:
      | ad     | email                  | password | cep telefonu | uyelik metni | riza metni |
      | h akan | jaziah.poe             | 123456a  | 5455444444   | 1            | 1          |
      | h akan | jaziah.poe@            | 123456a  | 5455444444   | 1            | 1          |
      | h akan | jaziah.poe@free2ducks  | 123456a  | 5455444444   | 1            | 1          |
      | h akan | jaziah.poe@free2ducks. | 123456a  | 5455444444   | 1            | 1          |

