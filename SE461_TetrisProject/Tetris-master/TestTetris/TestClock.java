import static org.junit.Assert.*;

//import java.time.Clock;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.psnbtech.*;

public class TestClock {

	private Clock tc;
	
	@Before
	public void setUp() throws Exception {
		tc = new Clock((float)0.0);	
	}

	@After
	public void tearDown() throws Exception {
		tc = null;
	}
/*
	@Test
	public void testClock() {
		//fail("Not yet implemented");
		float testCyclesPerSecond;
		tc.setCyclesPerSecond(testCyclesPerSecond);
		assertEquals(testCyclesPerSecond, tc.);
	}
/*
	@Test
	public void testSetCyclesPerSecond() {
		//fail("Not yet implemented");
		assertEquals(0, tc.setCyclesPerSecond(0.0));
	}
*/
	@Test
	public void testReset() {
		//fail("Not yet implemented");
		float startTime = System.nanoTime() / 1000000L;
		tc.reset();
		assertEquals(0, tc.elapsedCycles);
		assertEquals(0f, tc.excessCycles, 0.0002f);
		System.out.print(tc.lastUpdate);
		System.out.println();
		System.out.print(startTime);
		assertTrue(startTime < tc.lastUpdate);
		assertEquals(false, tc.isPaused);
		
	}
/*
	@Test
	public void testUpdate() {
		fail("Not yet implemented");
		assertFalse(tc.lastUpdate == tc.getCurrentTime());
	}
*/
	@Test
	public void testSetPaused() {
		//fail("Not yet implemented");
		boolean paused = true;
		tc.setPaused(paused);
		assertEquals(paused, tc.isPaused());
	}
/*
	@Test
	public void testIsPaused() {
		fail("Not yet implemented");
		
		assertEquals(true, tc.isPaused());
	}

	@Test
	public void testHasElapsedCycle() {
		fail("Not yet implemented");
		assertFalse(tc.hasElapsedCycle());
	}

	@Test
	public void testPeekElapsedCycle() {
		fail("Not yet implemented");
		assertFalse(
	}
*/
}
