package com.example.steps;

import com.example.app.pages.MyTaskPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddTaskStepDefinitions {

    MyTaskPage myTaskPage = new MyTaskPage();

    @Given("I am on the my task page")
    public void iAmOnTheMyTaskPage() {
        myTaskPage.taskHeaderDisplayed();
    }

    @When("I click add button")
    public void iClickAddButton() {
        myTaskPage.clickAddBtn();
    }

    @And("I input task title")
    public void iInputTaskTitle() {
        myTaskPage.inputTaskTitle("yayyaya");
    }

    @And("I input task content")
    public void iInputTaskContent() {
        myTaskPage.inputTaskContent("yayayaya");
    }

    @And("I click Save button")
    public void iClickSaveButton() {
        myTaskPage.clickSaveBtn();
    }

    @Then("my task will be saved")
    public void myTaskWillBeSaved() {
        myTaskPage.taskAdded();
    }
}
