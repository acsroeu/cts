package ro.ase.acs.tests.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.acs.tests.cases.ComputerTests;
import ro.ase.acs.tests.cases.SumTests;

//General Test Suite
//All the tests from the specified classes will run
@RunWith(Suite.class)
@SuiteClasses({ ComputerTests.class, SumTests.class })
public class AllTests {

}
