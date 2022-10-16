package com.beymen.pages;

import com.beymen.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {PageFactory.initElements(Driver.get(), this);}
}
