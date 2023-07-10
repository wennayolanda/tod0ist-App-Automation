package stepDefinitions;

import Component.TextBox;
import Hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class SignUpSteps {
    @Given("user open the application")
    public void userOpenTheApplication() throws Exception {
        Hooks hooks = new Hooks();
        hooks.setUp();
        Thread.sleep(3000);
    }

//    @Given("user input {string} and {string}")
//    public void userInputAnd(String email, String pass) throws InterruptedException {
//        TextBox textBox = new TextBox(Hooks.driver);
//        textBox.enterSignUpTextbox("email", email);
//        textBox.enterSignUpTextbox("password", pass);
//    }

    @Given("user input email {string}")
    public void userInputEmail(String email) {
        TextBox emailSignup = new TextBox(Hooks.driver);
        emailSignup.enterEmailSignup(email);
    }

    @And("user input password {string}")
    public void userInputPassword(String pass) {
        TextBox passSignup = new TextBox(Hooks.driver);
        passSignup.enterPassSignup(pass);
    }
}
