#Background bize tekrar eden giriş işlemlerinde stepleri birleştirme imkanı verir.
#Background her Scenario başlarken loop yapar gibi her defasinda yeniden calisir.
@ets
Feature: ets Tur sitesi login testi

  Background: ets sitesine giris
    Given ets tur sitesine gidilir
    And   login butonu ustune gidilir

  @first
  Scenario: ets tur login

    When  giris butonuna basilir
    And   eposta girilir
    And   password girilir
    When  giris yap butonuna basilir
    Then  sayfaya gidilemedigi dogrulanir

    @second
  Scenario: ets tur uyelik
    And  uye ol butonuna basilir
    And  ad girilir
    And  soyad girilir
    And  uyelik icin eposta girilir
    And  ceptelefonu girilir
    And  uyelik icin password girilir
    And  password yeniden girilir
    And  kullanim sartlari checkbox secilir
    And  firsat ve kampanyalar checkbox secilir
    When uyelik bolumunde uye ol butonuna basilir
    Then sayfaya gidilemedigi dogrulanir1

