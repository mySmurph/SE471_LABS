import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.psnbtech.*;


public class TestTileType {
	
	private TileType tt;
	

	@Before
	public void setUp() throws Exception {
		tt = new TileType();
	}

	@After
	public void tearDown() throws Exception {
		tt = null;
	}

	@Test
	public void testGetBaseColor() {
		try {
			Color bc = getBaseColor("red");
			assertNotNull(bc); //checking object if not null
			
			assertTrue(true, bc instanceof Color); //check if base color is object of class
		}catch(Exception e) {
			fail("Caught exception");
		}
	}

	
	@Test
	public void testGetLightColor() {
		try {
			Color lc = getLightColor();
			assertNotNull(lc); //checking object if not null
			
			assertTrue(true, lc instanceof Color); //check if base color is object of class
		}catch(Exception e) {
			fail("Caught exception");
		}
	}

	@Test
	public void testGetDarkColor() {
		try {
			Color dc = getDarkColor();
			assertNotNull(dc); //checking object if not null
			
			assertTrue(true, dc instanceof Color); //check if base color is object of class
		}catch(Exception e) {
			fail("Caught exception");
		}
	}

	@Test
	public void testGetDimension() {
		assertEquals("Getting Dimension", 5, tt.getDimension());
	}

	@Test
	public void testGetSpawnColumn() {
		assertEquals("Getting Spawn Column", 8, tt.getSpawnColumn());
	}

	@Test
	public void testGetSpawnRow() {
		assertEquals("Getting Spawn Row", 0, tt.getSpawnRow());
	}

	@Test
	public void testGetRows() {
		//20 rows
		assertEquals("Getting Rows", 9, tt.getRows());
	}

	@Test 
	public void testGetCols() {
		//10 columns
		assertEquals("Getting Columns", 9, tt.getCols());
	}

	@Test
	public void testIsTile() {
	

	}

	@Test
	public void testGetLeftInset() {
		assertEquals(5,tt.getLeftInset());
		//fail("Not yet implemented");
	}

	@Test
	public void testGetRightInset() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTopInset() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBottomInset() {
		fail("Not yet implemented");
	}

}
