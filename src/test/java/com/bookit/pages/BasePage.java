package com.bookit.pages;

import com.bookit.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {



    @FindBy(linkText = "my")
    protected WebElement my;

    @FindBy(linkText = "self")
    protected WebElement self;

    protected WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
    protected Actions actions = new Actions(Driver.getDriver());

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goToSelfPage(){
        wait.until(ExpectedConditions.elementToBeClickable(my));
        actions.moveToElement(my).pause(2000).click(self).perform();
    }
}
