package com.demoqa.pages;

import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {

    public void openHomepage() {
        open("https://demoqa.com");
    }

    public void clickElementsCard() {
        $(".card-body h5").scrollTo().click();
    }

    public void clickTextBoxMenu() {
        $("#item-0").scrollTo().click();
    }

    public boolean isTextBoxFormVisible() {
        return $("#userName-label").isDisplayed();
    }

    public void fillForm(String name, String email, String currentAddress, String permanentAddress) {
        $("#userName").setValue(name);
        $("#userEmail").setValue(email);
        $("#currentAddress").setValue(currentAddress);
        $("#permanentAddress").setValue(permanentAddress);
    }

    public void submitForm() {
        $("#submit").scrollTo().click();
    }

    public boolean isOutputVisible() {
        return $("#output").isDisplayed();
    }
}