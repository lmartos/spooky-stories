package nl.spookystoriesinc.coolgame;

import android.util.Log;
import nl.spookystoriesinc.model.GameBoard;
import nl.spookystoriesinc.model.GameObject;
import nl.spookystoriesinc.view.GameBoardView;
import nl.spookystoriesinc.coolgame.objects.Leaf;
import nl.spookystoriesinc.coolgame.objects.Rock;
import nl.spookystoriesinc.coolgame.objects.Wombat;

/**
 * The game board for CoolGame.
 * 
 * @author Paul de Groot
 */
public class CoolGameBoard extends GameBoard {
	private static final int GAMEBOARD_WIDTH = 9;
	private static final int GAMEBOARD_HEIGHT = 7;

	/**
	 * Create a new game board.
	 */
	public CoolGameBoard() {
		super(GAMEBOARD_WIDTH, GAMEBOARD_HEIGHT);
	}

	/**
	 * 
	 */
	@Override
	public void onEmptyTileClicked(int x, int y) {
		// The x pos. and y pos. from the player object
		int oldX = getWombat().getPositionX();
		int oldY = getWombat().getPositionY();
		// The difference between the players position and the clicked tile
		int difX;
		int difY;
		//
		int newX;
		int newY;

		GameObject objectAtNewPos;
		// while the player has not yet reached the clicked position this while
		// loop will execute
		while (x != oldX || y != oldY) {
			updateView();

			oldX = getWombat().getPositionX();
			Log.d(CoolGame.TAG, "oldX: " + oldX);
			oldY = getWombat().getPositionY();
			Log.d(CoolGame.TAG, "oldY: " + oldY);

			// If the player reached the clicked position the method will end
			if (oldX == x && oldY == y) {
				return;
			}
			// Calculate the difference between the players position and the
			// clicked tile
			difX = x - oldX;
			Log.d(CoolGame.TAG, "difX: " + difX);
			difY = y - oldY;
			Log.d(CoolGame.TAG, "difY: " + difY);

			if (difX < 0 && difX <= difY) {
				this.moveObject(getWombat(), (oldX - 1), (oldY));
				
			}

			else if (difY < 0 && difY < difX) {
				this.moveObject(getWombat(), (oldX), (oldY - 1));

			}

			else {
				if (difX >= difY) {
					newX = oldX + 1;
					newY = oldY;

					objectAtNewPos = this.getObject(newX, newY);

					if (objectAtNewPos != null) {

						// Wombats can't move through rocks
						if (objectAtNewPos instanceof Rock) {
							Log.d(CoolGame.TAG, "right is a rock");

							newX = oldX;
							newY = oldY + 1;
							objectAtNewPos = this.getObject(newX, newY);

							if (objectAtNewPos != null) {
								Log.d(CoolGame.TAG, "Beneath me is a rock");

								// Wombats can't move through rocks
								if (objectAtNewPos instanceof Rock) {
									return;
								}
							}

							else {
								this.moveObject(getWombat(), (oldX), (oldY + 1));

							}

						}
					} else {
						this.moveObject(getWombat(), (oldX + 1), oldY);
					}
				}	
				
				else if (difX < difY) {
					newX = oldX;
					newY = oldY + 1;

					objectAtNewPos = this.getObject(newX, newY);

					if (objectAtNewPos != null) {

						// Wombats can't move through rocks
						if (objectAtNewPos instanceof Rock) {
							Log.d(CoolGame.TAG, "Beneath me is a rock");

							newX = oldX + 1;
							newY = oldY;
							objectAtNewPos = this.getObject(newX, newY);

							if (objectAtNewPos != null) {
								Log.d(CoolGame.TAG, "Right of me is a rock");

								// Wombats can't move through rocks
								if (objectAtNewPos instanceof Rock) {
									return;
								}
							}

							else {
								this.moveObject(getWombat(), (oldX + 1), (oldY));

							}

						}
					} else {
						this.moveObject(getWombat(), (oldX), oldY + 1);
					}
				}

				else {
					return;
				}
			}
		}
	}

	@Override
	public String getBackgroundImg(int mx, int my) {
		return null;
	}

}
