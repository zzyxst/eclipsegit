import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ActtTest {		
	private static CellArray ac=new CellArray(10,10);

		private static Actt actt=new Actt(ac);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ac.clear();

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	//@Test
	//public void testActt() {
	//	fail("Not yet implemented");
	//}

	@Test
	public void testNeighbors() {
		ac.setcell(0, 0, 1);
		ac.setcell(1, 1, 1);
		ac.setcell(0, 2, 1);
		assertEquals(actt.neighbors(1,0),2);
		assertEquals(actt.neighbors(0,1),3);
		
		
	}

	

	@Test
	public void testNextworld() {
		ac.setcell(0, 0, 1);
		ac.setcell(1, 1, 1);
		ac.setcell(0, 2, 1);
		assertEquals(actt.nextworld().cellarray[0][1],1);
				
				
	}

}
