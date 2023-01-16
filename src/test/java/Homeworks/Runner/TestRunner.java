package Homeworks.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)//We are connecting JUnit here // Important interview Ques
// Answer : We use Runwith to Integrate JUnit with Runner class so that we can run scenarios and have assertions

@CucumberOptions(
    features = "src/test/resources",//This is to connect to feature files to runner class
        //We need to copy path Resources folder as following : path from content root
        glue = "Homeworks/Steps", //This is to connect stepsDefinitions with runner class
        //We need to copy path of stepsDefinitions Folder as following: path from source root
        tags="@HomeworksLab2",//This is the field that we will use to run tags
        dryRun=false //This is to get Undefined steps without running scenarios
)







public class TestRunner {
}
