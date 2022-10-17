package com.example.app.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class BasePageObject {
    // digunakan untuk mendefinisikan method2 yang sering dipakai di suatu page
    public AndroidDriver<AndroidElement> getDriver(){
        return driver;
    }

    public WebDriverWait onWait(){
        return new WebDriverWait(getDriver(), 30, 1000);
    }

    // ini adalah mekanisme waitingnya atau mekanisme untuk bilang ke drivernya
    // nunggu sampai suatu kondisi tercapai
    // kita akan pakai si webdriverWait ini untuk pencarian elemennya kita

    public AndroidElement find(By locator){
        return (AndroidElement) onWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    } // kamu ambil element yaitu By locator, tapi waktu nyari kamu harus nunggu dulu sampai si element itu visible / muncul


    // aku akan ngebuat method click
    // method input text ke suatu element
    // method untuk ngecek isDisplayed

    public void click(By locator){

        // locator == By, atau kamu mau nge-locate atau nemuin suatu element by apa
        // dan valuenya apa

        // buat mekanisme untuk click
        // harus nemuin element dulu dari locator yg dikasih
        // baru kita kasih si method clicknya
        AndroidElement elm = find(locator);
        elm.click();
    }

    public void inputText(By locator, String input){
        AndroidElement elm = find(locator);
        elm.sendKeys(input);
    }

    public void isDisplayed(By locator){
        AndroidElement elm = find(locator);
        elm.isDisplayed();
    }
}
