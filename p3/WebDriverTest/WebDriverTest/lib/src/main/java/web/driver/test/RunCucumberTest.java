package web.driver.test;


import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.OBJECT_FACTORY_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("web/driver/test/calculator.feature")
@ConfigurationParameter(key = OBJECT_FACTORY_PROPERTY_NAME, value = "io.cucumber.core.backend.DefaultObjectFactory")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, summary")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "web.driver.test")
public class RunCucumberTest {
	
}

