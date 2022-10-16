package com.beymen.pages;


import com.beymen.utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ProductPage extends BasePage{

    @FindBy(xpath="(//span[@class='m-variation__item'])[2]")
    public WebElement bedens;
    @FindBy(xpath="(//button[@id='addBasket'])[1]")
    public WebElement addToBasketButton;

    @FindBy(xpath="//h1[@class='o-productDetail__title']")
    public WebElement productInfo;

    @FindBy(xpath="((//ins[@id='priceNew'])[1]")//
    public WebElement productPrice;



    public void bilgileriTxtEkleme(){
        String url ="src/test/resources/urun.txt";
        File file=new File(url);
        try {
            file.createNewFile();
            FileWriter myWriter = new FileWriter( file.getAbsolutePath());

            myWriter.write("Ürün Bilgisi: " + productInfo.getText() + "\nÜrün Fiyatı: "+productPrice.getText());
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void sepeteEkle(){
        ReusableMethods.waitFor(2);
        bedens.click();
        addToBasketButton.click();
        ReusableMethods.waitFor(2);
    }
}
