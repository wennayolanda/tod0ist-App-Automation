package stepDefinitions;

import Component.TextBox;
import Hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TextBoxSteps {

    @When("user input the {string} for account name")
    public void userInputTheForAccountName(String name) {
        TextBox textBox = new TextBox(Hooks.driver);
        textBox.enterProfilName(name);
    }

    @And("user enter {string} for project name")
    public void userEnterForProjectName(String project) {
        TextBox textBox = new TextBox(Hooks.driver);
        textBox.projectName(project);
    }

    @When("user enter {string} for task name")
    public void userEnterForTaskName(String taskName) {
        TextBox textBox = new TextBox(Hooks.driver);
        textBox.taskName(taskName);
    }

    @And("user enter {string} in edit task")
    public void userEnterInEditTask(String editName) {
        TextBox textBox = new TextBox(Hooks.driver);
        textBox.editTaskTextbox(editName);
    }

}
