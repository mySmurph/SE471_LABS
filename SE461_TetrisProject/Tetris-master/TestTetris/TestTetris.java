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

	@Test
	public void testTetris() {
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
		t.dispose();
	}

	@Test
	public void testStartGameRandom() {
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
							// keys that do stuff
							KeyEvent.VK_Q, 	//COUNTER CLOCKWISE
							KeyEvent.VK_E, 	//CLOCKWISE
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_S, 	//DOWN
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_D, 	//RIGHT
							// keys that do not do stuff
							KeyEvent.VK_K, 
							KeyEvent.VK_Z, 
							KeyEvent.VK_6, 
							KeyEvent.VK_W, 
					};
					while(!t.isGameOver) {
						int k = keys[(int)(Math.random()*100)%11];	// pick random key to hit
						
						// get current state
						int col = t.currentCol;
						int rot = t.currentRotation;
						int row = t.currentRow;
						float mspc = t.logicTimer.millisPerCycle;
						TileType tt = t.currentType; 
						
						//	------------------------------------------------------
						robot.delay((int)(Math.random()*1000)+200);	// wait to hit
						robot.keyPress(k);							// hit key
						robot.delay((int)(Math.random()*500)+100);	// hold key
						robot.keyRelease(k);						// release key
						robot.delay(175);							// delay before test
						//	------------------------------------------------------
						
						if(tt == t.currentType && row < t.currentRow) { 
							// if we have not spawned a new tile at the top of the board we can check that the keys did stuff
							switch(k) {
								case KeyEvent.VK_Q:	
									assertEquals( (rot==0? 3: (rot-1%4)) , t.currentRotation);
									break;
								case KeyEvent.VK_E:	
									assertEquals((++rot)%4, t.currentRotation);
									break;
								case KeyEvent.VK_A:	
									assertTrue(t.currentCol <= col);
									break;
								case KeyEvent.VK_D:	
									assertTrue(t.currentCol >= col);
									break;
								default:
									// other keys were hit so there was no significant change
									assertEquals(col, t.currentCol);
									assertEquals(rot, t.currentRotation);
									assertTrue(t.currentRow > row);
							}
						}
						
					}
					robot.delay(200);
					assertTrue(t.isGameOver);
					
				// start new game
					
					assertFalse(t.isNewGame);	// start the game

					robot.delay(1000);
					robot.keyPress(KeyEvent.VK_ENTER);
					robot.delay(10);
					robot.keyRelease(KeyEvent.VK_ENTER);
					robot.delay(200);
					
					assertFalse(t.isNewGame);	
					
					//Game Started
					robot.delay(1200);
					
					// hit the edges
					int[] keyOrder = {
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_Q, 	//COUNTER CLOCKWISE
							KeyEvent.VK_Q, 	//COUNTER CLOCKWISE
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_Q, 	//COUNTER CLOCKWISE
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_Q, 	//COUNTER CLOCKWISE
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_Q, 	//COUNTER CLOCKWISE
							KeyEvent.VK_E, 	//CLOCKWISE
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_E, 	//CLOCKWISE
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_E, 	//CLOCKWISE
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_E, 	//CLOCKWISE
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_E, 	//CLOCKWISE
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_E, 	//CLOCKWISE
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_Q, 	//COUNTER CLOCKWISE
							KeyEvent.VK_S, 	//DOWN
							KeyEvent.VK_S, 	//DOWN
							
							KeyEvent.VK_P, 	//pause
							KeyEvent.VK_P, 	//pause
							
							KeyEvent.VK_Q, 	//COUNTER CLOCKWISE
							KeyEvent.VK_E, 	//CLOCKWISE
							KeyEvent.VK_E, 	//CLOCKWISE
							KeyEvent.VK_E, 	//CLOCKWISE
							KeyEvent.VK_Q, 	//COUNTER CLOCKWISE
							KeyEvent.VK_E, 	//CLOCKWISE
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_S, 	//DOWN
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_D, 	//RIGHT

							KeyEvent.VK_P, 	//pause
							KeyEvent.VK_P, 	//pause
							
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_Q, 	//COUNTER CLOCKWISE
							KeyEvent.VK_E, 	//CLOCKWISE
							KeyEvent.VK_A, 	//LEFT
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_S, 	//DOWN
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_Q, 	//COUNTER CLOCKWISE
							KeyEvent.VK_E, 	//CLOCKWISE
							KeyEvent.VK_Q, 	//COUNTER CLOCKWISE
							KeyEvent.VK_E, 	//CLOCKWISE
							KeyEvent.VK_E, 	//CLOCKWISE
							KeyEvent.VK_S, 	//DOWN
							KeyEvent.VK_S, 	//DOWN
							KeyEvent.VK_S, 	//DOWN
							KeyEvent.VK_E, 	//CLOCKWISE
							KeyEvent.VK_E, 	//CLOCKWISE
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_Q, 	//COUNTER CLOCKWISE
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_Q, 	//COUNTER CLOCKWISE
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_E, 	//CLOCKWISE
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_E, 	//CLOCKWISE
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_E, 	//CLOCKWISE
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_E, 	//CLOCKWISE
							KeyEvent.VK_D, 	//RIGHT
							KeyEvent.VK_Q, 	//COUNTER CLOCKWISE
							KeyEvent.VK_Q, 	//COUNTER CLOCKWISE
							KeyEvent.VK_S, 	//DOWN
							KeyEvent.VK_Q, 	//COUNTER CLOCKWISE
							
					};
					for(int i = 0; i < 3; i++)
						for(int k: keyOrder) {
							robot.delay((int)(Math.random()*100)+200);	// wait to hit
							robot.keyPress(k);							// hit key
							robot.delay((int)(Math.random()*100)+100);	// hold key
							robot.keyRelease(k);						// release key
							robot.delay(75);							// delay before test
							if(t.isGameOver)
								break;
						}
					
					
					
					// end infinite loop, must remove while(testing) after test
					t.testing = false;
					t.dispose();
					
				} catch (AWTException e) {

					e.printStackTrace();
				};
				
			}
			
		});
		t = new Tetris();
		t.testing = true;
		rt.start();
		t.startGame();
	}
	
	@Test
	public void testRotatePiece() {
		t = new Tetris();
		t.setVisible(false);
		
		TileType[] types = {
				TileType.TypeI,
				TileType.TypeO,
				TileType.TypeJ,
				TileType.TypeL,
				TileType.TypeS,
				TileType.TypeZ,
		};
		
		for(TileType tt: types) {
			t.currentType = tt;
			t.currentRow = 15;

			t.currentCol = -3;
			t.currentRotation = 1;
			t.rotatePiece(2);
			assertEquals(0,t.currentCol);
			
			t.currentCol = 11;
			t.currentRotation = 1;
			t.rotatePiece(2);
			assertEquals(10-tt.dimension, t.currentCol);

			t.currentCol = 2;
			t.currentRotation = 1;
			t.rotatePiece(2);
			assertEquals(2, t.currentCol);
			
			
			
		}
		t.dispose();
		
	}
}
