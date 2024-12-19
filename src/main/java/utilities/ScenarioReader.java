package utilities;

import io.cucumber.java.Scenario;

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
}
