package womenTestGradle;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;



public class WomenTest {

    @Before
    public void setup(){
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
    }

    @Test
    public void checkIfIOnWomenPage(){
        open("http://automationpractice.com");
        element(By.linkText("Women")).click();
        element(By.xpath("//h2[@class='title_block']")).shouldHave(text("WOMEN"));
    }

    @Test
    public void searchProduct(){
        element(By.id("search_query_top")).setValue("Blouse").pressEnter();
        element(By.xpath("//img[@title='Blouse']")).shouldBe(visible);
        $(byText("1 result has been found!")).should(exist);
    }
}
