/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test.com;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author suphi
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber.json", "junit:target/cucumber.xml", "rerun:target/rerun.txt"} ,
        features="src/main/java/features/",
        dryRun = false
)
public class RunCucumberTest {
    
   
}
