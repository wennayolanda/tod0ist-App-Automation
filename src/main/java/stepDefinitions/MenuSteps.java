package stepDefinitions;

import Component.Menu;
import Hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenuSteps {
    @And("user click Continue with more options menu")
    public void userClickContinueOption() throws InterruptedException {
        Menu optionMenu = new Menu(Hooks.driver);
        optionMenu.anotherOption();
    }

    @Then("user click parent project option")
    public void userClickParentProjectOption() {
        Menu menu = new Menu(Hooks.driver);
        menu.parentOption();
    }

    @And("user select parent project")
    public void userSelectParentProject() {
        Menu menu = new Menu(Hooks.driver);
        menu.selectParent();
    }

    @When("user select the existing project")
    public void userSelectTheExistingProject() throws InterruptedException {
        Menu menu = new Menu(Hooks.driver);
        Thread.sleep(4000);
        menu.existProject();
    }

    @And("user select another parent project")
    public void userSelectAnotherParentProject() {
        Menu menu = new Menu(Hooks.driver);
        menu.anotherOption();
    }

    @Given("user select the existing task")
    public void userSelectTheExistingTask() {
        Menu menu = new Menu(Hooks.driver);
        menu.existingTask();
    }
}
