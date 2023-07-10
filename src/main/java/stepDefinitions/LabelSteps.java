package stepDefinitions;

import Component.Menu;
import Hooks.Hooks;
import io.cucumber.java.en.*;
import Component.Label;
public class LabelSteps {

    @Then("the plan label is displayed")
    public void thePlanLabelIsDisplayed() throws Exception {
        Label planLabel = new Label(Hooks.driver);
        planLabel.labelPlanIsDisplayed();
    }

    @Then("the project name is display")
    public void theProjectNameIsDisplay() throws Exception {
        Label name = new Label(Hooks.driver);
        name.labelProjectIsDisplayed();
    }

    @Then("the task label is display")
    public void theTaskLabelIsDisplay() throws Exception {
        Label task = new Label(Hooks.driver);
        Menu menu = new Menu(Hooks.driver);
        menu.taskFrame();
        task.labelTaskIsDisplayed();
    }

    @Then("verify that complete label is display")
    public void verifyThatCompleteLabelIsDisplay() throws Exception {
        Label task = new Label(Hooks.driver);
        task.completeTaskIsDisplayed();
    }

    @Then("error message is display")
    public void errorMessageIsDisplay() throws Exception {
        Label error = new Label(Hooks.driver);
        error.errorMessageIsDisplayed();
    }
}
