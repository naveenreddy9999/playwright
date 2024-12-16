package testNGTests;



import org.apache.commons.io.FileUtils;
import org.testng.TestNG;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestNGTest {
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        List<String> suites = new ArrayList<>();
        InputStream inputStream = TestNGTest.class.getResourceAsStream("/testngFiles/testNG.xml");
        File file = new File(System.getProperty("user.dir")+File.separator+"testNG.xml");
        try{
            assert inputStream != null;
            FileUtils.copyInputStreamToFile(inputStream,file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        suites.add(file.getPath());
        testng.setTestSuites(suites);
        testng.run();
    }
}
