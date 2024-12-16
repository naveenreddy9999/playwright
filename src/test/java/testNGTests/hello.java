package testNGTests;

import io.restassured.RestAssured;

import java.util.HashMap;
import java.util.Map;

public class hello {

    public static void main(String[] args) {
//        RestAssured.given().param("testClass", "testNGTests/TestOne").get("http://localhost:8080/run-tests").then().statusCode(200);

        Map<String,String> payload = new HashMap<>();
//       payload.put("suiteFilePath","testNG.xml");
       payload.put("testClass","testNGTests/TestOne");
//        payload.put("mainClass","com/att/automation/Launcher");
        payload.put("projectDir","C:\\Users\\nb3485\\IdeaProjects\\playwright");
//        payload.put("projectDir","C:\\Users\\nb3485\\IdeaProjects\\CPQ_Automation\\CloudRunner_UI_Automation");
        RestAssured.given().contentType("application/json").body(payload).post("http://localhost:8080/run-tests").prettyPeek().then().statusCode(200);
    }
}
