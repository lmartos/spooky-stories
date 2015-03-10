package nl.spookystoriesinc.coolgame;

import nl.spookystoriesinc.model.GameBoard;
import nl.spookystoriesinc.view.GameBoardView;
import nl.spookystoriesinc.coolgame.objects.Wombat;

/**
 * The game board for CoolGame.
 * 
 * @author Paul de Groot
 */
public class CoolGameBoard extends GameBoard {
	private static final int GAMEBOARD_WIDTH = 15;
	private static final int GAMEBOARD_HEIGHT = 11;

	/**
	 * Create a new game board.
	 */
	public CoolGameBoard() {
		super(GAMEBOARD_WIDTH, GAMEBOARD_HEIGHT);
	}

	@Override
	public void onEmptyTileClicked(int x, int y) {
		// The x pos. and y pos. from the Wombat: FOR LATER!
		int oldX = getWombat().getPositionX();
		int oldY = getWombat().getPositionY();
		
		// Move the player object to the clicked tile
		this.moveObject(getWombat(), x, y);

	}
	
	@Override
	public String getBackgroundImg(int mx, int my) {
		return null;
	}

}
