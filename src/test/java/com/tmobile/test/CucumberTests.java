package com.tmobile.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		glue = {"com/tmobile/step/definations"},
		features = {"src/test/features"})
public class CucumberTests {}
