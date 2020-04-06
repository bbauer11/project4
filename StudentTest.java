import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	
	ConcordanceDataElement element1;
	ConcordanceDataStructure structure1;
	ConcordanceDataManagerInterface manager;
	String text;

	@Before
	public void setUp() throws Exception {
		element1 = new ConcordanceDataElement("hello");
		structure1 = new ConcordanceDataStructure("test", 100);
		manager = new ConcordanceDataManager();
		text = "Daisy, Daisy\ngive me your answer do.\n"+
				"I'm half crazy\nall for the love of you";
	}

	@After
	public void tearDown() throws Exception {
		element1 = null;
		structure1 = null;
	}

	@Test
	public void testToString() {
		element1.addPage(2);
		element1.addPage(5);
		element1.addPage(10);
		assertEquals("hello: 2, 5, 10", element1.toString());
		System.out.println(element1.toString());
		System.out.println(element1.getList());
	}
	
	@Test
	public void testAdd() {
		ArrayList<String> words = manager.createConcordanceArray("hello world hello hi");
	}
	
	@Test
	public void test() {
		System.out.println("hello".hashCode());
		System.out.println("also".hashCode());
		System.out.println("a".hashCode());
		System.out.println("z".hashCode());
		System.out.println("zz".hashCode());
		System.out.println("banana".hashCode()%20);
	}
	
	

}
