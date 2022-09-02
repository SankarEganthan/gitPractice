package org.runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(snippets = SnippetType.CAMELCASE, dryRun=true, stepNotifications=true, monochrome=true, plugin= {"usage", "html:target//output.html"}, name = {"Booking Rooms in AdactinHotelApp with valid data 1"}, features="src\\test\\resources")
public class TestRunnder {

}
