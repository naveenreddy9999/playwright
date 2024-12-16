package testNGTests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class TestNGController {

    @Autowired
    private MavenCommandService mavenCommandService;
    @GetMapping("/")
    public String showForm() {
        return "form";
    }
    @PostMapping("/run-tests")
    public String runTests(@RequestBody Map<String, String> requestParams) {
        String suiteFilePath = requestParams.get("suiteFilePath");
        String mainClass = requestParams.get("mainClass");
        String testClass = requestParams.get("testClass");
        String projectDir = requestParams.get("projectDir");

        String  result;
        if (suiteFilePath != null && !suiteFilePath.isEmpty()) {
            mavenCommandService.executeMavenSuite(suiteFilePath, projectDir);
            result= "Maven suite executed successfully.";
        } else if (testClass != null && !testClass.isEmpty()) {
            String[] command = {"cmd.exe", "/c", "mvn", "clean", "test", "-Dtest=" + testClass, "-Dbrowser=chrome"};
            mavenCommandService.executeMavenCommand(command, projectDir);
            result= "Maven command executed successfully.";
        } else if (mainClass != null && !mainClass.isEmpty()){
            mavenCommandService.executeMainClass(mainClass, projectDir);
            result=  "Maven command executed successfully.";
        } else {
            result= "No test class or suite file specified.";
        }
//        model.addAttribute("result",result);
        return result;

    }
}