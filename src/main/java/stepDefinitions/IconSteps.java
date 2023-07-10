package stepDefinitions;

import Component.Icon;
import Hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IconSteps {

    @Given("user click three row icon")
    public void userClickThreeRowIcon() throws InterruptedException {
        Icon row = new Icon(Hooks.driver);
        Thread.sleep(2000);
        row.threeRow();
    }

    @When("user click add project icon")
    public void userClickAddProjectIcon() throws InterruptedException {
        Icon add = new Icon(Hooks.driver);
        Thread.sleep(2000);
        add.addProject();
    }

    @And("user click dotted three icon")
    public void userClickDottedThreeIcon() throws InterruptedException {
        Icon add = new Icon(Hooks.driver);
        Thread.sleep(2000);
        add.moreOption();
    }

    @And("user select date")
    public void userSelectDate() throws InterruptedException {
        Icon add = new Icon(Hooks.driver);
        Thread.sleep(2000);
        add.dateIcon();
    }
}
