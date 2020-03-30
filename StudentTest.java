import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	
	ConcordanceDataElement element1;

	@Before
	public void setUp() throws Exception {
		element1 = new ConcordanceDataElement("hello");
	}

	@After
	public void tearDown() throws Exception {
		element1 = null;
	}

	@Test
	public void testToString() {
		element1.addPage(2);
		element1.addPage(5);
		element1.addPage(10);
		assertEquals("hello: 2,5,10", element1.toString());
	}

}
