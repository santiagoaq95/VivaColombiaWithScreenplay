package co.com.vivaair.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/vivacolombia_find_flight.feature", 
glue="co.com.vivaair.stepdefinitions",snippets=SnippetType.CAMELCASE)
public class VivaairFindFlightRunner {

}
