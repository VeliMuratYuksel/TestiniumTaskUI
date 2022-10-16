package com.beymen.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BasketPage extends BasePage {

    @FindBy(xpath = "//select[@id='quantitySelect0-key-0']")
    public WebElement adet;

    @FindBy(xpath = "//option[@value='2']")
    public WebElement adetiki;

    @FindBy(xpath = "//button[@id='removeCartItemBtn0-key-0']")
    public WebElement sil;

    @FindBy(xpath = "//strong[@class='m-empty__messageTitle']")
    public WebElement sepetBos;

    @FindBy(xpath="//div[@class='total-price']//strong")
    public WebElement productPrice;


    public void selectAmountiki(){
        adetiki.click();

    }

    public void selectAmount(){
        adet.click();

    }

    public void compareProductInformation() throws FileNotFoundException {
        File file=new File("src/test/resources/product.txt");
        Scanner scanner=new Scanner(file);
        while (scanner.hasNextLine()){
            String s = scanner.nextLine();
            if (s.contains("Ürün Fiyatı")){
                System.out.println("scanner.hasNextLine() = " + s);
                Assert.assertEquals(s.substring(s.indexOf(":")+1).trim(),productPrice.getText());
            }
        }
            scanner.close();
    }
}
