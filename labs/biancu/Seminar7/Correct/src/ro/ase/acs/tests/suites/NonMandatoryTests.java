package ro.ase.acs.tests.suites;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.acs.tests.cases.ComputerTests;
import ro.ase.acs.tests.categories.Mandatory;

//Custom Test Suite
//all the tests will run, except the ones
//from the Mandatory category
@RunWith(Categories.class)
@SuiteClasses({ ComputerTests.class })
@ExcludeCategory(Mandatory.class)
public class NonMandatoryTests {

}
