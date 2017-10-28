package testing.junit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import junit.framework.Assert;

public class TestAssertions {
	
	/*
	 * @Assert will show failure of test case in red, then will skip to run further lines
	 * To execute further code, use try & catch block, but will show failure in green
	 * To get the failure in red, use @Rule and ErrorCollector class in catch block
	 */
	
	@Rule
	public ErrorCollector ec = new ErrorCollector();
	
	@Test
	public void testTitle(){
		
		String actual_title  = "Google.com"; // Extract from selenium script
		String expected_title = "Google.inc";  //compare this title from the excel sheet
		
		System.out.println("Start comparing");
		
		try{
		Assert.assertEquals(actual_title, expected_title);
		}
		catch(Throwable t){
			System.out.println("Error captured");
			ec.addError(t);
		}
		System.out.println("Comparison done");
		
		/*
		 * Below code will not show the error
		 */
		/*
		if (actual_title == expected_title){
			System.out.println("Test case pass");
		}
		else
			System.out.println("Test case fail");
	*/
	}

}
