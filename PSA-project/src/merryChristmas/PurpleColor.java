package merryChristmas;

public class PurpleColor implements Color {

	private String name;

	public PurpleColor() {
	}

	public PurpleColor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Color createColor(String name) {
		return new PurpleColor(name);
	}

}
