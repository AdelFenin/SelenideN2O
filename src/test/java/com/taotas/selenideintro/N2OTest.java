package com.taotas.selenideintro;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Configuration.*;


public class N2OTest {
    @Test
    void shouldSearch() {

        open("https://n2oapp.net/sandbox/view/examples_greeting/#/");

        element(byXpath("//*[@id=\"field-undefined-id\"]/div/div[1]/div[1]/input")).setValue("Адель");

        $(byXpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div/div/div/div/div/div/div/div[1]/div[4]/div[1]/div/div/div/button")).click();

        holdBrowserOpen = true;

    }
}
