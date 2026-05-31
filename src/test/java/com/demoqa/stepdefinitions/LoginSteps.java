package com.demoqa.stepdefinitions;

import com.demoqa.pages.TextBoxPage;
import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps {

    TextBoxPage textBoxPage = new TextBoxPage();

    @Given("I open the DemoQA homepage")
    public void i_open_the_demoqa_homepage() {
        textBoxPage.openHomepage();
    }

    @When("I click on the Elements card")
    public void i_click_on_elements_card() {
        textBoxPage.clickElementsCard();
    }

    @When("I click on the Text Box menu")
    public void i_click_on_text_box_menu() {
        textBoxPage.clickTextBoxMenu();
    }

    @Then("I should see the Text Box form")
    public void i_should_see_text_box_form() {
        assertTrue(textBoxPage.isTextBoxFormVisible());
    }

    @When("I fill the form with name {string} email {string} current address {string} permanent address {string}")
    public void i_fill_the_form(String name, String email, String current, String permanent) {
        textBoxPage.fillForm(name, email, current, permanent);
    }

    @When("I submit the form")
    public void i_submit_the_form() {
        textBoxPage.submitForm();
    }

    @Then("I should see the output")
    public void i_should_see_the_output() {
        assertTrue(textBoxPage.isOutputVisible());
    }
}