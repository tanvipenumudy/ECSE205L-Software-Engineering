package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction junit2 = new jUnitFunction();
		String result = junit2.addStrings("Tanvi ", "Penumudy");
		assertEquals ("Tanvi Penumudy", result);
	}

}
