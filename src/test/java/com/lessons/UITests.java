package com.lessons;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.YandexPage;

import static com.codeborne.selenide.Selenide.open;

public class UITests {

    YandexPage yandexPage;

    @Test
    void exampleTest() {
        int i = 2*2;
        Assert.assertEquals(i, 4, "Проверка умножения");
    }

    @Test
    void yandexTest() {
        yandexPage = open("https://yandex.ru", YandexPage.class);
        yandexPage.search("отрытие");
    }

}
