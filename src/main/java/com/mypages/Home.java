package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home extends BasePage{
    //Page locators
    private By headerText=By.xpath("//h1//span");

    public Home(WebDriver driver){
        super(driver);

    }


    public String getPageHeader() {
        return getPageHeader(headerText);
    }


    public String getHomepagetitle(){
        return getPageTitle();
    }


}
