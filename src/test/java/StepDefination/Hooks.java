package StepDefination;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import helper.loggerHelper;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks {
	
	/*
	 * if we don't create the helper class for log we have define 
	 * the below code for every class
	 * *static Logger log=Logger.getLogger(signUp.class);
	 * *PropertyConfigurator.configure("src/test/resources/log4j.properties");
	 * if we have helper class for the log the we just need the below code
	 * *Logger log = loggerHelper.getLogger(signUp.class);
	 * 
	*/
	
	
	@BeforeAll
	public static void before_All() {
		System.out.println("BeforAll ==>Db connection");
	}

	@AfterAll
	public static void after_All() {
		System.out.println("BeforAll ==>Db connection");
	}

	@Before
	public void setUp() {
		System.out.println("invoke===>>>launching browser!!!");
		
	}

	@After
	public void tearDown() {
		System.out.println("closing==>>Quit browser!!!");
	}

	@BeforeStep
	public void before_Step() {
		
		System.out.println("Before step execution log msg");
	}

	@AfterStep
	public void after_Step() {
		
		System.out.println("Executed====> After step log msg");
	}
}
