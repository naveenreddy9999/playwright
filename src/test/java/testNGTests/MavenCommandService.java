package testNGTests;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

@Service
public class MavenCommandService {

    public void executeMavenCommand(String[] command, String projectDir) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(command);
            processBuilder.directory(new File(projectDir));
            Process process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            int exitCode = process.waitFor();
            System.out.println("\nExited with error code : " + exitCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void executeMavenSuite(String suiteFilePath, String projectDir) {
        String[] command = {"cmd.exe", "/c", "mvn", "clean", "test", "-DsuiteXmlFile=" + suiteFilePath};
        executeMavenCommand(command,projectDir);
    }


    public void executeMainClass(String className, String projectDir) {
        String[] command = {"cmd.exe", "/c", "mvn", "exec:java", "-Dexec.mainClass=" + className};
        executeMavenCommand(command, projectDir);
    }
}