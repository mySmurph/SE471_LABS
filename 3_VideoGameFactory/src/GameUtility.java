public class GameUtility {

	/**
	 * Enumeration of Levels
	 */
	public enum Level {
		BEGINNER,
		INTERMEDIATE,
		ADVANCED;
	}

	/**
	 * Creates and returns the appropriate PlayerFactory
	 * @param l the level the player wants to play at
	 * @return IPlayerFactory
	 */
	public static IPlayerFactory createPlayerFactory(Level l) {
		switch(l) {
		case BEGINNER : return new BeginnerPlayerFactory();
		case INTERMEDIATE : return new IntermediatePlayerFactory();
		case ADVANCED : return new AdvancedPlayerFactory();
		default:	return null;
		}
	}

}
