package ru.litres;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogIn extends DriverSettings {

    @Test
    public void LogIn() {
        String title = driver.getTitle();
        Assert.assertEquals("ЛитРес – библиотека электронных книг, скачать в fb2 или читать онлайн на LitRes", title);

        WebElement loginn = driver.findElement(By.cssSelector("a.user_wrapper"));
        WebElement email = driver.findElement(By.className("login-popup__button btn btn_orange login-popup__button-choose"));
        WebElement inputEmail = driver.findElement(By.name("email"));
        WebElement btnContinue = driver.findElement(By.className("btn btn_orange login-popup__button login-popup__action"));
        WebElement inputPwd = driver.findElement(By.name("pwd"));
        WebElement btnLogin = driver.findElement(By.className("btn btn_orange login-popup__button login-popup__action"));

        loginn.click();
        email.click();
        inputEmail.sendKeys("ponomarenko_mixail@mail.ru");
        btnContinue.click();
        inputPwd.sendKeys("tjppz6ij");
        btnLogin.click();
    }

}
