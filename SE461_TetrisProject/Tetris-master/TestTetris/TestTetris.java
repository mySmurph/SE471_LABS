import static org.junit.Assert.*;

import java.awt.AWTException;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.psnbtech.*;

public class TestTetris {

	private Tetris t;
	private boolean testConstructor = false;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void testIsPaused() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testIsGameOver() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testIsNewGame() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetScore() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetLevel() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetPieceType() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetNextPieceType() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetPieceCol() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetPieceRow() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetPieceRotation() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testTetris() {
//		t = new Tetris();
//		assertTrue(t.board instanceof BoardPanel);
//		assertTrue(t.side instanceof SidePanel);
//		assertEquals(1, t.getKeyListeners().length);
//		Dimension expected = new Dimension(450, 490);
//		assertEquals(expected,t.getContentPane().getSize());
//		Component[] c = t.getContentPane().getComponents();
//		assertEquals(2, c.length);
//		assertTrue(c[0] instanceof BoardPanel);
//		assertTrue(c[1] instanceof SidePanel);
//		t.dispose();
//		testConstructor = true;
//	}

//	@Test
	public void testStartGameRandom() {
		t = new Tetris();
		assertTrue(t.board instanceof BoardPanel);
		assertTrue(t.side instanceof SidePanel);
		assertEquals(1, t.getKeyListeners().length);
		Dimension expected = new Dimension(450, 490);
		assertEquals(expected,t.getContentPane().getSize());
		Component[] c = t.getContentPane().getComponents();
		assertEquals(2, c.length);
		assertTrue(c[0] instanceof BoardPanel);
		assertTrue(c[1] instanceof SidePanel);
		
		Thread rt = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Robot robot = new Robot();
					
					
					assertTrue(t.isNewGame);	// start the game

					robot.delay(1000);
					robot.keyPress(KeyEvent.VK_ENTER);
					robot.delay(10);
					robot.keyRelease(KeyEvent.VK_ENTER);
					robot.delay(200);
					assertFalse(t.isNewGame);	
					
					//Game Started
					robot.delay(1200);
					
					int[] keys = {
							KeyEvent.VK_Q, 
							KeyEvent.VK_E, 
							KeyEvent.VK_A, 
							KeyEvent.VK_S, 
							KeyEvent.VK_D, 
					};
					while(!t.isGameOver) {
						int k = keys[(int)(Math.random()*100)%5];
						robot.delay(350);
						robot.keyPress(k);
						robot.delay(150);
						robot.keyRelease(k);
					}
					robot.delay(200);
					
					t.dispatchEvent(new WindowEvent(t, WindowEvent.WINDOW_CLOSING));
					
					
				} catch (AWTException e) {

					e.printStackTrace();
				};
				
			}
			
		});
		rt.start();
		t.startGame();
	}
	
	@Test
	public void testrotatePiece() {
		t = new Tetris();
		t.setVisible(false);
		
		t.currentCol = 0;
		t.currentRow = 15;
		t.currentType = TileType.TypeI;
		
		t.rotatePiece(2);
		System.out.println(t.currentCol);
		
	}
}
