package DemoQa;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public MainPage open() {
        Selenide.open("https://demoqa.com/");
        return this;
    }

    public MainPage findForum() {
        $(By.xpath("//div[2][starts-with(@class,'card')]")).click();
        return this;
    }

}






