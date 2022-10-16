package com.beymen.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//input[@class='default-input o-header__search--input']")
    public WebElement searchBox;

    @FindBy(xpath = "//img[@class='o-header__logo--img --blue']")
    public WebElement homePageLogo;

    @FindBy(xpath = "//a[@class='o-header__userInfo--item bwi-cart-o -cart']")
    public WebElement sepet;

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cerezleriKabulEt;

}
