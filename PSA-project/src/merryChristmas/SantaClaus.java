package merryChristmas;

public class SantaClaus {

	private static SantaClaus instance;

	private SantaClaus() {

	}

	public static SantaClaus getInstance() {
		if (instance == null) {
			instance = new SantaClaus();
		}
		return instance;
	}

	public String postMessage(String message) {

		System.out.println("Santa said: " + message);
		System.out.println("------------------------------------------");

		return message;
	}
}
