import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class MyTest {

    @Test
    public void myTest() throws IOException, InterruptedException {
        RunTest runTest = new RunTest();
        String runTestResult = runTest.RunTest();
        Assert.assertEquals(runTestResult, "Título de la página: Netflix Argentina: Ve series online, ve películas online");
    }

}