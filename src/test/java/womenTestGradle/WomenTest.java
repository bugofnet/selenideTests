package womenTestGradle;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class WomenTest {

    @Before
    public void setup(){
        Configuration.browser = "firefox";
        Configuration.startMaximized = true;
    }

    @Test
    public void checkIfIOnWomenPage(){
        open("http://automationpractice.com");
        $(By.linkText("Women")).click();
        $(By.xpath("//h2[@class='title_block']")).shouldHave(text("WOMEN"));
    }
}
