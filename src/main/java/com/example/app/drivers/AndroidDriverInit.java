package com.example.app.drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverInit {

    //kita akan melakukan inisialisasi driver yang akan digunakan untuk automation di class ini

    public static AndroidDriver<AndroidElement> driver; //driver ini adalah sebuah class yang namanya AndroidDriver, isinya adalah AndroidElement

    public static void initialization(){
        //ketika akan melakukan inisialiasi, kita harus menentukan desired capabilities dari driver yang akan dibangun
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformVersion", "11"); //ini diubah
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app", "C:\\Aisyah\\Alta\\sample-mobile-automation\\src\\test\\resources\\application\\com.yoesuv.androidroom-v2(2.1.0)-release.apk"); //ini diubah

        try {
            driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
    }

    public static void close(){
        driver.quit(); //kita matiin drivernya
    }
}
