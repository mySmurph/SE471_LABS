public class GameUtility {

	public enum Level {
		BEGINNER,
		INTERMEDIATE,
		ADVANCED;
	}

	public static IPlayerFactory createPlayerFactory(Level l) {
		switch(l) {
		case BEGINNER : return new BeginnerPlayerFactory();
		case INTERMEDIATE : return new IntermediatePlayerFactory();
		case ADVANCED : return new AdvancedPlayerFactory();
		default:	return null;
		}
	}

}
