package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class YandexPage {

    public void search(String text) {
        $(By.xpath("//input[@id='text']"))
                .setValue(text)
                .pressEnter();
    }

}




