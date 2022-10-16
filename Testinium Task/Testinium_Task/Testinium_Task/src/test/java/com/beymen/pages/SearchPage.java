package com.beymen.pages;

import com.beymen.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import java.util.Random;

public class SearchPage extends BasePage{

    @FindBy(xpath="//div[@class='m-productImageList']")
    public List<WebElement> urunListesi;

    public WebElement getSearchPageElement(int i){
        WebElement element = Driver.get().findElement(By.xpath("//li[@data-testid][" + i + "]//span"));
        return element;
    }
    public void clickRandomProduct (){
        Random rd = new Random();
        int secilenUrun = rd.nextInt(urunListesi.size());
        urunListesi.get(secilenUrun).click();
    }
}
