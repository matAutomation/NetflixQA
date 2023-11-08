import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import utils.SeleniumHelpers;
import utils.SeleniumProperties;

import java.io.IOException;

public class RunTest {
    public String RunTest() throws IOException, InterruptedException {

        //Seteamos las configuraciones.
        SeleniumProperties configReader = new SeleniumProperties();
        String driverPath = configReader.getPropertyValue("webdriver.chrome.driver");
        String baseUrl = configReader.getPropertyValue("webdriver.baseurl");

        //Inicializamos el Driver.
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();

        //Seteamos las variables del driver en sus respectivos Pages.
        SeleniumHelpers seleniumHelper = new SeleniumHelpers(driver);
        HomePage homePage = new HomePage(driver);

        //Hacemos la perfomance de la web NetFlix
        homePage.navigateToHomePage(baseUrl);
        seleniumHelper.setImplicitWait(2);
        seleniumHelper.maximizeBrowser();
        seleniumHelper.waitForElementToBeVisible(homePage.signInButton, 5);

        //Obtenemos las variables de las cuales haremos assertions.
        String getTitleHP = homePage.getTitleToHomePage();
        String getUrlHP = homePage.getUrlToHomePage();

        System.out.println(getTitleHP);
        System.out.println(getUrlHP);

        driver.quit();

        return getTitleHP;
    }
}
