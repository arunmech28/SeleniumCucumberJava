package com.test.stepdefinitions;

import java.io.PrintStream;
import java.io.StringWriter;
import java.util.HashMap;
import com.framework.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hook {

	public static HashMap<String, String> testdata;
	public static HashMap<String, HashMap<String, String>> testdata1;
//	public static WebDriver driver;
	public static String currentScenario;
	protected StringWriter writer;
	protected PrintStream captor;
	public static Scenario scenario;

	private static HashMap<Integer, String> scenarios;

	private void addScenario(String scenario) {
		Thread currentThread = Thread.currentThread();
		int threadID = currentThread.hashCode();
		scenarios.put(threadID, scenario);
	}

	private synchronized String getScenario() {
		Thread currentThread = Thread.currentThread();
		int threadID = currentThread.hashCode();
		return scenarios.get(threadID);
	}
	
	public String getCurrentScenario() {
		return getScenario();
	}

	@Before
	public void setUp(Scenario scenario) {
		testdata = new HashMap<String, String>();
		currentScenario = scenario.getName();
		testdata.put("scenarioName", scenario.getName());
		addScenario(scenario.getName());
		Hook.scenario = scenario;
		new Driver();
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
	}

	@After
	public void tearDown(Scenario scenario) {
		System.out.println("after");
//		if(scenario.getStatus().toString().equalsIgnoreCase("passed")) {
//			LogStatus.pass(scenario.getName()+" is passed");
//		}
//		else {
//			LogStatus.fail( scenario.getName()+" is failed");
//		}
		// ExtentReport.extent.endTest(ExtentManager.getExtTest());

	}

	static {
		testdata1 = new HashMap<String, HashMap<String, String>>();
		scenarios = new HashMap<Integer, String>();
	}

	@BeforeStep
	public void BeforeEveryStep(Scenario scenario) {
		System.out.println("Before every step " + scenario.getId());

		// ((PickleStep)((PickleStepTestStep)
	}

	@AfterStep
	public void AfterEveryStep(Scenario scenario) throws NoSuchFieldException, IllegalAccessException {
		// System.out.println("Before every step " + stepTestStep.getId());
	}

	public static String getData(String colName) {
		return Hook.testdata1.get(Hook.currentScenario).get(colName);
	}

}
