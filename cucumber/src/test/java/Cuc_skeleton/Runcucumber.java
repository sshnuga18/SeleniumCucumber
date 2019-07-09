package Cuc_skeleton;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:src/cucumber-reports"},features="src/test/resources/Cuc_skeleton/Login.feature",tags="@data")

public class Runcucumber {

	

}
