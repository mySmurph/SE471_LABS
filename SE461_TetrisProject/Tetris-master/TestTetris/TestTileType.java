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
			
			assertEquals(bc, tt.getBaseColor()); 
		}catch(Exception e) {
			fail("Caught exception");
		}
	}

	
	@Test
	public void testGetLightColor() {
		tt = TileType.TypeJ;
		try {
			Color lc = new Color(BoardPanel.COLOR_MIN, BoardPanel.COLOR_MIN, BoardPanel.COLOR_MAX);

			lc = lc.brighter();
			
			assertEquals(lc, tt.getLightColor()); 
		}catch(Exception e) {
			fail("Caught exception");
		}
	}

	@Test
	public void testGetDarkColor() {
		tt = TileType.TypeS;
		try {
			Color dc = new Color(BoardPanel.COLOR_MIN, BoardPanel.COLOR_MAX, BoardPanel.COLOR_MIN);

			dc = dc.darker();
			
			assertEquals(dc, tt.getDarkColor());
		}catch(Exception e) {
			fail("Caught exception");
		}
	}

	@Test
	public void testGetDimension() {
		tt = TileType.TypeS;
		try {
			assertEquals(3, tt.getDimension());
		}catch(Exception e) {
			fail("Caught exception");
		}
	}

	@Test
	public void testGetSpawnColumn() {
		tt = TileType.TypeS;
		try {
			assertEquals(4, tt.getSpawnColumn());
		}catch(Exception e) {
			fail("Caught exception");
		}
	}

	@Test
	public void testGetSpawnRow() {
		tt = TileType.TypeS;
		try {
			assertEquals(0, tt.getSpawnRow());
		}catch(Exception e) {
			fail("Caught exception");
		}
	}

	@Test
	public void testGetRows() {
		//20 rows
		tt = TileType.TypeS;
		try {
			assertEquals(2, tt.getRows());
		}catch(Exception e) {
			fail("Caught exception");
		}
	}

	@Test 
	public void testGetCols() {
		//10 columns
		tt = TileType.TypeS;
		try {
			assertEquals(3, tt.getCols());
		}catch(Exception e) {
			fail("Caught exception");
		}
		
		tt = TileType.TypeZ;
		try {
			assertEquals(3, tt.getCols());
		}catch(Exception e) {
			fail("Caught exception");
		}
	}
/*
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
