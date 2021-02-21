public class GameUtility {

	public enum Level {
		BEGINNER,
		INTERMIDIATE,
		ADVANCED;
	}

	public static IPlayerFactory createPlayerFactory(Level l) {
		switch(l) {
		case BEGINNER : return new BeginnerPlayerFactory();
		case INTERMIDIATE : return new IntermediatePlayerFactory();
		case ADVANCED : return new AdvancedPlayerFactory();
		default:	return null;
		}
	}

}
