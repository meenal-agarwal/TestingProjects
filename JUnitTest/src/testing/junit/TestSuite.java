package testing.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/*
 * Below annotations will be used to make a suite of classes which will run before and after which 
 * class, how to combine the classes to get executed one by one
 */

@RunWith(Suite.class)
@SuiteClasses({TestingJunit.class,SecondTest.class,TestAssertions.class})
public class TestSuite {

}
