import DemoQa.FormsPage;
import DemoQa.MainPage;
import DemoQa.PracticeFormPage;
import DemoQa.testdata.TestDataUser;
import DemoQa.testdata.User;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class ForumTest {
    MainPage mainPage = new MainPage();
    FormsPage formsPage= new FormsPage();
    PracticeFormPage practiceFormPage= new PracticeFormPage();
    User user = TestDataUser.getDefaultUser();

    @BeforeClass
    public static void setUp(){
        Configuration.browser = "firefox";
    }

    @Test
    public void enterDataToTheForumTest(){
        mainPage.open();
        mainPage.findForum();
        formsPage.practiceForm();
        practiceFormPage.setFirstName(user.getFirstName());
        practiceFormPage.setLastName(user.getLastName());
        practiceFormPage.selectGender("Female");
        practiceFormPage.setPhoneNumber(user.getPhone());
        practiceFormPage.clickSubmit();
        practiceFormPage.checkSubmitedWindow();

    }

    @Test
    public void submitEmptyForumTest(){
        mainPage.open();
        mainPage.findForum();
        formsPage.practiceForm();
        practiceFormPage.clickSubmit();
        practiceFormPage.checkRequiredAttributeFirstName();
        practiceFormPage.checkRequiredAttributeLastName();
        practiceFormPage.checkRequiredAttributeRadioButton();
    }

    @AfterMethod
    public void tearDown(){
        closeWindow();
    }
}
