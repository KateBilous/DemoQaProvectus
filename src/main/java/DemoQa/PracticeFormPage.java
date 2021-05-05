package DemoQa;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage {

    private static final By firstNameInput = By.id("firstName");
    private static final By lastNameInput = By.id("lastName");
    private static final By phoneNumberInput = By.id("userNumber");
    private static final By genderRadioButton = By.xpath("//div[child::*[@name='gender']]");
    private static final By submitButton = By.xpath("//button[contains(@id,\"submit\")]");
    private static final By alert = By.id("example-modal-sizes-title-lg");


    public PracticeFormPage setFirstName(String value) {
        $(firstNameInput).setValue(value);
        return this;

    }

    public PracticeFormPage setLastName(String value) {
        $(lastNameInput).setValue(value);
        return this;
    }

    public PracticeFormPage setPhoneNumber(String value) {
        $(phoneNumberInput).setValue(value);
        return this;
    }

    public PracticeFormPage selectGender(String gender) {
        $$(genderRadioButton).find(text(gender)).click();
        return this;
    }

    public PracticeFormPage clickSubmit() {
        $(submitButton).submit();
        return this;
    }

    public PracticeFormPage checkSubmitedWindow() {
        $(alert).shouldHave(text("Thanks for submitting the form"));
        return this;
    }

    public PracticeFormPage checkRequiredAttributeFirstName() {
        $(firstNameInput).shouldHave(attribute("required"));
        return this;
    }

    public PracticeFormPage checkRequiredAttributeLastName() {
        $(lastNameInput).shouldHave(attribute("required"));
        return this;
    }

    public PracticeFormPage checkRequiredAttributeRadioButton() {
        $(genderRadioButton).findAll("input").forEach(e -> e.shouldHave(attribute("required")));
        return this;
    }


}
