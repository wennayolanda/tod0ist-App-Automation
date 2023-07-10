package stepDefinitions;

import Component.Checklist;
import Hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChecklistSteps {

    @Given("user select personal checklist")
    public void userSelectPersonalChecklist() {
        Checklist cek = new Checklist(Hooks.driver);
        cek.personalCheck();
    }

    @And("user  select beginner checklist")
    public void userSelectBeginnerChecklist() {
        Checklist cek = new Checklist(Hooks.driver);
        cek.beginnerCheck();
    }

    @When("user select work checklist")
    public void userSelectWorkChecklist() {
        Checklist cek = new Checklist(Hooks.driver);
        cek.workCheck();
    }

    @And("user select education checklist")
    public void userSelectEducationChecklist() {
        Checklist cek = new Checklist(Hooks.driver);
        cek.eduCheck();
    }
}
