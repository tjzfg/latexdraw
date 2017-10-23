package net.sf.latexdraw.util;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestTuple {
	Tuple<Double, String> tuple;

	@Before
	public void setUp() throws Exception {
		tuple = new Tuple<>(2.2, "foo");
	}

	@Test
	public void testA() {
		assertEquals(2.2, tuple.a, 0.00001);
	}

	@Test
	public void testB() {
		assertEquals("foo", tuple.b);
	}

	@Test
	public void testToString() {
		assertThat(tuple.toString(), not(isEmptyOrNullString()));
	}
}
