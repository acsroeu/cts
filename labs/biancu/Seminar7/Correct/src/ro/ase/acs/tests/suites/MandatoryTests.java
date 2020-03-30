package ro.ase.acs.tests.suites;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.acs.tests.cases.ComputerTests;
import ro.ase.acs.tests.categories.Mandatory;

//Custom Test Suite
//Just the tests from the Mandatory category will run
@RunWith(Categories.class)
@SuiteClasses({ ComputerTests.class })
@IncludeCategory(Mandatory.class)
public class MandatoryTests {

}
