package example1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgAnnotations {

	@Test
	public void secondtest() {
		System.out.println("secondtest");
	}

	@Test
	public void firsttest() {
		System.out.println("firsttest");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass method");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest method");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest method");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite method");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite method");
	}

}
