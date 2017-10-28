package testing.junit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestingJunit {
	
	public static boolean dbConnection(){
		
		return false;
	}
	
	/*
	 * @BeforeClass will be used only once , before any test case will get executed
	 * for the very first time, whenever needs to have e selenium setup.
	 * Selenuim framework make this one static, thats why we need to define as static
	 * same as for @AfterClass
	 */
	
	/*
	 * Assume will get data on which it will decide the execution of other steps
	 * skip the test cases to get run, if there is any failure
	 */
	@BeforeClass
	public static void seleniumSetup(){
		System.out.println("Initializing the Selenium server");
		Assume.assumeTrue(dbConnection());
	}
	
	/*
	 * @Before will run before each n every test case
	 */
	@Before
	public void openBrowser(){
		System.out.println("opening firfor browser");
	}
	
	/*
	 * Annotation @Test defines the below lines as test case
	 */
	
	@Test
	public void testNavigation(){
		System.out.println("Opening the website");
	}

	/*
	 * @Ignore will skip the below test case to get executed
	 */
	@Ignore
	@Test
	public void loginDetails(){
		System.out.println("Enter login details");
	}
	
	/*
	 * @After will run after each n every test case
	 */
	@After
	public void closeBrowser(){
		System.out.println("Closing the firefox browser");
	}
	
	/*
	 * @AfterClass will get executed after the execution of) all the test cases
	 */
	@AfterClass
	public static void seleniumShutDown(){
		System.out.println("Shutting down the selenium server");
	}
}
