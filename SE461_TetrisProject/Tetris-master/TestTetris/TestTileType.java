import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.psnbtech.*;


public class TestTileType {
	
	private TileType tt;
	

	@Before
	public void setUp() throws Exception {
		tt = TileType.TypeI;
	}

	@After
	public void tearDown() throws Exception {
		tt = null;
	}

	@Test
	public void testGetBaseColor() {
		tt = TileType.TypeI;
		try {
			Color bc = new Color(BoardPanel.COLOR_MIN, BoardPanel.COLOR_MAX, BoardPanel.COLOR_MAX);
			//assertNotNull(bc); //checking object if not null
			
			assertEquals(bc, tt.getBaseColor()); //check if base color is object of class
		}catch(Exception e) {
			fail("Caught exception");
		}
	}

	
	@Test
	public void testGetLightColor() {
		tt = TileType.TypeJ;
		try {
			Color lc = new Color(BoardPanel.COLOR_MIN, BoardPanel.COLOR_MIN, BoardPanel.COLOR_MAX);
			//assertNotNull(lc); //checking object if not null
			lc = lc.brighter();
			
			assertEquals(lc, tt.getLightColor()); //check if base color is object of class
		}catch(Exception e) {
			fail("Caught exception");
		}
	}

	@Test
	public void testGetDarkColor() {
		tt = TileType.TypeS;
		try {
			Color dc = new Color(BoardPanel.COLOR_MIN, BoardPanel.COLOR_MAX, BoardPanel.COLOR_MIN);
			//assertNotNull(lc); //checking object if not null
			dc = dc.darker();
			
			assertEquals(dc, tt.getDarkColor()); //check if base color is object of class
		}catch(Exception e) {
			fail("Caught exception");
		}
	}
/*
	@Test
	public void testGetDimension() {
		assertEquals(5, tt.getDimension());
	}

	@Test
	public void testGetSpawnColumn() {
		assertEquals(8, tt.getSpawnColumn());
	}

	@Test
	public void testGetSpawnRow() {
		assertEquals(0, tt.getSpawnRow());
	}

	@Test
	public void testGetRows() {
		//20 rows
		assertEquals(9, tt.getRows());
	}

	@Test 
	public void testGetCols() {
		//10 columns
		assertEquals(9, tt.getCols());
	}

	@Test
	public void testIsTile() {
		assertEquals([5][9], tt.isTile(5, 4, 5));
	}

	@Test
	public void testGetLeftInset() {
		assertEquals(95,tt.getLeftInset(5));
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
*/
}
