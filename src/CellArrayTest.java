import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CellArrayTest {
	private static CellArray celltest=new CellArray( 10, 10);
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		celltest.clear();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testCellArray() {
		int i=celltest.col;
		assertEquals(10,i);
		
		int j=celltest.col;
		assertEquals(10,j);
		
	}

	@Test
	public void testGetrow() {
		int j=celltest.col;
		assertEquals(10,j);
	}

	@Test
	public void testGetcol() {
		int i=celltest.col;
		assertEquals(10,i);
	}

	@Test
	public void testGetcell() {
		for(int i=0 ;i<celltest.row;i++) {
			for(int j=0;j<celltest.col;j++) {
				assertEquals(0,	celltest.cellarray[i][j]);
			}
		} 
	}

	@Test
	public void testSetcell() {
		
	}

}
