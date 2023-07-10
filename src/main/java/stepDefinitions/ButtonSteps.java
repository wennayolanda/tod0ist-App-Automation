package stepDefinitions;

import Hooks.Hooks;
import io.cucumber.java.en.*;
import Component.Button;

public class ButtonSteps {
    @When("user click Don't Allow button")
    public void userClickNotAllow() throws InterruptedException {
        Button notAllow = new Button(Hooks.driver);
        notAllow.notAllowBtn();
    }

    @And("user click {string} button")
    public void userClickButton(String text) {
        Button signUp = new Button(Hooks.driver);
        signUp.signUpEmail();
    }

    @When("user click on signup button")
    public void userClickOnSignupButton() throws InterruptedException {
        Button signUpBtn = new Button(Hooks.driver);
        signUpBtn.signUpBtn();
    }

    @And("user click Login with Email button")
    public void userClickLoginWithEmailButton() {
        Button btn = new Button(Hooks.driver);
        btn.loginEmail();
    }

    @Then("user click none of the above button")
    public void userClickNoneOfTheAboveButton() {
        Button btn = new Button(Hooks.driver);
        btn.noneAbove();
    }

    @When("user click on login button")
    public void userClickOnLoginButton() {
        Button btn = new Button(Hooks.driver);
        btn.loginBtn();
    }

    @When("user click continue button")
    public void userClickContinueButton() {
        Button btn = new Button(Hooks.driver);
        btn.continueBtn();
    }

    @Then("user click Launch Todoist button")
    public void userClickLaunchTodoistButton() {
        Button btn = new Button(Hooks.driver);
        btn.launchBtn();
    }

    @And("user click back button")
    public void userClickBackButton() {
        Button btn = new Button(Hooks.driver);
        btn.planBackBtn();
    }

    @And("user click Done button")
    public void userClickDoneButton() {
        Button btn = new Button(Hooks.driver);
        btn.doneProjectBtn();
    }

    @And("user swipe the favorite button")
    public void userSwipeTheFavoriteButton() {
        Button btn = new Button(Hooks.driver);
        btn.favoriteBtn();
    }

    @Then("user click edit project button")
    public void userClickEditProjectButton() {
        Button btn = new Button(Hooks.driver);
        btn.editProjectBtn();
    }

    @Given("user click add task button")
    public void userClickAddTaskButton() {
        Button btn = new Button(Hooks.driver);
        btn.addTaskBtn();
    }

    @And("user click save task button")
    public void userClickSaveTaskButton() {
        Button btn = new Button(Hooks.driver);
        btn.saveTaskBtn();
    }

    @And("user click due date button")
    public void userClickDueDateButton() {
        Button btn = new Button(Hooks.driver);
        btn.dueDateBtn();
    }

    @When("user click ok button")
    public void userClickOkButton() {
        Button btn = new Button(Hooks.driver);
        btn.okBtn();
    }

    @When("user click overflow menu button")
    public void userClickOverflowMenuButton() {
        Button btn = new Button(Hooks.driver);
        btn.overflowMenuBtn();
    }

    @And("user click edit task button")
    public void userClickEditTaskButton() {
        Button btn = new Button(Hooks.driver);
        btn.editTaskBtn();
    }

    @Then("user click save edit task button")
    public void userClickSaveEditTaskButton() {
        Button btn = new Button(Hooks.driver);
        btn.saveEditBtn();
    }

    @And("user click delete task button")
    public void userClickDeleteTaskButton() {
        Button btn = new Button(Hooks.driver);
        btn.deleteTask();
    }

    @Then("user click YES button")
    public void userClickYESButton() {
        Button btn = new Button(Hooks.driver);
        btn.yesDeleteConfirmation();
    }

    @Given("user click complete button")
    public void userClickCompleteButton() {
        Button btn = new Button(Hooks.driver);
        btn.completeTask();
    }

    @Then("user click undo button")
    public void userClickUndoButton() {
        Button btn = new Button(Hooks.driver);
        btn.undoTaskBtn();
    }
}
