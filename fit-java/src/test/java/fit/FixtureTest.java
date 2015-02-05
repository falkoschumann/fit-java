package fit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FixtureTest {

    @Test
	public void testEscape() {
		assertEquals(" &nbsp; &nbsp; ", Fixture.escape("     "));
	}

}
