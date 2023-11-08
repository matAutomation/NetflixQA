package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage{

    private WebDriver driver;
    public By signInButton = By.id("signIn");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void navigateToHomePage(String url){
        driver.get(url);
    }

    public String getTitleToHomePage(){
        String title = "Título de la página: " + driver.getTitle();
        return title;
    }

    public String getUrlToHomePage(){
        String urlActual = "URL Actual: " + driver.getCurrentUrl();
        return urlActual;
    }

    public void signInButton() {
        driver.findElement(By.id("signIn"));
    }

}
