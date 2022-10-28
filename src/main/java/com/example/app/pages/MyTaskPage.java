package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class MyTaskPage extends BasePageObject {

    private By taskHeader = By.xpath("//android.widget.TextView[@text = 'My Task']");
    private By addBtn = MobileBy.AccessibilityId("Android Room");
    private By fieldTitleTask = By.id("editTextTaskTitle");
    private By fieldContentTask = By.id("editTextTaskContent");
    private By saveBtn = By.id("com.yoesuv.androidroom:id/buttonApply");  // com.yoesuv.androidroom:id/buttonApply --> bisa diambil value yg after / atau setelah package
    private By taskTitle = By.id("textViewTaskTitle");

    public void taskHeaderDisplayed(){
        // method untuk memverifikasi apakah si element task header displayed apa engga
        // cari element header dengan locator taskHeader dan verify bahwa dia displayed

//        AndroidElement headerElm = driver.findElement(taskHeader);
//        AndroidElement headerElm = find(taskHeader);

        //driver yang udah berhasil kita buat di @Before akan kita pakai untuk cari element
        // pencarian element atau driver.findElement() akan mengembalikan suatu element
        // yg sesuai dengan locator yg kita kasih

        // element ini lah yg baru bisa kita kasih interaksinya

//        headerElm.isDisplayed();
        isDisplayed(taskHeader);
    }

    public void clickAddBtn(){
//        AndroidElement addBtElm = find(addBtn);
//        addBtElm.click();
        click(addBtn);

        for (int i = 1; i < 5; i++){
            scrollUp();
        }
        scrollAndClickBytext("Samsung PS5");
    }

    public void inputTaskTitle(String taskTitle){
//        AndroidElement fieldTitleElm = find(fieldTitleTask);
//        fieldTitleElm.sendKeys(taskTitle); //redundan
        inputText(fieldTitleTask, taskTitle);
    }

    public void inputTaskContent(String taskContent){
//        AndroidElement fieldContentElm = find(fieldContentTask);
//        fieldContentElm.sendKeys(taskContent); //redundan
        inputText(fieldContentTask, taskContent);
    }

    public void clickSaveBtn(){
//        AndroidElement saveBtnElm = find(saveBtn);
//        saveBtnElm.click(); //redundan
        click(saveBtn);
        //kita bisa buat method2 yang sering kita pakai di BasePageObject
        // aku akan ngebuat method click
        // method input text ke suatu element
        // method untuk ngecek isDisplayed
    }

    public void taskAdded(){
//        AndroidElement taskViewElm = find(taskTitle);
//        taskViewElm.isDisplayed();
        isDisplayed(taskTitle);
    }
}
