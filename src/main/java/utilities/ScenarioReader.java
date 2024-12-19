package utilities;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScenarioReader {

    private static ScenarioReader scenarioReader;
    private Scenario scenario;

    private ScenarioReader(){
    }

    public static ScenarioReader getInstance(){
        if(scenarioReader==null){
            scenarioReader = new ScenarioReader();
        }
        return scenarioReader;
    }

    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    public void logScenario(String text){
        scenario.log(text);
    }

    public void attachScreenshot(WebDriver driver,String name){
        byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenShot, "image/png", name + Thread.currentThread());
    }
}
