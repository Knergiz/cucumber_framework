package steps;

import com.github.javafaker.Faker;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utils.Driver;

public class RandomSteps {

    @Test
    public void getRandomDate(){
        Faker faker = new Faker();

        Driver.getDriver().get("https://www.google.com");

        Driver.getDriver().findElement(By.name("q")).sendKeys(faker.overwatch().hero() + Keys.ENTER);

        Driver.quitDriver();

    }

}
