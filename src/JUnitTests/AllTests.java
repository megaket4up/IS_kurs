package JUnitTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestSetFour.class, TestSetOne.class, TestSetThree.class, TestSetTwo.class })
public class AllTests {

}
