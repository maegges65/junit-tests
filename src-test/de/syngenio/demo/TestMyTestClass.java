package de.syngenio.demo;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

public class TestMyTestClass {

	private MyTestClass _testObject;

	@Before
	public void setUp() {
		_testObject = new MyTestClass();
	}
	
	@Test
	public void assureThatDoSomethingReturnsLowValueInts() {
		int returned = _testObject.doSomething("", 0);
		assertThat(returned, Matchers.is(0));
		returned = _testObject.doSomething("", 9);
		assertThat(returned, Matchers.is(9));
		returned = _testObject.doSomething("", Integer.MIN_VALUE);
		assertThat(returned, Matchers.is(Integer.MIN_VALUE));
	}

	@Test
	public void assureThatDoSomethingReturnsParsedStringForHighParam2Values() {
		int returned = _testObject.doSomething("1234", 10);
		assertThat(returned, Matchers.is(1234));
		returned = _testObject.doSomething("4567", Integer.MAX_VALUE);
		assertThat(returned, Matchers.is(4567));
	}
	
	@Test(expected=NumberFormatException.class)
	public void assureThatDoSomethingThrowsExceptionForNonParseableString() {
		_testObject.doSomething("+-*~", 10);
	}
}
