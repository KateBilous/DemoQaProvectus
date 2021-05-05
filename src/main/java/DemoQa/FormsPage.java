package DemoQa;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FormsPage {

    public FormsPage practiceForm(){
        $(By.xpath("//div[2][contains(@class, 'element-group' ) ]//span[@class='text']")).click();
        return this;
    }


}
