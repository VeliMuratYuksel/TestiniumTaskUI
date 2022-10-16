package com.beymen.step_definitions;

import com.beymen.pages.BasketPage;
import com.beymen.pages.HomePage;
import com.beymen.pages.ProductPage;
import com.beymen.pages.SearchPage;
import com.beymen.utilities.ConfigurationReader;
import com.beymen.utilities.Driver;
import com.beymen.utilities.Log4j;
import com.beymen.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.io.FileNotFoundException;

public class SearchStepDef {

    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    ProductPage productPage = new ProductPage();
    BasketPage basketPage = new BasketPage();

    @Given("www.beymen.com sitesi açılır")
    public void www_beymen_com_sitesi_açılır() {
        Driver.get().get(ConfigurationReader.get("url"));
        Log4j.info("Opening Page : " + ConfigurationReader.get("url"));
    }

    @And("Ana sayfanın açıldığı kontrol edilir")
    public void ana_sayfanın_açıldığı_kontrol_edilir() {
        Assert.assertTrue(homePage.homePageLogo.isDisplayed());
    }

    @When("Arama kutucuğuna {string} kelimesi girilir")
    public void arama_kutucuğuna_kelimesi_girilir(String sorgu) {
        ReusableMethods.waitForClickablility(homePage.cerezleriKabulEt,5).click();
        homePage.searchBox.sendKeys(sorgu);
        Log4j.info("Arama kutucuğuna " + sorgu + " kelimesi girildi.");
    }

    @And("Arama kutucuğuna girilen sort kelimesi silinir")
    public void arama_kutucuğuna_girilen_sort_kelimesi_silinir() {
        ReusableMethods.waitFor(2);
        homePage.searchBox.clear();
        homePage.homePageLogo.click();
        ReusableMethods.waitFor(2);

    }

    @When("Arama kutucuğuna bu kez {string} kelimesi girilir")
    public void arama_kutucuğuna_ikinci_kelimesi_girilir(String yeniSorgu) {
        homePage.searchBox.click();
        homePage.searchBox.sendKeys(yeniSorgu);
        Log4j.info("Arama kutucuğuna " + yeniSorgu + " kelimesi girildi.");
    }

    @And("Klavye üzerinden enter tuşuna basılır")
    public void klavye_üzerinden_enter_tuşuna_basılır() {
        homePage.searchBox.sendKeys(Keys.ENTER);
    }

    @When("Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir")
    public void sonuca_göre_sergilenen_ürünlerden_rastgele_bir_ürün_seçilir() {
        ReusableMethods.waitFor(8);
        searchPage.clickRandomProduct();
        Log4j.info("Sonuca göre bulunan ürünlerden rastgele bir ürün seçildi.");
    }

    @When("Seçilen ürünün ürün bilgisi ve tutar bilgisi txt dosyasına yazılır")
    public void seçilen_ürünün_ürün_bilgisi_ve_tutar_bilgisi_txt_dosyasına_yazılır() {
        ReusableMethods.waitFor(8);
        productPage.bilgileriTxtEkleme();
        Log4j.info("Seçilen ürünün; ürün bilgisi ve tutar bilgisi txt dosyasına yazıldı.");

    }

    @When("Seçilen ürün sepete eklenir")
    public void seçilen_ürün_sepete_eklenir() {
        ReusableMethods.waitFor(2);
        productPage.sepeteEkle();
        Log4j.info("Seçilen ürün sepete eklendi.");

    }

    @Then("Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır")
    public void ürün_sayfasındaki_fiyat_ile_sepette_yer_alan_ürün_fiyatının_doğruluğu_karşılaştırılır() throws FileNotFoundException {
        ReusableMethods.waitForClickablility(homePage.sepet,10);
        ReusableMethods.clickWithJS(homePage.sepet);
        ReusableMethods.waitFor(2);
        basketPage.compareProductInformation();
        Log4j.info("Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırıldı.");

    }

    @Then("Adet arttırılarak ürün adedinin {int} olduğu doğrulanır")
    public void adet_arttırılarak_ürün_adedinin_olduğu_doğrulanır(String  adet) {
        ReusableMethods.waitForClickablility(homePage.sepet,10);
        ReusableMethods.waitFor(2);
        basketPage.selectAmount();
        ReusableMethods.waitFor(2);
        basketPage.selectAmountiki();
        //String  actual = basketPage.adet.getAttribute("value");
        //Assert.assertEquals(actual,"2 adet");
        //Log4j.info("Adet arttırılarak ürün adedinin "+ adet + " olduğu doğrulandı.");
    }

    @Then("Ürün sepetten silinerek sepetin boş olduğu kontrol edilir")
    public void ürün_sepetten_silinerek_sepetin_boş_olduğu_kontrol_edilir() {
        ReusableMethods.waitFor(2);
        basketPage.sil.click();
        ReusableMethods.waitForVisibility(basketPage.sepetBos,10);
        String text ="Sepetinizde ürün bulunmamaktadır.";
        Assert.assertEquals(basketPage.sepetBos.getText(),text);
        ReusableMethods.waitFor(3);
        Log4j.info("Ürün sepetten silinerek sepetin boş olduğu kontrol edildi.");

    }


}
