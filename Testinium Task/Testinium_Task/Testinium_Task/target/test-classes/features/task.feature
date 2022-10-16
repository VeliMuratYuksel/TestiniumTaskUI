Feature: Testinium Task
  @wip
  Scenario: Task Steps
    Given www.beymen.com sitesi açılır
    And Ana sayfanın açıldığı kontrol edilir
    When Arama kutucuğuna 'şort' kelimesi girilir
    And Arama kutucuğuna girilen sort kelimesi silinir
    When Arama kutucuğuna bu kez 'gömlek' kelimesi girilir
    And Klavye üzerinden enter tuşuna basılır
    And Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir
    #And Seçilen ürünün ürün bilgisi ve tutar bilgisi txt dosyasına yazılır
    And Seçilen ürün sepete eklenir
    #Then Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır
    Then Adet arttırılarak ürün adedinin 2 olduğu doğrulanır
    Then Ürün sepetten silinerek sepetin boş olduğu kontrol edilir